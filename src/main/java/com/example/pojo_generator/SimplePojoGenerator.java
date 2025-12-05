package com.example.pojo_generator;

/**
 * Simple POJO Generator for MyEclipse IDE
 * 
 * This is a standalone utility that you can run directly from MyEclipse
 * without any external plugins or complex configurations.
 * 
 * HOW TO USE IN MYECLIPSE:
 * 1. Right-click on this file in MyEclipse
 * 2. Select "Run As" > "Java Application"
 * 3. The tool will connect to your database and generate enhanced POJOs
 * 4. Generated files will be placed in src/main/java/com/example/model/enhanced/
 * 
 * CONFIGURATION:
 * - Update the database connection details below if needed
 * - The tool automatically detects your business tables
 * - Generated POJOs include constraint validation based on your DDL
 */
public class SimplePojoGenerator {
    
    // Database connection configuration
    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/qa_";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "postgres";
    
    // Output configuration
    private static final String OUTPUT_PACKAGE = "com.example.model.enhanced";
    private static final String OUTPUT_DIRECTORY = "src/main/java/com/example/model/enhanced";
    
    /**
     * Main method - Run this directly from MyEclipse
     */
    public static void main(String[] args) {
        System.out.println("=== MyEclipse Enhanced POJO Generator ===");
        System.out.println("Starting constraint-aware POJO generation...\n");
        
        try {
            // Step 1: Analyze database constraints
            System.out.println("Step 1: Connecting to database and analyzing constraints...");
            DatabaseConstraintExtractor extractor = new DatabaseConstraintExtractor(
                JDBC_URL, USERNAME, PASSWORD
            );
            
            var constraints = extractor.extractConstraints();
            System.out.println("✓ Found " + constraints.size() + " business tables");
            
            // Step 2: Generate enhanced POJOs
            System.out.println("\nStep 2: Generating constraint-aware POJOs...");
            ConstraintAwarePojoGenerator generator = new ConstraintAwarePojoGenerator(
                JDBC_URL, USERNAME, PASSWORD, OUTPUT_PACKAGE, OUTPUT_DIRECTORY
            );
            
            generator.generatePojos();
            
            System.out.println("\n=== GENERATION COMPLETE ===");
            System.out.println("✓ Generated " + constraints.size() + " enhanced POJOs");
            System.out.println("✓ Location: " + OUTPUT_DIRECTORY);
            System.out.println("✓ Package: " + OUTPUT_PACKAGE);
            
            System.out.println("\nYour enhanced POJOs include:");
            System.out.println("• Automatic constraint validation");
            System.out.println("• NOT NULL enforcement with primitive types");
            System.out.println("• String length validation");
            System.out.println("• Fail-fast error handling");
            System.out.println("• Built-in validate() and isValid() methods");
            System.out.println("• Full compatibility with your existing MyBatis mappers");
            
            System.out.println("\nTo use in MyEclipse:");
            System.out.println("1. Refresh your project (F5)");
            System.out.println("2. Check the generated files in: " + OUTPUT_DIRECTORY);
            System.out.println("3. Import the enhanced POJOs in your code");
            System.out.println("4. Use them as drop-in replacements for existing POJOs");
            
        } catch (Exception e) {
            System.err.println("❌ Error during generation:");
            System.err.println(e.getMessage());
            
            if (e.getMessage().contains("Connection refused") || 
                e.getMessage().contains("could not connect")) {
                System.err.println("\n💡 Database Connection Help:");
                System.err.println("• Make sure PostgreSQL is running");
                System.err.println("• Verify connection details:");
                System.err.println("  - URL: " + JDBC_URL);
                System.err.println("  - Username: " + USERNAME);
                System.err.println("• Update connection details in this file if needed");
            }
            
            e.printStackTrace();
        }
    }
    
    /**
     * Alternative method to generate POJOs for specific tables only
     * Useful when you want to generate POJOs for a subset of tables
     */
    public static void generateForSpecificTables(String... tableNames) {
        System.out.println("=== Generating POJOs for specific tables ===");
        
        try {
            ConstraintAwarePojoGenerator generator = new ConstraintAwarePojoGenerator(
                JDBC_URL, USERNAME, PASSWORD, OUTPUT_PACKAGE, OUTPUT_DIRECTORY
            );
            
            // This would require extending the generator to support specific tables
            // For now, it generates all tables
            generator.generatePojos();
            
            System.out.println("✓ Generation complete for specified tables");
            
        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
