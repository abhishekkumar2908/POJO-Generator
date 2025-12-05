package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: parameter_verifications
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ParameterVerifications {

    // Fields
    private long parameterValuesId;
    private String comments;
    private Long userGroupsId;
    private long createdAt;
    private Object verificationType;
    private Object verificationStatus;
    private long createdBy;
    private Boolean isBulk;
    private long modifiedBy;
    private long usersId;
    private long id;
    private long modifiedAt;
    private long jobsId;

    // Constructors
    public ParameterVerifications() {
    }

    // Constructor with required fields
    public ParameterVerifications(long parameterValuesId, long createdAt, Object verificationType, Object verificationStatus, long createdBy, long modifiedBy, long usersId, long id, long modifiedAt, long jobsId) {
        this.parameterValuesId = parameterValuesId;
        this.createdAt = createdAt;
        this.verificationType = verificationType;
        this.verificationStatus = verificationStatus;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.usersId = usersId;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
    }

    // Getters and Setters with constraint validation
    public long getParameterValuesId() {
        return parameterValuesId;
    }

    public void setParameterValuesId(long parameterValuesId) {
        this.parameterValuesId = parameterValuesId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Long getUserGroupsId() {
        return userGroupsId;
    }

    public void setUserGroupsId(Long userGroupsId) {
        this.userGroupsId = userGroupsId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getVerificationType() {
        return verificationType;
    }

    public void setVerificationType(Object verificationType) {
        if (verificationType == null) {
            throw new ConstraintViolationException("verification_type cannot be null");
        }
        this.verificationType = verificationType;
    }

    public Object getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(Object verificationStatus) {
        if (verificationStatus == null) {
            throw new ConstraintViolationException("verification_status cannot be null");
        }
        this.verificationStatus = verificationStatus;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getIsBulk() {
        return isBulk;
    }

    public void setIsBulk(Boolean isBulk) {
        this.isBulk = isBulk;
    }

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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (verificationType == null) {
            errors.add("verification_type is required");
        }
        if (verificationStatus == null) {
            errors.add("verification_status is required");
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
