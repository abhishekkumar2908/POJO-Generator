package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: job_audits
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class JobAudits {

    // Fields
    private Long tasksId;
    private long triggeredAt;
    private Object action;
    private long organisationsId;
    private String details;
    private long id;
    private long triggeredBy;
    private long jobsId;
    private Object parameters;
    private Long stagesId;

    // Constructors
    public JobAudits() {
    }

    // Constructor with required fields
    public JobAudits(long triggeredAt, long organisationsId, long id, long triggeredBy, long jobsId, Object parameters) {
        this.triggeredAt = triggeredAt;
        this.organisationsId = organisationsId;
        this.id = id;
        this.triggeredBy = triggeredBy;
        this.jobsId = jobsId;
        this.parameters = parameters;
    }

    // Getters and Setters with constraint validation
    public Long getTasksId() {
        return tasksId;
    }

    public void setTasksId(Long tasksId) {
        this.tasksId = tasksId;
    }

    public long getTriggeredAt() {
        return triggeredAt;
    }

    public void setTriggeredAt(long triggeredAt) {
        this.triggeredAt = triggeredAt;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(long triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        if (parameters == null) {
            throw new ConstraintViolationException("parameters cannot be null");
        }
        this.parameters = parameters;
    }

    public Long getStagesId() {
        return stagesId;
    }

    public void setStagesId(Long stagesId) {
        this.stagesId = stagesId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (parameters == null) {
            errors.add("parameters is required");
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
