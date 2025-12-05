package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: user_groups
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: name, facility_id, active; 
 */
public class UserGroups {

    // Fields
    private String name;
    private long modifiedBy;
    private String description;
    private boolean active;
    private long createdAt;
    private long facilityId;
    private long id;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public UserGroups() {
    }

    // Constructor with required fields
    public UserGroups(String name, long modifiedBy, String description, boolean active, long createdAt, long facilityId, long id, long modifiedAt, long createdBy) {
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.facilityId = facilityId;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name == null ? null : name.trim();
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null) {
            throw new ConstraintViolationException("description cannot be null");
        }
        this.description = description == null ? null : description.trim();
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

        if (name == null) {
            errors.add("name is required");
        }
        if (name != null && name.trim().isEmpty()) {
            errors.add("name cannot be empty");
        }
        if (description == null) {
            errors.add("description is required");
        }
        if (description != null && description.trim().isEmpty()) {
            errors.add("description cannot be empty");
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
