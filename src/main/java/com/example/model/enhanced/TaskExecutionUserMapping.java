package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_execution_user_mapping
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskExecutionUserMapping {

    // Fields
    private long taskExecutionsId;
    private Boolean actionPerformed;
    private Long userGroupsId;
    private long modifiedBy;
    private Long usersId;
    private long createdAt;
    private Object state;
    private long id;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public TaskExecutionUserMapping() {
    }

    // Constructor with required fields
    public TaskExecutionUserMapping(long taskExecutionsId, long modifiedBy, long createdAt, long id, long modifiedAt, long createdBy) {
        this.taskExecutionsId = taskExecutionsId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public long getTaskExecutionsId() {
        return taskExecutionsId;
    }

    public void setTaskExecutionsId(long taskExecutionsId) {
        this.taskExecutionsId = taskExecutionsId;
    }

    public Boolean getActionPerformed() {
        return actionPerformed;
    }

    public void setActionPerformed(Boolean actionPerformed) {
        this.actionPerformed = actionPerformed;
    }

    public Long getUserGroupsId() {
        return userGroupsId;
    }

    public void setUserGroupsId(Long userGroupsId) {
        this.userGroupsId = userGroupsId;
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

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
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
