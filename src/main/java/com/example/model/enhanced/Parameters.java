package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: parameters
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Parameters {

    // Fields
    private Object metadata;
    private Object data;
    private Boolean hidden;
    private long createdAt;
    private String description;
    private boolean isMandatory;
    private Object rules;
    private Object verificationType;
    private String label;
    private Object type;
    private long createdBy;
    private Object targetEntityType;
    private Boolean isAutoInitialized;
    private Object autoInitialize;
    private boolean archived;
    private Long tasksId;
    private long modifiedBy;
    private long checklistsId;
    private int orderTree;
    private long id;
    private Object validations;
    private long modifiedAt;

    // Constructors
    public Parameters() {
    }

    // Constructor with required fields
    public Parameters(Object data, long createdAt, boolean isMandatory, Object verificationType, Object type, long createdBy, Object targetEntityType, boolean archived, long modifiedBy, long checklistsId, int orderTree, long id, Object validations, long modifiedAt) {
        this.data = data;
        this.createdAt = createdAt;
        this.isMandatory = isMandatory;
        this.verificationType = verificationType;
        this.type = type;
        this.createdBy = createdBy;
        this.targetEntityType = targetEntityType;
        this.archived = archived;
        this.modifiedBy = modifiedBy;
        this.checklistsId = checklistsId;
        this.orderTree = orderTree;
        this.id = id;
        this.validations = validations;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        if (data == null) {
            throw new ConstraintViolationException("data cannot be null");
        }
        this.data = data;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Object getRules() {
        return rules;
    }

    public void setRules(Object rules) {
        this.rules = rules;
    }

    public Object getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Object verificationType) {
        if (verificationType == null) {
            throw new ConstraintViolationException("verification_type cannot be null");
        }
        this.verificationType = verificationType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
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

    public Boolean getIsAutoInitialized() {
        return isAutoInitialized;
    }

    public void setIsAutoInitialized(Boolean isAutoInitialized) {
        this.isAutoInitialized = isAutoInitialized;
    }

    public Object getAutoInitialize() {
        return autoInitialize;
    }

    public void setAutoInitialize(Object autoInitialize) {
        this.autoInitialize = autoInitialize;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Long getTasksId() {
        return tasksId;
    }

    public void setTasksId(Long tasksId) {
        this.tasksId = tasksId;
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

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
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
        if (validations == null) {
            throw new ConstraintViolationException("validations cannot be null");
        }
        this.validations = validations;
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

        if (data == null) {
            errors.add("data is required");
        }
        if (verificationType == null) {
            errors.add("verification_type is required");
        }
        if (type == null) {
            errors.add("type is required");
        }
        if (targetEntityType == null) {
            errors.add("target_entity_type is required");
        }
        if (validations == null) {
            errors.add("validations is required");
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
