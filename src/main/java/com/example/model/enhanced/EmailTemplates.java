package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: email_templates
 * Generated with database constraint enforcement
 * Unique Constraints: id; name; 
 */
public class EmailTemplates {

    // Fields
    private boolean archived;
    private Object name;
    private long id;
    private String content;

    // Constructors
    public EmailTemplates() {
    }

    // Constructor with required fields
    public EmailTemplates(boolean archived, Object name, long id, String content) {
        this.archived = archived;
        this.name = name;
        this.id = id;
        this.content = content;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (content == null) {
            throw new ConstraintViolationException("content cannot be null");
        }
        this.content = content == null ? null : content.trim();
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (name == null) {
            errors.add("name is required");
        }
        if (content == null) {
            errors.add("content is required");
        }
        if (content != null && content.trim().isEmpty()) {
            errors.add("content cannot be empty");
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
