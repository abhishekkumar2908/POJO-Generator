package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: user_audits
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class UserAudits {

    // Fields
    private Object severity;
    private Object facilityIds;
    private Long triggeredAt;
    private Object action;
    private Long organisationsId;
    private String details;
    private long id;
    private long triggeredBy;

    // Constructors
    public UserAudits() {
    }

    // Constructor with required fields
    public UserAudits(long id, long triggeredBy) {
        this.id = id;
        this.triggeredBy = triggeredBy;
    }

    // Getters and Setters with constraint validation
    public Object getSeverity() {
        return severity;
    }

    public void setSeverity(Object severity) {
        this.severity = severity;
    }

    public Object getFacilityIds() {
        return facilityIds;
    }

    public void setFacilityIds(Object facilityIds) {
        this.facilityIds = facilityIds;
    }

    public Long getTriggeredAt() {
        return triggeredAt;
    }

    public void setTriggeredAt(Long triggeredAt) {
        this.triggeredAt = triggeredAt;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public Long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(Long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(long triggeredBy) {
        this.triggeredBy = triggeredBy;
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
