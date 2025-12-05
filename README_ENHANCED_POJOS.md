# Enhanced POJO Generator with Database Constraint Enforcement

This project extends your existing MyBatis Generator setup to create **constraint-aware POJOs** that enforce database DDL constraints directly in Java code.

## What's New

### 🎯 **Constraint-Aware POJOs**
- **NOT NULL enforcement**: Uses primitive types (`int`, `long`, `boolean`) for NOT NULL columns, wrapper types for nullable
- **Length validation**: Automatic validation for VARCHAR/TEXT field lengths
- **Setter validation**: Constraint checks happen immediately when setting values
- **Validation methods**: Built-in `validate()` and `isValid()` methods
- **Fail-fast approach**: Catch constraint violations before hitting the database

### 🔧 **Key Components**

1. **DatabaseConstraintExtractor.java**
   - Connects to your PostgreSQL database
   - Extracts all constraint information from `information_schema`
   - Analyzes NOT NULL, CHECK, UNIQUE, PRIMARY KEY, and FOREIGN KEY constraints

2. **ConstraintAwarePojoGenerator.java**
   - Generates enhanced POJOs based on extracted constraints
   - Creates validation logic that mirrors your database constraints
   - Produces clean, plain Java POJOs (no JPA/Hibernate dependencies)

3. **ConstraintAnalyzer.java**
   - Utility to analyze your database schema
   - Shows detailed constraint information for your tables
   - Generates enhanced POJOs for all business tables

## Quick Start

### 1. Analyze Your Database Constraints

```bash
# Compile and run the constraint analyzer
mvn compile exec:java -Dexec.mainClass="com.example.pojo_generator.ConstraintAnalyzer"
```

This will:
- Connect to your PostgreSQL database (`qa_` database)
- Display detailed constraint analysis for your tables
- Generate enhanced POJOs in `src/main/java/com/example/model/enhanced/`

### 2. Compare Original vs Enhanced POJOs

**Original POJO (MyBatis Generated):**
```java
public class Actions {
    private Long id;           // Nullable wrapper type
    private String name;       // No validation
    
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
```

**Enhanced POJO (Constraint-Aware):**
```java
public class Actions {
    private long id;           // Primitive for NOT NULL PK
    private String name;       // With constraint validation
    
    public void setName(String name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        if (name.length() > 255) {  // Based on DB column definition
            throw new ConstraintViolationException("name cannot exceed 255 characters");
        }
        this.name = name.trim();
    }
    
    public List<String> validate() {
        List<String> errors = new ArrayList<>();
        if (name == null || name.trim().isEmpty()) {
            errors.add("name is required");
        }
        return errors;
    }
}
```

### 3. Using Enhanced POJOs

```java
// Fail-fast validation
Actions action = new Actions();
try {
    action.setName(null);  // Throws ConstraintViolationException immediately
} catch (Actions.ConstraintViolationException e) {
    System.out.println("Constraint violation: " + e.getMessage());
}

// Batch validation
Actions action2 = new Actions();
List<String> errors = action2.validate();
if (!errors.isEmpty()) {
    System.out.println("Validation errors: " + errors);
}

// Check if valid before database operations
if (action2.isValid()) {
    // Safe to insert/update in database
    actionsMapper.insert(action2);
}
```

## Configuration

### Database Connection
The tools use the same connection settings as your `generatorConfig.xml`:
- **URL**: `jdbc:postgresql://localhost:5432/qa_`
- **Username**: `postgres`
- **Password**: `postgres`

### Output Configuration
- **Package**: `com.example.model.enhanced`
- **Directory**: `src/main/java/com/example/model/enhanced/`

You can modify these in the `ConstraintAnalyzer.java` or `ConstraintAwarePojoGenerator.java` files.

## Features

### ✅ **Implemented Constraints**
- **NOT NULL**: Primitive types for required fields, null checks in setters
- **VARCHAR Length**: Automatic length validation based on column definitions
- **PRIMARY KEY**: Proper type mapping and documentation
- **FOREIGN KEY**: Documentation and relationship information
- **UNIQUE**: Documentation in class comments

### 🚧 **Planned Enhancements**
- **CHECK Constraints**: Custom validation logic generation
- **UNIQUE Constraints**: Runtime uniqueness validation
- **Custom Business Rules**: Extension points for additional validation
- **Batch Validation**: Optimized validation for collections

## Benefits

### 🚀 **Performance**
- **No ORM overhead**: Pure JDBC with MyBatis
- **Fail-fast validation**: Catch errors before database round-trips
- **Primitive types**: Better memory usage for NOT NULL fields

### 🛡️ **Data Integrity**
- **Database-driven validation**: Constraints come directly from your DDL
- **Consistent validation**: Same rules in Java as in database
- **Maintainable**: Regenerate POJOs when database schema changes

### 🔧 **Developer Experience**
- **Clear error messages**: Know exactly which constraint was violated
- **IDE support**: Full autocomplete and type safety
- **Documentation**: Generated classes include constraint information

## Integration with Existing Code

The enhanced POJOs are **fully compatible** with your existing MyBatis mappers and DAOs. You can:

1. **Drop-in replacement**: Use enhanced POJOs with existing mappers
2. **Gradual migration**: Replace POJOs table by table
3. **Side-by-side**: Keep both versions during transition

## Troubleshooting

### Database Connection Issues
```
Database connection error: Connection refused
```
**Solution**: Ensure PostgreSQL is running and accessible at `localhost:5432`

### Permission Issues
```
Permission denied for relation information_schema
```
**Solution**: Ensure the `postgres` user has sufficient privileges to read schema information

### Compilation Issues
```
Java feature 'Text Blocks' is only available with source level 15
```
**Solution**: The code has been updated to use Java 8+ compatible string concatenation

## Next Steps

1. **Run the analyzer** to see your database constraints
2. **Review generated POJOs** in the enhanced package
3. **Test with your existing code** to ensure compatibility
4. **Customize validation logic** for CHECK constraints as needed
5. **Integrate into your build process** for automatic regeneration

---

**Note**: This enhancement maintains your preference for plain POJOs with JDBC/MyBatis, avoiding JPA/Hibernate complexity while adding powerful constraint enforcement capabilities.
