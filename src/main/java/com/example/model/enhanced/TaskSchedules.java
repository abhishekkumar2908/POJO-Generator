package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_schedules
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskSchedules {

    // Fields
    private Object condition;
    private int startDateInterval;
    private long modifiedBy;
    private long createdAt;
    private Object startDateDuration;
    private int dueDateInterval;
    private long id;
    private Long referencedTasksId;
    private Object type;
    private Object dueDateDuration;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public TaskSchedules() {
    }

    // Constructor with required fields
    public TaskSchedules(Object condition, int startDateInterval, long modifiedBy, long createdAt, Object startDateDuration, int dueDateInterval, long id, Object type, Object dueDateDuration, long modifiedAt, long createdBy) {
        this.condition = condition;
        this.startDateInterval = startDateInterval;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.startDateDuration = startDateDuration;
        this.dueDateInterval = dueDateInterval;
        this.id = id;
        this.type = type;
        this.dueDateDuration = dueDateDuration;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        if (condition == null) {
            throw new ConstraintViolationException("condition cannot be null");
        }
        this.condition = condition;
    }

    public int getStartDateInterval() {
        return startDateInterval;
    }

    public void setStartDateInterval(int startDateInterval) {
        this.startDateInterval = startDateInterval;
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

    public Object getStartDateDuration() {
        return startDateDuration;
    }

    public void setStartDateDuration(Object startDateDuration) {
        if (startDateDuration == null) {
            throw new ConstraintViolationException("start_date_duration cannot be null");
        }
        this.startDateDuration = startDateDuration;
    }

    public int getDueDateInterval() {
        return dueDateInterval;
    }

    public void setDueDateInterval(int dueDateInterval) {
        this.dueDateInterval = dueDateInterval;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getReferencedTasksId() {
        return referencedTasksId;
    }

    public void setReferencedTasksId(Long referencedTasksId) {
        this.referencedTasksId = referencedTasksId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        if (type == null) {
            throw new ConstraintViolationException("type cannot be null");
        }
        this.type = type;
    }

    public Object getDueDateDuration() {
        return dueDateDuration;
    }

    public void setDueDateDuration(Object dueDateDuration) {
        if (dueDateDuration == null) {
            throw new ConstraintViolationException("due_date_duration cannot be null");
        }
        this.dueDateDuration = dueDateDuration;
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

        if (condition == null) {
            errors.add("condition is required");
        }
        if (startDateDuration == null) {
            errors.add("start_date_duration is required");
        }
        if (type == null) {
            errors.add("type is required");
        }
        if (dueDateDuration == null) {
            errors.add("due_date_duration is required");
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
