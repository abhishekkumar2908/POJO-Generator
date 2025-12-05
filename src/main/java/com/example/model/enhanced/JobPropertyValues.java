package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: job_property_values
 * Generated with database constraint enforcement
 * Primary Key: facility_use_case_property_mapping_id, jobs_id
 */
public class JobPropertyValues {

    // Fields
    private long facilityUseCasePropertyMappingId;
    private long modifiedBy;
    private long createdAt;
    private long modifiedAt;
    private Object value;
    private long jobsId;
    private long createdBy;

    // Constructors
    public JobPropertyValues() {
    }

    // Constructor with required fields
    public JobPropertyValues(long facilityUseCasePropertyMappingId, long modifiedBy, long createdAt, long modifiedAt, long jobsId, long createdBy) {
        this.facilityUseCasePropertyMappingId = facilityUseCasePropertyMappingId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getFacilityUseCasePropertyMappingId() {
        return facilityUseCasePropertyMappingId;
    }

    public void setFacilityUseCasePropertyMappingId(long facilityUseCasePropertyMappingId) {
        this.facilityUseCasePropertyMappingId = facilityUseCasePropertyMappingId;
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

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
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
