package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: facility_use_case_mapping
 * Generated with database constraint enforcement
 * Primary Key: facilities_id, use_cases_id
 */
public class FacilityUseCaseMapping {

    // Fields
    private long useCasesId;
    private int quota;
    private long modifiedBy;
    private long createdAt;
    private long facilitiesId;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public FacilityUseCaseMapping() {
    }

    // Constructor with required fields
    public FacilityUseCaseMapping(long useCasesId, int quota, long modifiedBy, long createdAt, long facilitiesId, long modifiedAt, long createdBy) {
        this.useCasesId = useCasesId;
        this.quota = quota;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(long useCasesId) {
        this.useCasesId = useCasesId;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
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

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
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
