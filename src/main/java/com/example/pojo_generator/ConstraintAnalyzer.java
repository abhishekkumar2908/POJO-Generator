package com.example.pojo_generator;

import com.example.pojo_generator.DatabaseConstraintExtractor.*;
import java.sql.SQLException;
import java.util.Map;

/**
 * Utility to analyze and display database constraints for your tables
 */
public class ConstraintAnalyzer {
    
    public static void main(String[] args) {
        try {
            // Use the same connection details from your generatorConfig.xml
            String jdbcUrl = "jdbc:postgresql://localhost:5432/qa_";
            String username = "postgres";
            String password = "postgres";
            
            DatabaseConstraintExtractor extractor = new DatabaseConstraintExtractor(jdbcUrl, username, password);
            
            System.out.println("=== DATABASE CONSTRAINT ANALYSIS ===\n");
            
            Map<String, TableConstraints> allConstraints = extractor.extractConstraints();
            
            System.out.println("Found " + allConstraints.size() + " business tables\n");
            
            // Display detailed analysis for first few tables
            int count = 0;
            for (TableConstraints tableConstraints : allConstraints.values()) {
                if (count >= 5) break; // Show only first 5 tables for demo
                
                analyzeTable(tableConstraints);
                count++;
            }
            
            System.out.println("\n=== GENERATING ENHANCED POJOS ===\n");
            
            // Generate enhanced POJOs
            ConstraintAwarePojoGenerator generator = new ConstraintAwarePojoGenerator(
                jdbcUrl, username, password, 
                "com.example.model.enhanced", 
                "src/main/java/com/example/model/enhanced"
            );
            
            generator.generatePojos();
            
        } catch (SQLException e) {
            System.err.println("Database connection error: " + e.getMessage());
            System.err.println("Make sure your PostgreSQL database is running and accessible");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static void analyzeTable(TableConstraints tableConstraints) {
        System.out.println("TABLE: " + tableConstraints.getTableName().toUpperCase());
        System.out.println("=" + "=".repeat(tableConstraints.getTableName().length() + 6));
        
        // Column information
        System.out.println("Columns (" + tableConstraints.getColumns().size() + "):");
        for (ColumnInfo column : tableConstraints.getColumns().values()) {
            System.out.printf("  %-20s %-15s", column.getColumnName(), column.getDataType());
            
            if (column.getMaxLength() != null) {
                System.out.printf(" (max: %d)", column.getMaxLength());
            }
            if (column.getPrecision() != null) {
                System.out.printf(" (precision: %d", column.getPrecision());
                if (column.getScale() != null) {
                    System.out.printf(", scale: %d", column.getScale());
                }
                System.out.print(")");
            }
            
            System.out.printf(" %s", column.isNullable() ? "NULL" : "NOT NULL");
            
            if (column.getDefaultValue() != null) {
                System.out.printf(" DEFAULT: %s", column.getDefaultValue());
            }
            
            System.out.println();
        }
        
        // Primary Key
        if (tableConstraints.getPrimaryKeyConstraint() != null) {
            System.out.println("\nPrimary Key:");
            System.out.println("  " + String.join(", ", tableConstraints.getPrimaryKeyConstraint().getColumns()));
        }
        
        // Foreign Keys
        if (!tableConstraints.getForeignKeyConstraints().isEmpty()) {
            System.out.println("\nForeign Keys:");
            for (ForeignKeyConstraint fk : tableConstraints.getForeignKeyConstraints()) {
                System.out.printf("  %s -> %s.%s\n", 
                    fk.getColumnName(), 
                    fk.getReferencedTable(), 
                    fk.getReferencedColumn());
            }
        }
        
        // Unique Constraints
        if (!tableConstraints.getUniqueConstraints().isEmpty()) {
            System.out.println("\nUnique Constraints:");
            for (UniqueConstraint uc : tableConstraints.getUniqueConstraints()) {
                System.out.println("  " + String.join(", ", uc.getColumns()));
            }
        }
        
        // Check Constraints
        if (!tableConstraints.getCheckConstraints().isEmpty()) {
            System.out.println("\nCheck Constraints:");
            for (CheckConstraint cc : tableConstraints.getCheckConstraints()) {
                System.out.println("  " + cc.getConstraintName() + ": " + cc.getCheckClause());
            }
        }
        
        // NOT NULL columns summary
        if (!tableConstraints.getNotNullColumns().isEmpty()) {
            System.out.println("\nRequired Fields (NOT NULL): " + 
                String.join(", ", tableConstraints.getNotNullColumns()));
        }
        
        System.out.println("\n" + "-".repeat(50) + "\n");
    }
}
