package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: trained_user_tasks_mapping
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TrainedUserTasksMapping {

    // Fields
    private long tasksId;
    private long modifiedBy;
    private long createdAt;
    private long id;
    private long modifiedAt;
    private long createdBy;
    private long trainedUsersId;

    // Constructors
    public TrainedUserTasksMapping() {
    }

    // Constructor with required fields
    public TrainedUserTasksMapping(long tasksId, long modifiedBy, long createdAt, long id, long modifiedAt, long createdBy, long trainedUsersId) {
        this.tasksId = tasksId;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.trainedUsersId = trainedUsersId;
    }

    // Getters and Setters with constraint validation
    public long getTasksId() {
        return tasksId;
    }

    public void setTasksId(long tasksId) {
        this.tasksId = tasksId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

    public long getTrainedUsersId() {
        return trainedUsersId;
    }

    public void setTrainedUsersId(long trainedUsersId) {
        this.trainedUsersId = trainedUsersId;
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
