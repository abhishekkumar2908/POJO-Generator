package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_simple_triggers
 * Generated with database constraint enforcement
 * Primary Key: sched_name, trigger_name, trigger_group
 */
public class QrtzSimpleTriggers {

    // Fields
    private Object triggerName;
    private Object schedName;
    private long repeatInterval;
    private long repeatCount;
    private long timesTriggered;
    private Object triggerGroup;

    // Constructors
    public QrtzSimpleTriggers() {
    }

    // Constructor with required fields
    public QrtzSimpleTriggers(Object triggerName, Object schedName, long repeatInterval, long repeatCount, long timesTriggered, Object triggerGroup) {
        this.triggerName = triggerName;
        this.schedName = schedName;
        this.repeatInterval = repeatInterval;
        this.repeatCount = repeatCount;
        this.timesTriggered = timesTriggered;
        this.triggerGroup = triggerGroup;
    }

    // Getters and Setters with constraint validation
    public Object getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(Object triggerName) {
        if (triggerName == null) {
            throw new ConstraintViolationException("trigger_name cannot be null");
        }
        this.triggerName = triggerName;
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

    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(long timesTriggered) {
        this.timesTriggered = timesTriggered;
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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (triggerName == null) {
            errors.add("trigger_name is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
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
