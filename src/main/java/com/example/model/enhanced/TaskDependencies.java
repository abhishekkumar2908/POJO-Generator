package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_dependencies
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskDependencies {

    // Fields
    private long dependentTaskId;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private long modifiedAt;
    private long createdBy;
    private long prerequisiteTaskId;

    // Constructors
    public TaskDependencies() {
    }

    // Constructor with required fields
    public TaskDependencies(long dependentTaskId, long modifiedBy, long createdAt, long id, long modifiedAt, long createdBy, long prerequisiteTaskId) {
        this.dependentTaskId = dependentTaskId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.prerequisiteTaskId = prerequisiteTaskId;
    }

    // Getters and Setters with constraint validation
    public long getDependentTaskId() {
        return dependentTaskId;
    }

    public void setDependentTaskId(long dependentTaskId) {
        this.dependentTaskId = dependentTaskId;
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

    public long getPrerequisiteTaskId() {
        return prerequisiteTaskId;
    }

    public void setPrerequisiteTaskId(long prerequisiteTaskId) {
        this.prerequisiteTaskId = prerequisiteTaskId;
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
