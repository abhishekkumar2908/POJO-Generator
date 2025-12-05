package com.example.pojo_generator;

import com.example.pojo_generator.DatabaseConstraintExtractor.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Generates constraint-aware POJOs based on database schema constraints
 */
public class ConstraintAwarePojoGenerator {
    
    private final DatabaseConstraintExtractor constraintExtractor;
    private final String outputPackage;
    private final String outputDirectory;
    
    public ConstraintAwarePojoGenerator(String jdbcUrl, String username, String password, 
                                      String outputPackage, String outputDirectory) {
        this.constraintExtractor = new DatabaseConstraintExtractor(jdbcUrl, username, password);
        this.outputPackage = outputPackage;
        this.outputDirectory = outputDirectory;
    }
    
    /**
     * Generate constraint-aware POJOs for all business tables
     */
    public void generatePojos() throws SQLException, IOException {
        Map<String, TableConstraints> allConstraints = constraintExtractor.extractConstraints();
        
        // Create output directory if it doesn't exist
        File outputDir = new File(outputDirectory);
        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }
        
        for (TableConstraints tableConstraints : allConstraints.values()) {
            generatePojoForTable(tableConstraints);
        }
        
        System.out.println("Generated " + allConstraints.size() + " constraint-aware POJOs");
    }
    
    private void generatePojoForTable(TableConstraints tableConstraints) throws IOException {
        String className = toCamelCase(tableConstraints.getTableName(), true);
        String fileName = className + ".java";
        File outputFile = new File(outputDirectory, fileName);
        
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(generatePojoContent(tableConstraints, className));
        }
        
        System.out.println("Generated: " + fileName);
    }
    
    private String generatePojoContent(TableConstraints tableConstraints, String className) {
        StringBuilder sb = new StringBuilder();
        
        // Package declaration
        sb.append("package ").append(outputPackage).append(";\n\n");
        
        // Imports
        sb.append("import java.math.BigDecimal;\n");
        sb.append("import java.sql.Timestamp;\n");
        sb.append("import java.util.ArrayList;\n");
        sb.append("import java.util.List;\n\n");
        
        // Class declaration with constraint information
        sb.append("/**\n");
        sb.append(" * Constraint-aware POJO for table: ").append(tableConstraints.getTableName()).append("\n");
        sb.append(" * Generated with database constraint enforcement\n");
        if (tableConstraints.getPrimaryKeyConstraint() != null) {
            sb.append(" * Primary Key: ").append(String.join(", ", tableConstraints.getPrimaryKeyConstraint().getColumns())).append("\n");
        }
        if (!tableConstraints.getUniqueConstraints().isEmpty()) {
            sb.append(" * Unique Constraints: ");
            for (UniqueConstraint uc : tableConstraints.getUniqueConstraints()) {
                sb.append(String.join(", ", uc.getColumns())).append("; ");
            }
            sb.append("\n");
        }
        sb.append(" */\n");
        sb.append("public class ").append(className).append(" {\n\n");
        
        // Generate fields
        generateFields(sb, tableConstraints);
        
        // Generate constructors
        generateConstructors(sb, className, tableConstraints);
        
        // Generate getters and setters with constraint validation
        generateGettersAndSetters(sb, tableConstraints);
        
        // Generate validation method
        generateValidationMethod(sb, tableConstraints);
        
        // Generate constraint violation exception classes
        generateConstraintExceptions(sb);
        
        sb.append("}\n");
        
        return sb.toString();
    }
    
    private void generateFields(StringBuilder sb, TableConstraints tableConstraints) {
        sb.append("    // Fields\n");
        
        for (ColumnInfo column : tableConstraints.getColumns().values()) {
            String fieldName = toCamelCase(column.getColumnName(), false);
            String javaType = getJavaType(column, tableConstraints.getNotNullColumns().contains(column.getColumnName()));
            
            sb.append("    private ").append(javaType).append(" ").append(fieldName).append(";\n");
        }
        sb.append("\n");
    }
    
    private void generateConstructors(StringBuilder sb, String className, TableConstraints tableConstraints) {
        // Default constructor
        sb.append("    // Constructors\n");
        sb.append("    public ").append(className).append("() {\n");
        sb.append("    }\n\n");
        
        // Constructor with required fields (NOT NULL columns)
        List<ColumnInfo> requiredColumns = new ArrayList<>();
        for (ColumnInfo column : tableConstraints.getColumns().values()) {
            if (tableConstraints.getNotNullColumns().contains(column.getColumnName())) {
                requiredColumns.add(column);
            }
        }
        
        if (!requiredColumns.isEmpty()) {
            sb.append("    // Constructor with required fields\n");
            sb.append("    public ").append(className).append("(");
            
            for (int i = 0; i < requiredColumns.size(); i++) {
                ColumnInfo column = requiredColumns.get(i);
                String fieldName = toCamelCase(column.getColumnName(), false);
                String javaType = getJavaType(column, true);
                
                if (i > 0) sb.append(", ");
                sb.append(javaType).append(" ").append(fieldName);
            }
            
            sb.append(") {\n");
            
            for (ColumnInfo column : requiredColumns) {
                String fieldName = toCamelCase(column.getColumnName(), false);
                sb.append("        this.").append(fieldName).append(" = ").append(fieldName).append(";\n");
            }
            
            sb.append("    }\n\n");
        }
    }
    
    private void generateGettersAndSetters(StringBuilder sb, TableConstraints tableConstraints) {
        sb.append("    // Getters and Setters with constraint validation\n");
        
        for (ColumnInfo column : tableConstraints.getColumns().values()) {
            String fieldName = toCamelCase(column.getColumnName(), false);
            String methodName = toCamelCase(column.getColumnName(), true);
            String javaType = getJavaType(column, tableConstraints.getNotNullColumns().contains(column.getColumnName()));
            boolean isNotNull = tableConstraints.getNotNullColumns().contains(column.getColumnName());
            
            // Getter
            sb.append("    public ").append(javaType).append(" get").append(methodName).append("() {\n");
            sb.append("        return ").append(fieldName).append(";\n");
            sb.append("    }\n\n");
            
            // Setter with validation
            sb.append("    public void set").append(methodName).append("(").append(javaType).append(" ").append(fieldName).append(") {\n");
            
            // NOT NULL validation
            if (isNotNull && !isPrimitive(javaType)) {
                sb.append("        if (").append(fieldName).append(" == null) {\n");
                sb.append("            throw new ConstraintViolationException(\"").append(column.getColumnName()).append(" cannot be null\");\n");
                sb.append("        }\n");
            }
            
            // String length validation
            if ("String".equals(javaType) && column.getMaxLength() != null) {
                sb.append("        if (").append(fieldName).append(" != null && ").append(fieldName).append(".length() > ").append(column.getMaxLength()).append(") {\n");
                sb.append("            throw new ConstraintViolationException(\"").append(column.getColumnName()).append(" cannot exceed ").append(column.getMaxLength()).append(" characters\");\n");
                sb.append("        }\n");
            }
            
            // String trimming for non-null strings
            if ("String".equals(javaType)) {
                sb.append("        this.").append(fieldName).append(" = ").append(fieldName).append(" == null ? null : ").append(fieldName).append(".trim();\n");
            } else {
                sb.append("        this.").append(fieldName).append(" = ").append(fieldName).append(";\n");
            }
            
            sb.append("    }\n\n");
        }
    }
    
    private void generateValidationMethod(StringBuilder sb, TableConstraints tableConstraints) {
        sb.append("    // Validation methods\n");
        sb.append("    public List<String> validate() {\n");
        sb.append("        List<String> errors = new ArrayList<>();\n\n");
        
        // NOT NULL validations
        for (String columnName : tableConstraints.getNotNullColumns()) {
            ColumnInfo column = tableConstraints.getColumns().get(columnName);
            if (column != null) {
                String fieldName = toCamelCase(columnName, false);
                String javaType = getJavaType(column, true);
                
                if (!isPrimitive(javaType)) {
                    sb.append("        if (").append(fieldName).append(" == null) {\n");
                    sb.append("            errors.add(\"").append(columnName).append(" is required\");\n");
                    sb.append("        }\n");
                }
                
                // Additional string validations
                if ("String".equals(javaType)) {
                    sb.append("        if (").append(fieldName).append(" != null && ").append(fieldName).append(".trim().isEmpty()) {\n");
                    sb.append("            errors.add(\"").append(columnName).append(" cannot be empty\");\n");
                    sb.append("        }\n");
                }
            }
        }
        
        // Length validations
        for (ColumnInfo column : tableConstraints.getColumns().values()) {
            if ("String".equals(getJavaType(column, false)) && column.getMaxLength() != null) {
                String fieldName = toCamelCase(column.getColumnName(), false);
                sb.append("        if (").append(fieldName).append(" != null && ").append(fieldName).append(".length() > ").append(column.getMaxLength()).append(") {\n");
                sb.append("            errors.add(\"").append(column.getColumnName()).append(" cannot exceed ").append(column.getMaxLength()).append(" characters\");\n");
                sb.append("        }\n");
            }
        }
        
        // CHECK constraint validations (basic implementation)
        for (CheckConstraint checkConstraint : tableConstraints.getCheckConstraints()) {
            sb.append("        // CHECK constraint: ").append(checkConstraint.getConstraintName()).append("\n");
            sb.append("        // ").append(checkConstraint.getCheckClause()).append("\n");
            sb.append("        // TODO: Implement custom validation logic for this constraint\n\n");
        }
        
        sb.append("        return errors;\n");
        sb.append("    }\n\n");
        
        sb.append("    public boolean isValid() {\n");
        sb.append("        return validate().isEmpty();\n");
        sb.append("    }\n\n");
    }
    
    private void generateConstraintExceptions(StringBuilder sb) {
        sb.append("    // Constraint violation exception\n");
        sb.append("    public static class ConstraintViolationException extends RuntimeException {\n");
        sb.append("        public ConstraintViolationException(String message) {\n");
        sb.append("            super(message);\n");
        sb.append("        }\n");
        sb.append("    }\n\n");
    }
    
    private String getJavaType(ColumnInfo column, boolean isNotNull) {
        String dataType = column.getDataType().toLowerCase();
        
        switch (dataType) {
            case "bigint":
                return isNotNull ? "long" : "Long";
            case "integer":
            case "int4":
                return isNotNull ? "int" : "Integer";
            case "smallint":
            case "int2":
                return isNotNull ? "short" : "Short";
            case "boolean":
            case "bool":
                return isNotNull ? "boolean" : "Boolean";
            case "varchar":
            case "text":
            case "char":
            case "character":
                return "String";
            case "decimal":
            case "numeric":
                return "BigDecimal";
            case "real":
                return isNotNull ? "float" : "Float";
            case "double precision":
                return isNotNull ? "double" : "Double";
            case "timestamp":
            case "timestamptz":
                return "Timestamp";
            case "date":
                return "java.sql.Date";
            case "time":
                return "java.sql.Time";
            case "bytea":
                return "byte[]";
            default:
                return "Object"; // fallback for unknown types
        }
    }
    
    private boolean isPrimitive(String javaType) {
        return Arrays.asList("int", "long", "short", "boolean", "float", "double", "byte", "char").contains(javaType);
    }
    
    private String toCamelCase(String input, boolean capitalizeFirst) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        String[] parts = input.split("_");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i].toLowerCase();
            if (i == 0 && !capitalizeFirst) {
                result.append(part);
            } else {
                result.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    result.append(part.substring(1));
                }
            }
        }
        
        return result.toString();
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        try {
            String jdbcUrl = "jdbc:postgresql://localhost:5432/qa_";
            String username = "postgres";
            String password = "postgres";
            String outputPackage = "com.example.model.enhanced";
            String outputDirectory = "src/main/java/com/example/model/enhanced";
            
            ConstraintAwarePojoGenerator generator = new ConstraintAwarePojoGenerator(
                jdbcUrl, username, password, outputPackage, outputDirectory
            );
            
            generator.generatePojos();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
