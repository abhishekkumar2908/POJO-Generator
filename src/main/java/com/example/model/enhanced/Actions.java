package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: actions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Actions {

    // Fields
    private Object code;
    private Object triggerType;
    private String description;
    private long createdAt;
    private String failureMessage;
    private long createdBy;
    private Boolean archived;
    private String successMessage;
    private String name;
    private long modifiedBy;
    private long checklistsId;
    private long triggerEntityId;
    private long id;
    private long modifiedAt;

    // Constructors
    public Actions() {
    }

    // Constructor with required fields
    public Actions(Object code, Object triggerType, long createdAt, long createdBy, String name, long modifiedBy, long checklistsId, long triggerEntityId, long id, long modifiedAt) {
        this.code = code;
        this.triggerType = triggerType;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.checklistsId = checklistsId;
        this.triggerEntityId = triggerEntityId;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        if (code == null) {
            throw new ConstraintViolationException("code cannot be null");
        }
        this.code = code;
    }

    public Object getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(Object triggerType) {
        if (triggerType == null) {
            throw new ConstraintViolationException("trigger_type cannot be null");
        }
        this.triggerType = triggerType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage == null ? null : failureMessage.trim();
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage == null ? null : successMessage.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name == null ? null : name.trim();
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public long getTriggerEntityId() {
        return triggerEntityId;
    }

    public void setTriggerEntityId(long triggerEntityId) {
        this.triggerEntityId = triggerEntityId;
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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (code == null) {
            errors.add("code is required");
        }
        if (triggerType == null) {
            errors.add("trigger_type is required");
        }
        if (name == null) {
            errors.add("name is required");
        }
        if (name != null && name.trim().isEmpty()) {
            errors.add("name cannot be empty");
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
