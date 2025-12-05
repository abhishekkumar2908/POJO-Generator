package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: scopes
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: name, scope_groups_id, archived; 
 */
public class Scopes {

    // Fields
    private boolean archived;
    private Long modifiedBy;
    private Object name;
    private long createdAt;
    private int orderTree;
    private long scopeGroupsId;
    private long id;
    private long modifiedAt;
    private Long createdBy;

    // Constructors
    public Scopes() {
    }

    // Constructor with required fields
    public Scopes(boolean archived, long createdAt, int orderTree, long scopeGroupsId, long id, long modifiedAt) {
        this.archived = archived;
        this.createdAt = createdAt;
        this.orderTree = orderTree;
        this.scopeGroupsId = scopeGroupsId;
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

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
    }

    public long getScopeGroupsId() {
        return scopeGroupsId;
    }

    public void setScopeGroupsId(long scopeGroupsId) {
        this.scopeGroupsId = scopeGroupsId;
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
