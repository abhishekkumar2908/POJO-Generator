package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: process_permissions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ProcessPermissions {

    // Fields
    private String description;
    private long id;
    private Object type;

    // Constructors
    public ProcessPermissions() {
    }

    // Constructor with required fields
    public ProcessPermissions(long id, Object type) {
        this.id = id;
        this.type = type;
    }

    // Getters and Setters with constraint validation
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        if (type == null) {
            throw new ConstraintViolationException("type cannot be null");
        }
        this.type = type;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (type == null) {
            errors.add("type is required");
        }
        return errors;
    }

    public boolean isValid() {
        return validate().isEmpty();
    }

    // Constraint violation exception
    public static class ConstraintViolationException extends RuntimeException {
        public ConstraintViolationException(String message) {
            super(message);
        }
    }

}
