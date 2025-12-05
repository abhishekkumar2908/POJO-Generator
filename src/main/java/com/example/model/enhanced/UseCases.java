package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: use_cases
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class UseCases {

    // Fields
    private boolean archived;
    private Object metadata;
    private Object name;
    private long modifiedBy;
    private String description;
    private int orderTree;
    private long createdAt;
    private long id;
    private Object label;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public UseCases() {
    }

    // Constructor with required fields
    public UseCases(boolean archived, Object metadata, Object name, long modifiedBy, int orderTree, long createdAt, long id, Object label, long modifiedAt, long createdBy) {
        this.archived = archived;
        this.metadata = metadata;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.createdAt = createdAt;
        this.id = id;
        this.label = label;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        if (metadata == null) {
            throw new ConstraintViolationException("metadata cannot be null");
        }
        this.metadata = metadata;
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

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
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

    public Object getLabel() {
        return label;
    }

    public void setLabel(Object label) {
        if (label == null) {
            throw new ConstraintViolationException("label cannot be null");
        }
        this.label = label;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
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

        if (metadata == null) {
            errors.add("metadata is required");
        }
        if (name == null) {
            errors.add("name is required");
        }
        if (label == null) {
            errors.add("label is required");
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
