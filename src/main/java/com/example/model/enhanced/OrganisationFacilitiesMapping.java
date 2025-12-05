package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: organisation_facilities_mapping
 * Generated with database constraint enforcement
 * Primary Key: facilities_id, organisations_id
 */
public class OrganisationFacilitiesMapping {

    // Fields
    private long organisationsId;
    private long createdAt;
    private long facilitiesId;
    private Long createdBy;

    // Constructors
    public OrganisationFacilitiesMapping() {
    }

    // Constructor with required fields
    public OrganisationFacilitiesMapping(long organisationsId, long createdAt, long facilitiesId) {
        this.organisationsId = organisationsId;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
    }

    // Getters and Setters with constraint validation
    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
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
