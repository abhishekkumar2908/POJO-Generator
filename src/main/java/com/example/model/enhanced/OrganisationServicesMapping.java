package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: organisation_services_mapping
 * Generated with database constraint enforcement
 * Primary Key: organisations_id, services_id
 */
public class OrganisationServicesMapping {

    // Fields
    private Object servicesId;
    private String fqdn;
    private long organisationsId;
    private long createdAt;
    private Long createdBy;

    // Constructors
    public OrganisationServicesMapping() {
    }

    // Constructor with required fields
    public OrganisationServicesMapping(Object servicesId, String fqdn, long organisationsId, long createdAt) {
        this.servicesId = servicesId;
        this.fqdn = fqdn;
        this.organisationsId = organisationsId;
        this.createdAt = createdAt;
    }

    // Getters and Setters with constraint validation
    public Object getServicesId() {
        return servicesId;
    }

    public void setServicesId(Object servicesId) {
        if (servicesId == null) {
            throw new ConstraintViolationException("services_id cannot be null");
        }
        this.servicesId = servicesId;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        if (fqdn == null) {
            throw new ConstraintViolationException("fqdn cannot be null");
        }
        this.fqdn = fqdn == null ? null : fqdn.trim();
    }

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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (servicesId == null) {
            errors.add("services_id is required");
        }
        if (fqdn == null) {
            errors.add("fqdn is required");
        }
        if (fqdn != null && fqdn.trim().isEmpty()) {
            errors.add("fqdn cannot be empty");
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
