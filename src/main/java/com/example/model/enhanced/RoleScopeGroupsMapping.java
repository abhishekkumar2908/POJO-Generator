package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: role_scope_groups_mapping
 * Generated with database constraint enforcement
 * Primary Key: roles_id, scope_groups_id
 */
public class RoleScopeGroupsMapping {

    // Fields
    private long rolesId;
    private long scopeGroupsId;
    private long createdAt;
    private Long createdBy;

    // Constructors
    public RoleScopeGroupsMapping() {
    }

    // Constructor with required fields
    public RoleScopeGroupsMapping(long rolesId, long scopeGroupsId, long createdAt) {
        this.rolesId = rolesId;
        this.scopeGroupsId = scopeGroupsId;
        this.createdAt = createdAt;
    }

    // Getters and Setters with constraint validation
    public long getRolesId() {
        return rolesId;
    }

    public void setRolesId(long rolesId) {
        this.rolesId = rolesId;
    }

    public long getScopeGroupsId() {
        return scopeGroupsId;
    }

    public void setScopeGroupsId(long scopeGroupsId) {
        this.scopeGroupsId = scopeGroupsId;
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
