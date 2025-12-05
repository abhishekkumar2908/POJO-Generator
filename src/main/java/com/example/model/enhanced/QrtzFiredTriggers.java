package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_fired_triggers
 * Generated with database constraint enforcement
 * Primary Key: sched_name, entry_id
 */
public class QrtzFiredTriggers {

    // Fields
    private Object instanceName;
    private Object schedName;
    private Object jobGroup;
    private Boolean isNonconcurrent;
    private int priority;
    private Object triggerGroup;
    private long schedTime;
    private Object triggerName;
    private Object jobName;
    private Boolean requestsRecovery;
    private long firedTime;
    private Object state;
    private Object entryId;

    // Constructors
    public QrtzFiredTriggers() {
    }

    // Constructor with required fields
    public QrtzFiredTriggers(Object instanceName, Object schedName, int priority, Object triggerGroup, long schedTime, Object triggerName, long firedTime, Object state, Object entryId) {
        this.instanceName = instanceName;
        this.schedName = schedName;
        this.priority = priority;
        this.triggerGroup = triggerGroup;
        this.schedTime = schedTime;
        this.triggerName = triggerName;
        this.firedTime = firedTime;
        this.state = state;
        this.entryId = entryId;
    }

    // Getters and Setters with constraint validation
    public Object getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(Object instanceName) {
        if (instanceName == null) {
            throw new ConstraintViolationException("instance_name cannot be null");
        }
        this.instanceName = instanceName;
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

    public Object getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(Object jobGroup) {
        this.jobGroup = jobGroup;
    }

    public Boolean getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(Boolean isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Object getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(Object triggerGroup) {
        if (triggerGroup == null) {
            throw new ConstraintViolationException("trigger_group cannot be null");
        }
        this.triggerGroup = triggerGroup;
    }

    public long getSchedTime() {
        return schedTime;
    }

    public void setSchedTime(long schedTime) {
        this.schedTime = schedTime;
    }

    public Object getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(Object triggerName) {
        if (triggerName == null) {
            throw new ConstraintViolationException("trigger_name cannot be null");
        }
        this.triggerName = triggerName;
    }

    public Object getJobName() {
        return jobName;
    }

    public void setJobName(Object jobName) {
        this.jobName = jobName;
    }

    public Boolean getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(Boolean requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public long getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(long firedTime) {
        this.firedTime = firedTime;
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

    public Object getEntryId() {
        return entryId;
    }

    public void setEntryId(Object entryId) {
        if (entryId == null) {
            throw new ConstraintViolationException("entry_id cannot be null");
        }
        this.entryId = entryId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (triggerName == null) {
            errors.add("trigger_name is required");
        }
        if (instanceName == null) {
            errors.add("instance_name is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
        }
        if (state == null) {
            errors.add("state is required");
        }
        if (entryId == null) {
            errors.add("entry_id is required");
        }
        if (triggerGroup == null) {
            errors.add("trigger_group is required");
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
