package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklist_facility_mapping
 * Generated with database constraint enforcement
 * Primary Key: facilities_id, checklists_id
 */
public class ChecklistFacilityMapping {

    // Fields
    private long checklistsId;
    private long modifiedBy;
    private long createdAt;
    private long facilitiesId;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public ChecklistFacilityMapping() {
    }

    // Constructor with required fields
    public ChecklistFacilityMapping(long checklistsId, long modifiedBy, long createdAt, long facilitiesId, long modifiedAt, long createdBy) {
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
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
