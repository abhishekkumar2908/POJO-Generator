package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: user_group_members
 * Generated with database constraint enforcement
 * Primary Key: users_id, groups_id
 */
public class UserGroupMembers {

    // Fields
    private long modifiedBy;
    private long usersId;
    private long createdAt;
    private long modifiedAt;
    private long createdBy;
    private long groupsId;

    // Constructors
    public UserGroupMembers() {
    }

    // Constructor with required fields
    public UserGroupMembers(long modifiedBy, long usersId, long createdAt, long modifiedAt, long createdBy, long groupsId) {
        this.modifiedBy = modifiedBy;
        this.usersId = usersId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.groupsId = groupsId;
    }

    // Getters and Setters with constraint validation
    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
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

    public long getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(long groupsId) {
        this.groupsId = groupsId;
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
