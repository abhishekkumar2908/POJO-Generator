package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: user_group_audits
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class UserGroupAudits {

    // Fields
    private long userGroupsId;
    private long triggeredAt;
    private long organisationsId;
    private long facilitiesId;
    private String details;
    private long id;
    private long triggeredBy;

    // Constructors
    public UserGroupAudits() {
    }

    // Constructor with required fields
    public UserGroupAudits(long userGroupsId, long triggeredAt, long organisationsId, long facilitiesId, long id, long triggeredBy) {
        this.userGroupsId = userGroupsId;
        this.triggeredAt = triggeredAt;
        this.organisationsId = organisationsId;
        this.facilitiesId = facilitiesId;
        this.id = id;
        this.triggeredBy = triggeredBy;
    }

    // Getters and Setters with constraint validation
    public long getUserGroupsId() {
        return userGroupsId;
    }

    public void setUserGroupsId(long userGroupsId) {
        this.userGroupsId = userGroupsId;
    }

    public long getTriggeredAt() {
        return triggeredAt;
    }

    public void setTriggeredAt(long triggeredAt) {
        this.triggeredAt = triggeredAt;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
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
