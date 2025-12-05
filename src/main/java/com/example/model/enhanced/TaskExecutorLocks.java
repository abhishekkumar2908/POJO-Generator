package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_executor_locks
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: tasks_id, referenced_tasks_id, lock_type; 
 */
public class TaskExecutorLocks {

    // Fields
    private long tasksId;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private long referencedTasksId;
    private Object lockType;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public TaskExecutorLocks() {
    }

    // Constructor with required fields
    public TaskExecutorLocks(long tasksId, long modifiedBy, long createdAt, long id, long referencedTasksId, Object lockType, long modifiedAt, long createdBy) {
        this.tasksId = tasksId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.referencedTasksId = referencedTasksId;
        this.lockType = lockType;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
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

    public long getReferencedTasksId() {
        return referencedTasksId;
    }

    public void setReferencedTasksId(long referencedTasksId) {
        this.referencedTasksId = referencedTasksId;
    }

    public Object getLockType() {
        return lockType;
    }

    public void setLockType(Object lockType) {
        if (lockType == null) {
            throw new ConstraintViolationException("lock_type cannot be null");
        }
        this.lockType = lockType;
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

        if (lockType == null) {
            errors.add("lock_type is required");
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
