package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_execution_timers
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskExecutionTimers {

    // Fields
    private String reason;
    private long taskExecutionsId;
    private long pausedAt;
    private Long modifiedBy;
    private long createdAt;
    private Long resumedAt;
    private String comment;
    private long id;
    private long modifiedAt;
    private Long createdBy;

    // Constructors
    public TaskExecutionTimers() {
    }

    // Constructor with required fields
    public TaskExecutionTimers(long taskExecutionsId, long pausedAt, long createdAt, long id, long modifiedAt) {
        this.taskExecutionsId = taskExecutionsId;
        this.pausedAt = pausedAt;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public long getTaskExecutionsId() {
        return taskExecutionsId;
    }

    public void setTaskExecutionsId(long taskExecutionsId) {
        this.taskExecutionsId = taskExecutionsId;
    }

    public long getPausedAt() {
        return pausedAt;
    }

    public void setPausedAt(long pausedAt) {
        this.pausedAt = pausedAt;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getResumedAt() {
        return resumedAt;
    }

    public void setResumedAt(Long resumedAt) {
        this.resumedAt = resumedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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
