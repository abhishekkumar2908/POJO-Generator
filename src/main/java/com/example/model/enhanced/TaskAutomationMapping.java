package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_automation_mapping
 * Generated with database constraint enforcement
 */
public class TaskAutomationMapping {

    // Fields
    private long automationsId;
    private long tasksId;
    private long modifiedBy;
    private int orderTree;
    private long createdAt;
    private Object displayName;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public TaskAutomationMapping() {
    }

    // Constructor with required fields
    public TaskAutomationMapping(long automationsId, long tasksId, long modifiedBy, int orderTree, long createdAt, Object displayName, long modifiedAt, long createdBy) {
        this.automationsId = automationsId;
        this.tasksId = tasksId;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.createdAt = createdAt;
        this.displayName = displayName;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getAutomationsId() {
        return automationsId;
    }

    public void setAutomationsId(long automationsId) {
        this.automationsId = automationsId;
    }

    public long getTasksId() {
        return tasksId;
    }

    public void setTasksId(long tasksId) {
        this.tasksId = tasksId;
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

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

        if (displayName == null) {
            errors.add("display_name is required");
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
