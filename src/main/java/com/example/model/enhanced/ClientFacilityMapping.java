package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: client_facility_mapping
 * Generated with database constraint enforcement
 * Primary Key: client_id, facilities_id
 */
public class ClientFacilityMapping {

    // Fields
    private long modifiedBy;
    private long createdAt;
    private long facilitiesId;
    private long modifiedAt;
    private long createdBy;
    private Object clientId;

    // Constructors
    public ClientFacilityMapping() {
    }

    // Constructor with required fields
    public ClientFacilityMapping(long modifiedBy, long createdAt, long facilitiesId, long modifiedAt, long createdBy, Object clientId) {
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.clientId = clientId;
    }

    // Getters and Setters with constraint validation
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

    public Object getClientId() {
        return clientId;
    }

    public void setClientId(Object clientId) {
        if (clientId == null) {
            throw new ConstraintViolationException("client_id cannot be null");
        }
        this.clientId = clientId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (clientId == null) {
            errors.add("client_id is required");
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
