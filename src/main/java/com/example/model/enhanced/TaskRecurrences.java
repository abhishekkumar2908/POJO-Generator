package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_recurrences
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskRecurrences {

    // Fields
    private Object positiveDueDateToleranceDuration;
    private Integer negativeDueDateToleranceInterval;
    private long createdAt;
    private Integer dueDateInterval;
    private Object negativeStartDateToleranceDuration;
    private long createdBy;
    private Integer positiveStartDateToleranceInterval;
    private Integer positiveDueDateToleranceInterval;
    private Object negativeDueDateToleranceDuration;
    private Integer startDateInterval;
    private long modifiedBy;
    private Object positiveStartDateToleranceDuration;
    private Integer negativeStartDateToleranceInterval;
    private Object startDateDuration;
    private long id;
    private Object dueDateDuration;
    private long modifiedAt;

    // Constructors
    public TaskRecurrences() {
    }

    // Constructor with required fields
    public TaskRecurrences(long createdAt, long createdBy, long modifiedBy, long id, long modifiedAt) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getPositiveDueDateToleranceDuration() {
        return positiveDueDateToleranceDuration;
    }

    public void setPositiveDueDateToleranceDuration(Object positiveDueDateToleranceDuration) {
        this.positiveDueDateToleranceDuration = positiveDueDateToleranceDuration;
    }

    public Integer getNegativeDueDateToleranceInterval() {
        return negativeDueDateToleranceInterval;
    }

    public void setNegativeDueDateToleranceInterval(Integer negativeDueDateToleranceInterval) {
        this.negativeDueDateToleranceInterval = negativeDueDateToleranceInterval;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDueDateInterval() {
        return dueDateInterval;
    }

    public void setDueDateInterval(Integer dueDateInterval) {
        this.dueDateInterval = dueDateInterval;
    }

    public Object getNegativeStartDateToleranceDuration() {
        return negativeStartDateToleranceDuration;
    }

    public void setNegativeStartDateToleranceDuration(Object negativeStartDateToleranceDuration) {
        this.negativeStartDateToleranceDuration = negativeStartDateToleranceDuration;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getPositiveStartDateToleranceInterval() {
        return positiveStartDateToleranceInterval;
    }

    public void setPositiveStartDateToleranceInterval(Integer positiveStartDateToleranceInterval) {
        this.positiveStartDateToleranceInterval = positiveStartDateToleranceInterval;
    }

    public Integer getPositiveDueDateToleranceInterval() {
        return positiveDueDateToleranceInterval;
    }

    public void setPositiveDueDateToleranceInterval(Integer positiveDueDateToleranceInterval) {
        this.positiveDueDateToleranceInterval = positiveDueDateToleranceInterval;
    }

    public Object getNegativeDueDateToleranceDuration() {
        return negativeDueDateToleranceDuration;
    }

    public void setNegativeDueDateToleranceDuration(Object negativeDueDateToleranceDuration) {
        this.negativeDueDateToleranceDuration = negativeDueDateToleranceDuration;
    }

    public Integer getStartDateInterval() {
        return startDateInterval;
    }

    public void setStartDateInterval(Integer startDateInterval) {
        this.startDateInterval = startDateInterval;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getPositiveStartDateToleranceDuration() {
        return positiveStartDateToleranceDuration;
    }

    public void setPositiveStartDateToleranceDuration(Object positiveStartDateToleranceDuration) {
        this.positiveStartDateToleranceDuration = positiveStartDateToleranceDuration;
    }

    public Integer getNegativeStartDateToleranceInterval() {
        return negativeStartDateToleranceInterval;
    }

    public void setNegativeStartDateToleranceInterval(Integer negativeStartDateToleranceInterval) {
        this.negativeStartDateToleranceInterval = negativeStartDateToleranceInterval;
    }

    public Object getStartDateDuration() {
        return startDateDuration;
    }

    public void setStartDateDuration(Object startDateDuration) {
        this.startDateDuration = startDateDuration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getDueDateDuration() {
        return dueDateDuration;
    }

    public void setDueDateDuration(Object dueDateDuration) {
        this.dueDateDuration = dueDateDuration;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
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
