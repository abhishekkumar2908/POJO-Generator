package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: job_cwe_detail_media_mapping
 * Generated with database constraint enforcement
 * Primary Key: medias_id, job_cwe_details_id
 */
public class JobCweDetailMediaMapping {

    // Fields
    private long jobCweDetailsId;
    private long modifiedBy;
    private long mediasId;
    private long createdAt;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public JobCweDetailMediaMapping() {
    }

    // Constructor with required fields
    public JobCweDetailMediaMapping(long jobCweDetailsId, long modifiedBy, long mediasId, long createdAt, long modifiedAt, long createdBy) {
        this.jobCweDetailsId = jobCweDetailsId;
        this.modifiedBy = modifiedBy;
        this.mediasId = mediasId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getJobCweDetailsId() {
        return jobCweDetailsId;
    }

    public void setJobCweDetailsId(long jobCweDetailsId) {
        this.jobCweDetailsId = jobCweDetailsId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getMediasId() {
        return mediasId;
    }

    public void setMediasId(long mediasId) {
        this.mediasId = mediasId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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
