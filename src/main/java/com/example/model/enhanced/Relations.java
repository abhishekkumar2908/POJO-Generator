package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: relations
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Relations {

    // Fields
    private Object variables;
    private long createdAt;
    private Object externalId;
    private Boolean isMandatory;
    private Object collection;
    private Object displayName;
    private long createdBy;
    private Object cardinality;
    private long checklistsId;
    private long modifiedBy;
    private int orderTree;
    private long id;
    private Object validations;
    private Object objectTypeId;
    private long modifiedAt;
    private String urlPath;

    // Constructors
    public Relations() {
    }

    // Constructor with required fields
    public Relations(Object variables, long createdAt, Object externalId, Object collection, Object displayName, long createdBy, Object cardinality, long checklistsId, long modifiedBy, int orderTree, long id, Object validations, Object objectTypeId, long modifiedAt, String urlPath) {
        this.variables = variables;
        this.createdAt = createdAt;
        this.externalId = externalId;
        this.collection = collection;
        this.displayName = displayName;
        this.createdBy = createdBy;
        this.cardinality = cardinality;
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.id = id;
        this.validations = validations;
        this.objectTypeId = objectTypeId;
        this.modifiedAt = modifiedAt;
        this.urlPath = urlPath;
    }

    // Getters and Setters with constraint validation
    public Object getVariables() {
        return variables;
    }

    public void setVariables(Object variables) {
        if (variables == null) {
            throw new ConstraintViolationException("variables cannot be null");
        }
        this.variables = variables;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getExternalId() {
        return externalId;
    }

    public void setExternalId(Object externalId) {
        if (externalId == null) {
            throw new ConstraintViolationException("external_id cannot be null");
        }
        this.externalId = externalId;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Object getCollection() {
        return collection;
    }

    public void setCollection(Object collection) {
        if (collection == null) {
            throw new ConstraintViolationException("collection cannot be null");
        }
        this.collection = collection;
    }

    public Object getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Object displayName) {
        if (displayName == null) {
            throw new ConstraintViolationException("display_name cannot be null");
        }
        this.displayName = displayName;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Object getCardinality() {
        return cardinality;
    }

    public void setCardinality(Object cardinality) {
        if (cardinality == null) {
            throw new ConstraintViolationException("cardinality cannot be null");
        }
        this.cardinality = cardinality;
    }

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
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

    public Object getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(Object objectTypeId) {
        if (objectTypeId == null) {
            throw new ConstraintViolationException("object_type_id cannot be null");
        }
        this.objectTypeId = objectTypeId;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        if (urlPath == null) {
            throw new ConstraintViolationException("url_path cannot be null");
        }
        this.urlPath = urlPath == null ? null : urlPath.trim();
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (variables == null) {
            errors.add("variables is required");
        }
        if (externalId == null) {
            errors.add("external_id is required");
        }
        if (collection == null) {
            errors.add("collection is required");
        }
        if (displayName == null) {
            errors.add("display_name is required");
        }
        if (cardinality == null) {
            errors.add("cardinality is required");
        }
        if (validations == null) {
            errors.add("validations is required");
        }
        if (objectTypeId == null) {
            errors.add("object_type_id is required");
        }
        if (urlPath == null) {
            errors.add("url_path is required");
        }
        if (urlPath != null && urlPath.trim().isEmpty()) {
            errors.add("url_path cannot be empty");
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
