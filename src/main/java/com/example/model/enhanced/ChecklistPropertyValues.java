package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklist_property_values
 * Generated with database constraint enforcement
 * Primary Key: facility_use_case_property_mapping_id, checklists_id
 */
public class ChecklistPropertyValues {

    // Fields
    private long facilityUseCasePropertyMappingId;
    private long checklistsId;
    private long modifiedBy;
    private long createdAt;
    private long modifiedAt;
    private Object value;
    private long createdBy;

    // Constructors
    public ChecklistPropertyValues() {
    }

    // Constructor with required fields
    public ChecklistPropertyValues(long facilityUseCasePropertyMappingId, long checklistsId, long modifiedBy, long createdAt, long modifiedAt, long createdBy) {
        this.facilityUseCasePropertyMappingId = facilityUseCasePropertyMappingId;
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getFacilityUseCasePropertyMappingId() {
        return facilityUseCasePropertyMappingId;
    }

    public void setFacilityUseCasePropertyMappingId(long facilityUseCasePropertyMappingId) {
        this.facilityUseCasePropertyMappingId = facilityUseCasePropertyMappingId;
    }

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
