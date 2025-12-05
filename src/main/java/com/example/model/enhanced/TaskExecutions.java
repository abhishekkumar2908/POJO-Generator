package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: task_executions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class TaskExecutions {

    // Fields
    private String reason;
    private String recurringPrematureStartReason;
    private long createdAt;
    private Object type;
    private Long duration;
    private Long schedulingExpectedDueAt;
    private boolean continueRecurrence;
    private Long recurringExpectedStartedAt;
    private Long correctedBy;
    private String schedulePrematureStartReason;
    private Long endedBy;
    private long id;
    private Object state;
    private Long recurringExpectedDueAt;
    private long modifiedAt;
    private Long startedBy;
    private Boolean isScheduled;
    private Long schedulingExpectedStartedAt;
    private String recurringOverdueCompletionReason;
    private String scheduleOverdueCompletionReason;
    private long createdBy;
    private Boolean correctionEnabled;
    private Long correctedAt;
    private String correctionReason;
    private long tasksId;
    private long modifiedBy;
    private Long startedAt;
    private int orderTree;
    private long jobsId;
    private Long endedAt;
    private String recurringOverdueStartReason;

    // Constructors
    public TaskExecutions() {
    }

    // Constructor with required fields
    public TaskExecutions(long createdAt, Object type, boolean continueRecurrence, long id, Object state, long modifiedAt, long createdBy, long tasksId, long modifiedBy, int orderTree, long jobsId) {
        this.createdAt = createdAt;
        this.type = type;
        this.continueRecurrence = continueRecurrence;
        this.id = id;
        this.state = state;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.tasksId = tasksId;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.jobsId = jobsId;
    }

    // Getters and Setters with constraint validation
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRecurringPrematureStartReason() {
        return recurringPrematureStartReason;
    }

    public void setRecurringPrematureStartReason(String recurringPrematureStartReason) {
        this.recurringPrematureStartReason = recurringPrematureStartReason == null ? null : recurringPrematureStartReason.trim();
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getSchedulingExpectedDueAt() {
        return schedulingExpectedDueAt;
    }

    public void setSchedulingExpectedDueAt(Long schedulingExpectedDueAt) {
        this.schedulingExpectedDueAt = schedulingExpectedDueAt;
    }

    public boolean getContinueRecurrence() {
        return continueRecurrence;
    }

    public void setContinueRecurrence(boolean continueRecurrence) {
        this.continueRecurrence = continueRecurrence;
    }

    public Long getRecurringExpectedStartedAt() {
        return recurringExpectedStartedAt;
    }

    public void setRecurringExpectedStartedAt(Long recurringExpectedStartedAt) {
        this.recurringExpectedStartedAt = recurringExpectedStartedAt;
    }

    public Long getCorrectedBy() {
        return correctedBy;
    }

    public void setCorrectedBy(Long correctedBy) {
        this.correctedBy = correctedBy;
    }

    public String getSchedulePrematureStartReason() {
        return schedulePrematureStartReason;
    }

    public void setSchedulePrematureStartReason(String schedulePrematureStartReason) {
        this.schedulePrematureStartReason = schedulePrematureStartReason == null ? null : schedulePrematureStartReason.trim();
    }

    public Long getEndedBy() {
        return endedBy;
    }

    public void setEndedBy(Long endedBy) {
        this.endedBy = endedBy;
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
        if (state == null) {
            throw new ConstraintViolationException("state cannot be null");
        }
        this.state = state;
    }

    public Long getRecurringExpectedDueAt() {
        return recurringExpectedDueAt;
    }

    public void setRecurringExpectedDueAt(Long recurringExpectedDueAt) {
        this.recurringExpectedDueAt = recurringExpectedDueAt;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(Long startedBy) {
        this.startedBy = startedBy;
    }

    public Boolean getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public Long getSchedulingExpectedStartedAt() {
        return schedulingExpectedStartedAt;
    }

    public void setSchedulingExpectedStartedAt(Long schedulingExpectedStartedAt) {
        this.schedulingExpectedStartedAt = schedulingExpectedStartedAt;
    }

    public String getRecurringOverdueCompletionReason() {
        return recurringOverdueCompletionReason;
    }

    public void setRecurringOverdueCompletionReason(String recurringOverdueCompletionReason) {
        this.recurringOverdueCompletionReason = recurringOverdueCompletionReason == null ? null : recurringOverdueCompletionReason.trim();
    }

    public String getScheduleOverdueCompletionReason() {
        return scheduleOverdueCompletionReason;
    }

    public void setScheduleOverdueCompletionReason(String scheduleOverdueCompletionReason) {
        this.scheduleOverdueCompletionReason = scheduleOverdueCompletionReason == null ? null : scheduleOverdueCompletionReason.trim();
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getCorrectionEnabled() {
        return correctionEnabled;
    }

    public void setCorrectionEnabled(Boolean correctionEnabled) {
        this.correctionEnabled = correctionEnabled;
    }

    public Long getCorrectedAt() {
        return correctedAt;
    }

    public void setCorrectedAt(Long correctedAt) {
        this.correctedAt = correctedAt;
    }

    public String getCorrectionReason() {
        return correctionReason;
    }

    public void setCorrectionReason(String correctionReason) {
        this.correctionReason = correctionReason == null ? null : correctionReason.trim();
    }

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

    public Long getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
    }

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }

    public Long getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Long endedAt) {
        this.endedAt = endedAt;
    }

    public String getRecurringOverdueStartReason() {
        return recurringOverdueStartReason;
    }

    public void setRecurringOverdueStartReason(String recurringOverdueStartReason) {
        this.recurringOverdueStartReason = recurringOverdueStartReason == null ? null : recurringOverdueStartReason.trim();
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (state == null) {
            errors.add("state is required");
        }
        if (type == null) {
            errors.add("type is required");
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
