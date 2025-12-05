package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: organisations
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Organisations {

    // Fields
    private boolean archived;
    private boolean isMaster;
    private String fqdn;
    private Object name;
    private Long modifiedBy;
    private long createdAt;
    private long id;
    private long modifiedAt;
    private Long createdBy;

    // Constructors
    public Organisations() {
    }

    // Constructor with required fields
    public Organisations(boolean archived, boolean isMaster, String fqdn, Object name, long createdAt, long id, long modifiedAt) {
        this.archived = archived;
        this.isMaster = isMaster;
        this.fqdn = fqdn;
        this.name = name;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(boolean isMaster) {
        this.isMaster = isMaster;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        if (fqdn == null) {
            throw new ConstraintViolationException("fqdn cannot be null");
        }
        this.fqdn = fqdn == null ? null : fqdn.trim();
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

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (fqdn == null) {
            errors.add("fqdn is required");
        }
        if (fqdn != null && fqdn.trim().isEmpty()) {
            errors.add("fqdn cannot be empty");
        }
        if (name == null) {
            errors.add("name is required");
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
