package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: effects
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Effects {

    // Fields
    private Object query;
    private long createdAt;
    private String description;
    private Object type;
    private long createdBy;
    private Object apiPayload;
    private Object apiHeaders;
    private Boolean archived;
    private long actionsId;
    private boolean javascriptEnabled;
    private Object apiEndpoint;
    private Object apiMethod;
    private String name;
    private long modifiedBy;
    private int orderTree;
    private long id;
    private long modifiedAt;

    // Constructors
    public Effects() {
    }

    // Constructor with required fields
    public Effects(long createdAt, Object type, long createdBy, long actionsId, boolean javascriptEnabled, String name, long modifiedBy, int orderTree, long id, long modifiedAt) {
        this.createdAt = createdAt;
        this.type = type;
        this.createdBy = createdBy;
        this.actionsId = actionsId;
        this.javascriptEnabled = javascriptEnabled;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getQuery() {
        return query;
    }

    public void setQuery(Object query) {
        this.query = query;
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

    public Object getApiPayload() {
        return apiPayload;
    }

    public void setApiPayload(Object apiPayload) {
        this.apiPayload = apiPayload;
    }

    public Object getApiHeaders() {
        return apiHeaders;
    }

    public void setApiHeaders(Object apiHeaders) {
        this.apiHeaders = apiHeaders;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public long getActionsId() {
        return actionsId;
    }

    public void setActionsId(long actionsId) {
        this.actionsId = actionsId;
    }

    public boolean getJavascriptEnabled() {
        return javascriptEnabled;
    }

    public void setJavascriptEnabled(boolean javascriptEnabled) {
        this.javascriptEnabled = javascriptEnabled;
    }

    public Object getApiEndpoint() {
        return apiEndpoint;
    }

    public void setApiEndpoint(Object apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public Object getApiMethod() {
        return apiMethod;
    }

    public void setApiMethod(Object apiMethod) {
        this.apiMethod = apiMethod;
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
        if (name != null && name.trim().isEmpty()) {
            errors.add("name cannot be empty");
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
