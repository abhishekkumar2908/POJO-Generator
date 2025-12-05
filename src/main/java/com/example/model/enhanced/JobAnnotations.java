package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: job_annotations
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class JobAnnotations {

    // Fields
    private Object code;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private long modifiedAt;
    private long jobsId;
    private long createdBy;
    private String remarks;

    // Constructors
    public JobAnnotations() {
    }

    // Constructor with required fields
    public JobAnnotations(long modifiedBy, long createdAt, long id, long modifiedAt, long jobsId, long createdBy) {
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
