package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: corrections
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Corrections {

    // Fields
    private long taskExecutionsId;
    private String correctorsReason;
    private long parameterValuesId;
    private Object code;
    private Object previousState;
    private Object oldChoices;
    private String reviewersReason;
    private long createdAt;
    private long facilitiesId;
    private String initiatorsReason;
    private long createdBy;
    private long modifiedBy;
    private String oldValue;
    private long id;
    private long modifiedAt;
    private long jobsId;
    private String newValue;
    private Object newChoices;
    private Object status;

    // Constructors
    public Corrections() {
    }

    // Constructor with required fields
    public Corrections(long taskExecutionsId, long parameterValuesId, Object code, long createdAt, long facilitiesId, long createdBy, long modifiedBy, long id, long modifiedAt, long jobsId, Object status) {
        this.taskExecutionsId = taskExecutionsId;
        this.parameterValuesId = parameterValuesId;
        this.code = code;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
        this.status = status;
    }

    // Getters and Setters with constraint validation
    public long getTaskExecutionsId() {
        return taskExecutionsId;
    }

    public void setTaskExecutionsId(long taskExecutionsId) {
        this.taskExecutionsId = taskExecutionsId;
    }

    public String getCorrectorsReason() {
        return correctorsReason;
    }

    public void setCorrectorsReason(String correctorsReason) {
        this.correctorsReason = correctorsReason == null ? null : correctorsReason.trim();
    }

    public long getParameterValuesId() {
        return parameterValuesId;
    }

    public void setParameterValuesId(long parameterValuesId) {
        this.parameterValuesId = parameterValuesId;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        if (code == null) {
            throw new ConstraintViolationException("code cannot be null");
        }
        this.code = code;
    }

    public Object getPreviousState() {
        return previousState;
    }

    public void setPreviousState(Object previousState) {
        this.previousState = previousState;
    }

    public Object getOldChoices() {
        return oldChoices;
    }

    public void setOldChoices(Object oldChoices) {
        this.oldChoices = oldChoices;
    }

    public String getReviewersReason() {
        return reviewersReason;
    }

    public void setReviewersReason(String reviewersReason) {
        this.reviewersReason = reviewersReason == null ? null : reviewersReason.trim();
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public String getInitiatorsReason() {
        return initiatorsReason;
    }

    public void setInitiatorsReason(String initiatorsReason) {
        this.initiatorsReason = initiatorsReason == null ? null : initiatorsReason.trim();
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue == null ? null : oldValue.trim();
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

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue == null ? null : newValue.trim();
    }

    public Object getNewChoices() {
        return newChoices;
    }

    public void setNewChoices(Object newChoices) {
        this.newChoices = newChoices;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        if (status == null) {
            throw new ConstraintViolationException("status cannot be null");
        }
        this.status = status;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (code == null) {
            errors.add("code is required");
        }
        if (status == null) {
            errors.add("status is required");
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
