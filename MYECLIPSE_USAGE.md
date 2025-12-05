# Enhanced POJO Generator for MyEclipse IDE

This tool generates constraint-aware POJOs directly from your PostgreSQL database schema, designed specifically for MyEclipse IDE users.

## 🚀 Quick Start (MyEclipse)

### Step 1: Run the Generator
1. In MyEclipse, navigate to `src/main/java/com/example/pojo_generator/SimplePojoGenerator.java`
2. **Right-click** on the file
3. Select **"Run As" > "Java Application"**
4. The tool will automatically:
   - Connect to your PostgreSQL database
   - Analyze all your business tables (103 tables found)
   - Generate enhanced POJOs with constraint validation

### Step 2: Refresh and Use
1. **Refresh your project** (F5 or right-click project > Refresh)
2. Navigate to `src/main/java/com/example/model/enhanced/`
3. You'll find 103 generated POJOs with constraint enforcement

## 📁 Project Structure (Clean & Simple)

```
pojo-generator/
├── pom.xml                    (Only PostgreSQL driver dependency)
├── src/main/java/com/example/
│   ├── pojo_generator/        (Generator tools)
│   │   ├── SimplePojoGenerator.java      (Main class - run this!)
│   │   ├── DatabaseConstraintExtractor.java
│   │   └── ConstraintAwarePojoGenerator.java
│   └── model/enhanced/        (Generated POJOs appear here)
└── MYECLIPSE_USAGE.md         (This file)
```

## ⚙️ Configuration

### Database Connection
Edit `SimplePojoGenerator.java` if needed:
```java
private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/qa_";
private static final String USERNAME = "postgres";
private static final String PASSWORD = "postgres";
```

### Output Location
Generated POJOs go to:
- **Package:** `com.example.model.enhanced`
- **Directory:** `src/main/java/com/example/model/enhanced/`

## 🎯 What You Get

### Enhanced POJOs with:
- **Constraint validation** based on your database DDL
- **NOT NULL enforcement** using primitive types (`long`, `boolean`)
- **String length validation** from VARCHAR constraints
- **Fail-fast error handling** - catch issues before database calls
- **Built-in validation methods** (`validate()` and `isValid()`)
- **Full MyBatis compatibility** - use as drop-in replacements

### Example Generated POJO:
```java
public class Users {
    private long id;              // NOT NULL -> primitive type
    private String email;         // Nullable -> wrapper type
    private boolean archived;     // NOT NULL -> primitive type
    
    public void setEmail(String email) {
        if (email != null && email.length() > 255) {
            throw new ConstraintViolationException("email exceeds maximum length of 255");
        }
        this.email = email;
    }
    
    public List<String> validate() {
        // Returns list of validation errors
    }
    
    public boolean isValid() {
        return validate().isEmpty();
    }
}
```

## 🔄 Regenerating POJOs

When your database schema changes:
1. Run `SimplePojoGenerator.java` again
2. Refresh your project (F5)
3. Updated POJOs will reflect new constraints

## 💡 MyEclipse Tips

### Running the Generator:
- **Method 1:** Right-click `SimplePojoGenerator.java` > "Run As" > "Java Application"
- **Method 2:** Open file and press `Ctrl+F11`
- **Method 3:** Use Run menu > "Run As" > "Java Application"

### Viewing Generated Files:
- Use Package Explorer to browse `com.example.model.enhanced`
- Double-click any POJO to view the generated code
- Notice the constraint validation in setter methods

### Integration:
- Import generated POJOs: `import com.example.model.enhanced.Users;`
- Use with existing MyBatis mappers without changes
- Replace existing POJOs gradually or use alongside them

## 🛠️ Dependencies

**Minimal setup - only one dependency:**
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.6.0</version>
</dependency>
```

No MyBatis Generator, no complex plugins - just pure Java and PostgreSQL JDBC!

## ✅ Benefits for MyEclipse Users

1. **No external plugins required** - runs with standard MyEclipse
2. **Simple Maven project** - no complex build configurations
3. **Direct Java execution** - familiar MyEclipse workflow
4. **Instant feedback** - see results immediately in Package Explorer
5. **Full IDE integration** - autocomplete, debugging, refactoring all work
6. **Database-driven** - POJOs always match your actual schema

## 🔍 Troubleshooting

### Database Connection Issues:
- Ensure PostgreSQL is running
- Check connection details in `SimplePojoGenerator.java`
- Verify database name, username, and password

### No POJOs Generated:
- Check console output for errors
- Ensure you have business tables (not just system tables)
- Refresh project after generation

### Compilation Errors:
- Refresh project (F5)
- Clean and rebuild if needed
- Check that PostgreSQL dependency is resolved

---

**Ready to use!** Just run `SimplePojoGenerator.java` from MyEclipse and start using your constraint-aware POJOs immediately.
