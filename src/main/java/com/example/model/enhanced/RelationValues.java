package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: relation_values
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class RelationValues {

    // Fields
    private long relationsId;
    private Object objectTypeExternalId;
    private long createdAt;
    private Object collection;
    private Object objectId;
    private long createdBy;
    private Object objectDisplayName;
    private Object objectTypeDisplayName;
    private long modifiedBy;
    private long id;
    private Object objectExternalId;
    private long modifiedAt;
    private long jobsId;

    // Constructors
    public RelationValues() {
    }

    // Constructor with required fields
    public RelationValues(long relationsId, Object objectTypeExternalId, long createdAt, Object collection, Object objectId, long createdBy, Object objectDisplayName, Object objectTypeDisplayName, long modifiedBy, long id, Object objectExternalId, long modifiedAt, long jobsId) {
        this.relationsId = relationsId;
        this.objectTypeExternalId = objectTypeExternalId;
        this.createdAt = createdAt;
        this.collection = collection;
        this.objectId = objectId;
        this.createdBy = createdBy;
        this.objectDisplayName = objectDisplayName;
        this.objectTypeDisplayName = objectTypeDisplayName;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.objectExternalId = objectExternalId;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
    }

    // Getters and Setters with constraint validation
    public long getRelationsId() {
        return relationsId;
    }

    public void setRelationsId(long relationsId) {
        this.relationsId = relationsId;
    }

    public Object getObjectTypeExternalId() {
        return objectTypeExternalId;
    }

    public void setObjectTypeExternalId(Object objectTypeExternalId) {
        if (objectTypeExternalId == null) {
            throw new ConstraintViolationException("object_type_external_id cannot be null");
        }
        this.objectTypeExternalId = objectTypeExternalId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

    public Object getObjectId() {
        return objectId;
    }

    public void setObjectId(Object objectId) {
        if (objectId == null) {
            throw new ConstraintViolationException("object_id cannot be null");
        }
        this.objectId = objectId;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Object getObjectDisplayName() {
        return objectDisplayName;
    }

    public void setObjectDisplayName(Object objectDisplayName) {
        if (objectDisplayName == null) {
            throw new ConstraintViolationException("object_display_name cannot be null");
        }
        this.objectDisplayName = objectDisplayName;
    }

    public Object getObjectTypeDisplayName() {
        return objectTypeDisplayName;
    }

    public void setObjectTypeDisplayName(Object objectTypeDisplayName) {
        if (objectTypeDisplayName == null) {
            throw new ConstraintViolationException("object_type_display_name cannot be null");
        }
        this.objectTypeDisplayName = objectTypeDisplayName;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getObjectExternalId() {
        return objectExternalId;
    }

    public void setObjectExternalId(Object objectExternalId) {
        if (objectExternalId == null) {
            throw new ConstraintViolationException("object_external_id cannot be null");
        }
        this.objectExternalId = objectExternalId;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (objectTypeExternalId == null) {
            errors.add("object_type_external_id is required");
        }
        if (collection == null) {
            errors.add("collection is required");
        }
        if (objectId == null) {
            errors.add("object_id is required");
        }
        if (objectDisplayName == null) {
            errors.add("object_display_name is required");
        }
        if (objectTypeDisplayName == null) {
            errors.add("object_type_display_name is required");
        }
        if (objectExternalId == null) {
            errors.add("object_external_id is required");
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
