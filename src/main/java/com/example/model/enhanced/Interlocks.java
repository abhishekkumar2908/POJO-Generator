package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: interlocks
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Interlocks {

    // Fields
    private long targetEntityId;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private Object validations;
    private long modifiedAt;
    private Object targetEntityType;
    private long createdBy;

    // Constructors
    public Interlocks() {
    }

    // Constructor with required fields
    public Interlocks(long targetEntityId, long modifiedBy, long createdAt, long id, long modifiedAt, Object targetEntityType, long createdBy) {
        this.targetEntityId = targetEntityId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.targetEntityType = targetEntityType;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getTargetEntityId() {
        return targetEntityId;
    }

    public void setTargetEntityId(long targetEntityId) {
        this.targetEntityId = targetEntityId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
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

    public Object getValidations() {
        return validations;
    }

    public void setValidations(Object validations) {
        this.validations = validations;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Object getTargetEntityType() {
        return targetEntityType;
    }

    public void setTargetEntityType(Object targetEntityType) {
        if (targetEntityType == null) {
            throw new ConstraintViolationException("target_entity_type cannot be null");
        }
        this.targetEntityType = targetEntityType;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (targetEntityType == null) {
            errors.add("target_entity_type is required");
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
