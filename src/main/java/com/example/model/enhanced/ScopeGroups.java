package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: scope_groups
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: name, services_id, archived; 
 */
public class ScopeGroups {

    // Fields
    private boolean archived;
    private Object servicesId;
    private Long modifiedBy;
    private Object name;
    private long createdAt;
    private int orderTree;
    private long id;
    private long modifiedAt;
    private Long createdBy;

    // Constructors
    public ScopeGroups() {
    }

    // Constructor with required fields
    public ScopeGroups(boolean archived, long createdAt, int orderTree, long id, long modifiedAt) {
        this.archived = archived;
        this.createdAt = createdAt;
        this.orderTree = orderTree;
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

    public Object getServicesId() {
        return servicesId;
    }

    public void setServicesId(Object servicesId) {
        this.servicesId = servicesId;
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
