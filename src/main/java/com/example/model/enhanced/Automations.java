package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: automations
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Automations {

    // Fields
    private Object actionDetails;
    private Boolean archived;
    private Object actionType;
    private Object triggerType;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private Object type;
    private long modifiedAt;
    private Object targetEntityType;
    private Object triggerDetails;
    private long createdBy;

    // Constructors
    public Automations() {
    }

    // Constructor with required fields
    public Automations(Object actionDetails, Object actionType, Object triggerType, long modifiedBy, long createdAt, long id, Object type, long modifiedAt, Object targetEntityType, Object triggerDetails, long createdBy) {
        this.actionDetails = actionDetails;
        this.actionType = actionType;
        this.triggerType = triggerType;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.type = type;
        this.modifiedAt = modifiedAt;
        this.targetEntityType = targetEntityType;
        this.triggerDetails = triggerDetails;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Object getActionDetails() {
        return actionDetails;
    }

    public void setActionDetails(Object actionDetails) {
        if (actionDetails == null) {
            throw new ConstraintViolationException("action_details cannot be null");
        }
        this.actionDetails = actionDetails;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Object getActionType() {
        return actionType;
    }

    public void setActionType(Object actionType) {
        if (actionType == null) {
            throw new ConstraintViolationException("action_type cannot be null");
        }
        this.actionType = actionType;
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

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        if (type == null) {
            throw new ConstraintViolationException("type cannot be null");
        }
        this.type = type;
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

    public Object getTriggerDetails() {
        return triggerDetails;
    }

    public void setTriggerDetails(Object triggerDetails) {
        if (triggerDetails == null) {
            throw new ConstraintViolationException("trigger_details cannot be null");
        }
        this.triggerDetails = triggerDetails;
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

        if (actionDetails == null) {
            errors.add("action_details is required");
        }
        if (actionType == null) {
            errors.add("action_type is required");
        }
        if (triggerType == null) {
            errors.add("trigger_type is required");
        }
        if (type == null) {
            errors.add("type is required");
        }
        if (targetEntityType == null) {
            errors.add("target_entity_type is required");
        }
        if (triggerDetails == null) {
            errors.add("trigger_details is required");
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
