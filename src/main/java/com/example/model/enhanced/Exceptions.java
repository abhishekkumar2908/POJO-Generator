package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: exceptions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Exceptions {

    // Fields
    private Long taskExecutionsId;
    private Object reason;
    private long parameterValuesId;
    private Object code;
    private Object previousState;
    private String reviewersReason;
    private long createdAt;
    private long facilitiesId;
    private String initiatorsReason;
    private String rulesId;
    private long createdBy;
    private long modifiedBy;
    private long id;
    private long modifiedAt;
    private Object choices;
    private String value;
    private long jobsId;
    private Object status;

    // Constructors
    public Exceptions() {
    }

    // Constructor with required fields
    public Exceptions(long parameterValuesId, Object code, long createdAt, long facilitiesId, long createdBy, long modifiedBy, long id, long modifiedAt, long jobsId, Object status) {
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
    public Long getTaskExecutionsId() {
        return taskExecutionsId;
    }

    public void setTaskExecutionsId(Long taskExecutionsId) {
        this.taskExecutionsId = taskExecutionsId;
    }

    public Object getReason() {
        return reason;
    }

    public void setReason(Object reason) {
        this.reason = reason;
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

    public String getRulesId() {
        return rulesId;
    }

    public void setRulesId(String rulesId) {
        this.rulesId = rulesId == null ? null : rulesId.trim();
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

    public Object getChoices() {
        return choices;
    }

    public void setChoices(Object choices) {
        this.choices = choices;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
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
