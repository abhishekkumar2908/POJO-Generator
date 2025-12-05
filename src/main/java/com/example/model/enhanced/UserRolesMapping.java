package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: user_roles_mapping
 * Generated with database constraint enforcement
 * Primary Key: roles_id, users_id
 */
public class UserRolesMapping {

    // Fields
    private long rolesId;
    private long usersId;
    private long createdAt;
    private Long createdBy;

    // Constructors
    public UserRolesMapping() {
    }

    // Constructor with required fields
    public UserRolesMapping(long rolesId, long usersId, long createdAt) {
        this.rolesId = rolesId;
        this.usersId = usersId;
        this.createdAt = createdAt;
    }

    // Getters and Setters with constraint validation
    public long getRolesId() {
        return rolesId;
    }

    public void setRolesId(long rolesId) {
        this.rolesId = rolesId;
    }

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
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
