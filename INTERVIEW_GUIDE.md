# POJO Generator - Interview Preparation Guide

## Project Overview

**What is it?**
A code generation tool that creates constraint-aware Java POJOs from PostgreSQL database schemas.

**Problem Solved:**
Eliminates inconsistency between database constraints and application-level validation by auto-generating Java classes that enforce DB constraints at the application layer.

**Tech Stack:** Java 11, PostgreSQL JDBC, Maven

---

## Key Technical Concepts

### 1. Database Schema Introspection
- Uses PostgreSQL's `information_schema` to extract table metadata
- Queries: `information_schema.columns`, `information_schema.table_constraints`, `information_schema.constraint_column_usage`

### 2. Constraint Types Handled
| Constraint | Implementation |
|------------|----------------|
| NOT NULL | Primitive types + null check in setters |
| VARCHAR(n) | String length validation |
| CHECK | Custom validation logic |
| PRIMARY KEY | Field identification |
| FOREIGN KEY | Documentation in Javadoc |
| UNIQUE | Validation method |

### 3. Type Mapping Strategy
```
SQL Type        → Java Type (NOT NULL) → Java Type (Nullable)
bigint          → long                 → Long
integer         → int                  → Integer
varchar/text    → String               → String
boolean         → boolean              → Boolean
numeric/decimal → BigDecimal           → BigDecimal
timestamp       → Timestamp            → Timestamp
bytea           → byte[]               → byte[]
```

### 4. Code Generation Pattern
```
Database Schema → Extract Metadata → Build Java Source → Write .java Files
```

---

## Common Interview Questions & Answers

### Q1: Why did you build this project?
**Answer:**
"In enterprise applications using plain JDBC/MyBatis, there's often a mismatch between database constraints and Java validation. I built this tool to auto-generate POJOs that enforce database constraints at the application level, implementing a fail-fast validation pattern that catches errors before hitting the database."

### Q2: How do you extract database schema information?
**Answer:**
"I query PostgreSQL's `information_schema` views using JDBC. Specifically:
- `information_schema.columns` for column metadata (type, nullable, max_length)
- `information_schema.table_constraints` for constraint types (PK, FK, UNIQUE, CHECK)
- `information_schema.key_column_usage` for constraint-column mappings

I use PreparedStatements to prevent SQL injection."

### Q3: How do you handle NULL vs NOT NULL columns?
**Answer:**
"For NOT NULL columns, I use primitive types (long, int, boolean) which can't be null. For nullable columns, I use wrapper types (Long, Integer, Boolean). This provides compile-time safety - you can't accidentally pass null to a required field."

### Q4: Explain the validation strategy.
**Answer:**
"I implemented multi-level validation:
1. **Setter-level (immediate):** Throws `ConstraintViolationException` on invalid input
2. **Batch validation:** `validate()` returns List<String> of all errors
3. **Pre-persistence check:** `isValid()` boolean for conditional logic

This fail-fast approach catches issues early without database round-trips."

### Q5: How do you generate Java code programmatically?
**Answer:**
"I use StringBuilder to construct valid Java source code:
1. Generate package/import declarations
2. Add Javadoc with constraint documentation
3. Generate fields with computed types based on nullability
4. Create constructors (default + parameterized with required fields)
5. Generate getters/setters with embedded validation
6. Write to .java files using FileWriter with try-with-resources"

### Q6: What design patterns did you use?
**Answer:**
- **Builder Pattern:** For constructing complex SQL queries
- **Template Method:** Standard generation workflow with customizable steps
- **Strategy Pattern:** Different type mappers for different SQL types
- **Factory Pattern:** Creating appropriate Java types based on SQL metadata

### Q7: How do you convert database naming to Java naming conventions?
**Answer:**
"I convert snake_case to camelCase:
```java
user_name → userName
created_at → createdAt
```
I split by underscore, capitalize each word except the first, then join."

### Q8: What challenges did you face?
**Answer:**
1. **Composite keys:** Handled by tracking multi-column constraints
2. **Circular FK references:** Documented in Javadoc instead of generating circular dependencies
3. **Custom CHECK constraints:** Parsed constraint expressions to generate validation logic
4. **System tables:** Filtered out pg_*, information_schema tables

### Q9: Why not use an ORM like Hibernate?
**Answer:**
"This tool is for teams that prefer plain JDBC/MyBatis for performance reasons or simpler debugging. ORMs add overhead and complexity. This gives you type-safe POJOs with validation without the ORM magic - you control the SQL."

### Q10: How would you extend this project?
**Answer:**
- Add support for MySQL/Oracle information schemas
- Generate Builder pattern classes
- Add JPA annotations option
- Generate repository/DAO classes
- Support custom validation annotations (JSR-380)

---

## Key Talking Points

1. **Schema-Driven Development:** "The database schema is the single source of truth for constraints"

2. **Fail-Fast Validation:** "Catch errors at the application layer before expensive DB calls"

3. **Type Safety:** "Primitives for NOT NULL = compile-time null safety"

4. **Zero Runtime Dependencies:** "Only PostgreSQL JDBC driver - no reflection overhead"

5. **100+ POJOs Generated:** "Tested with enterprise-scale schemas"

---

## Code Snippets to Remember

### Schema Extraction Query
```sql
SELECT column_name, data_type, is_nullable, character_maximum_length
FROM information_schema.columns
WHERE table_schema = 'public' AND table_name = ?
```

### Type Mapping Logic
```java
private String mapToJavaType(String sqlType, boolean notNull) {
    return switch (sqlType.toLowerCase()) {
        case "bigint" -> notNull ? "long" : "Long";
        case "integer" -> notNull ? "int" : "Integer";
        case "boolean" -> notNull ? "boolean" : "Boolean";
        case "varchar", "text" -> "String";
        case "numeric", "decimal" -> "BigDecimal";
        default -> "Object";
    };
}
```

### Generated Setter with Validation
```java
public void setName(String name) {
    if (name == null) {
        throw new ConstraintViolationException("name cannot be null");
    }
    if (name.length() > 255) {
        throw new ConstraintViolationException("name exceeds max length 255");
    }
    this.name = name.trim();
}
```

---

## Quick Stats for Interview
- **Lines of Code:** ~500 lines core logic
- **Tables Supported:** 100+ in testing
- **Constraints Handled:** NOT NULL, CHECK, UNIQUE, PK, FK
- **Dependencies:** 1 (PostgreSQL JDBC)
- **Java Version:** 11+

---

## Related Topics to Study
- JDBC Connection pooling (HikariCP)
- PreparedStatement vs Statement
- information_schema in PostgreSQL
- Java code generation alternatives (JavaPoet, JCodeModel)
- Bean Validation (JSR-380)
- MyBatis vs Hibernate trade-offs
