package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: properties
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Properties {

    // Fields
    private Object placeHolder;
    private boolean isGlobal;
    private long createdAt;
    private Object label;
    private Object type;
    private long createdBy;
    private Long useCasesId;
    private boolean archived;
    private Object name;
    private long modifiedBy;
    private int orderTree;
    private long id;
    private long modifiedAt;

    // Constructors
    public Properties() {
    }

    // Constructor with required fields
    public Properties(Object placeHolder, boolean isGlobal, long createdAt, Object label, Object type, long createdBy, boolean archived, Object name, long modifiedBy, int orderTree, long id, long modifiedAt) {
        this.placeHolder = placeHolder;
        this.isGlobal = isGlobal;
        this.createdAt = createdAt;
        this.label = label;
        this.type = type;
        this.createdBy = createdBy;
        this.archived = archived;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(Object placeHolder) {
        if (placeHolder == null) {
            throw new ConstraintViolationException("place_holder cannot be null");
        }
        this.placeHolder = placeHolder;
    }

    public boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

    public Long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(Long useCasesId) {
        this.useCasesId = useCasesId;
    }

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

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (name == null) {
            errors.add("name is required");
        }
        if (placeHolder == null) {
            errors.add("place_holder is required");
        }
        if (label == null) {
            errors.add("label is required");
        }
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
