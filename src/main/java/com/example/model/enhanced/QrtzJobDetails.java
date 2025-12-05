package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_job_details
 * Generated with database constraint enforcement
 * Primary Key: sched_name, job_name, job_group
 */
public class QrtzJobDetails {

    // Fields
    private Object jobClassName;
    private boolean isDurable;
    private boolean isUpdateData;
    private Object schedName;
    private Object jobName;
    private Object jobGroup;
    private boolean isNonconcurrent;
    private byte[] jobData;
    private Object description;
    private boolean requestsRecovery;

    // Constructors
    public QrtzJobDetails() {
    }

    // Constructor with required fields
    public QrtzJobDetails(Object jobClassName, boolean isDurable, boolean isUpdateData, Object schedName, Object jobName, Object jobGroup, boolean isNonconcurrent, boolean requestsRecovery) {
        this.jobClassName = jobClassName;
        this.isDurable = isDurable;
        this.isUpdateData = isUpdateData;
        this.schedName = schedName;
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.isNonconcurrent = isNonconcurrent;
        this.requestsRecovery = requestsRecovery;
    }

    // Getters and Setters with constraint validation
    public Object getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(Object jobClassName) {
        if (jobClassName == null) {
            throw new ConstraintViolationException("job_class_name cannot be null");
        }
        this.jobClassName = jobClassName;
    }

    public boolean getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(boolean isDurable) {
        this.isDurable = isDurable;
    }

    public boolean getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(boolean isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    public Object getSchedName() {
        return schedName;
    }

    public void setSchedName(Object schedName) {
        if (schedName == null) {
            throw new ConstraintViolationException("sched_name cannot be null");
        }
        this.schedName = schedName;
    }

    public Object getJobName() {
        return jobName;
    }

    public void setJobName(Object jobName) {
        if (jobName == null) {
            throw new ConstraintViolationException("job_name cannot be null");
        }
        this.jobName = jobName;
    }

    public Object getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(Object jobGroup) {
        if (jobGroup == null) {
            throw new ConstraintViolationException("job_group cannot be null");
        }
        this.jobGroup = jobGroup;
    }

    public boolean getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(boolean isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public boolean getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(boolean requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (jobClassName == null) {
            errors.add("job_class_name is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
        }
        if (jobName == null) {
            errors.add("job_name is required");
        }
        if (jobGroup == null) {
            errors.add("job_group is required");
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
