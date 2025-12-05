package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: job_cwe_details
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class JobCweDetails {

    // Fields
    private Object reason;
    private long modifiedBy;
    private long createdAt;
    private String comment;
    private long id;
    private long modifiedAt;
    private long jobsId;
    private long createdBy;

    // Constructors
    public JobCweDetails() {
    }

    // Constructor with required fields
    public JobCweDetails(Object reason, long modifiedBy, long createdAt, String comment, long id, long modifiedAt, long jobsId, long createdBy) {
        this.reason = reason;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.comment = comment;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        if (reason == null) {
            throw new ConstraintViolationException("reason cannot be null");
        }
        this.reason = reason;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        if (comment == null) {
            throw new ConstraintViolationException("comment cannot be null");
        }
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

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
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

        if (reason == null) {
            errors.add("reason is required");
        }
        if (comment == null) {
            errors.add("comment is required");
        }
        if (comment != null && comment.trim().isEmpty()) {
            errors.add("comment cannot be empty");
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
