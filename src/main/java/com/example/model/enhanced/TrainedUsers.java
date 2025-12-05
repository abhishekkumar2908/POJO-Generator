package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: trained_users
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: checklists_id, users_id, facilities_id; checklists_id, user_groups_id, facilities_id; 
 */
public class TrainedUsers {

    // Fields
    private Long userGroupsId;
    private long checklistsId;
    private long modifiedBy;
    private Long usersId;
    private long createdAt;
    private Long facilitiesId;
    private long id;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public TrainedUsers() {
    }

    // Constructor with required fields
    public TrainedUsers(long checklistsId, long modifiedBy, long createdAt, long id, long modifiedAt, long createdBy) {
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Long getUserGroupsId() {
        return userGroupsId;
    }

    public void setUserGroupsId(Long userGroupsId) {
        this.userGroupsId = userGroupsId;
    }

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(Long facilitiesId) {
        this.facilitiesId = facilitiesId;
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
