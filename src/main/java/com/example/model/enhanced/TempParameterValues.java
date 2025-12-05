package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: temp_parameter_values
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TempParameterValues {

    // Fields
    private long parametersId;
    private String reason;
    private Long taskExecutionsId;
    private Boolean hidden;
    private Boolean hasVariations;
    private Boolean verified;
    private long createdAt;
    private long createdBy;
    private Long version;
    private Long clientEpoch;
    private Long modifiedBy;
    private Long parameterValueApprovalId;
    private long id;
    private Object state;
    private Object choices;
    private Long modifiedAt;
    private String value;
    private long jobsId;
    private Object impactedBy;

    // Constructors
    public TempParameterValues() {
    }

    // Constructor with required fields
    public TempParameterValues(long parametersId, long createdAt, long createdBy, long id, long jobsId) {
        this.parametersId = parametersId;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.id = id;
        this.jobsId = jobsId;
    }

    // Getters and Setters with constraint validation
    public long getParametersId() {
        return parametersId;
    }

    public void setParametersId(long parametersId) {
        this.parametersId = parametersId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getTaskExecutionsId() {
        return taskExecutionsId;
    }

    public void setTaskExecutionsId(Long taskExecutionsId) {
        this.taskExecutionsId = taskExecutionsId;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getHasVariations() {
        return hasVariations;
    }

    public void setHasVariations(Boolean hasVariations) {
        this.hasVariations = hasVariations;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getClientEpoch() {
        return clientEpoch;
    }

    public void setClientEpoch(Long clientEpoch) {
        this.clientEpoch = clientEpoch;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getParameterValueApprovalId() {
        return parameterValueApprovalId;
    }

    public void setParameterValueApprovalId(Long parameterValueApprovalId) {
        this.parameterValueApprovalId = parameterValueApprovalId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    public Object getChoices() {
        return choices;
    }

    public void setChoices(Object choices) {
        this.choices = choices;
    }

    public Long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
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

    public Object getImpactedBy() {
        return impactedBy;
    }

    public void setImpactedBy(Object impactedBy) {
        this.impactedBy = impactedBy;
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
