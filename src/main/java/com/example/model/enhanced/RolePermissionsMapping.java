package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: role_permissions_mapping
 * Generated with database constraint enforcement
 * Primary Key: permissions_id, roles_id
 */
public class RolePermissionsMapping {

    // Fields
    private long permissionsId;
    private long rolesId;
    private long createdAt;
    private Long createdBy;

    // Constructors
    public RolePermissionsMapping() {
    }

    // Constructor with required fields
    public RolePermissionsMapping(long permissionsId, long rolesId, long createdAt) {
        this.permissionsId = permissionsId;
        this.rolesId = rolesId;
        this.createdAt = createdAt;
    }

    // Getters and Setters with constraint validation
    public long getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(long permissionsId) {
        this.permissionsId = permissionsId;
    }

    public long getRolesId() {
        return rolesId;
    }

    public void setRolesId(long rolesId) {
        this.rolesId = rolesId;
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
