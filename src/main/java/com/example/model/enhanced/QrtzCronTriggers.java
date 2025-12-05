package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_cron_triggers
 * Generated with database constraint enforcement
 * Primary Key: sched_name, trigger_name, trigger_group
 */
public class QrtzCronTriggers {

    // Fields
    private Object triggerName;
    private Object schedName;
    private Object cronExpression;
    private Object timeZoneId;
    private Object triggerGroup;

    // Constructors
    public QrtzCronTriggers() {
    }

    // Constructor with required fields
    public QrtzCronTriggers(Object triggerName, Object schedName, Object cronExpression, Object triggerGroup) {
        this.triggerName = triggerName;
        this.schedName = schedName;
        this.cronExpression = cronExpression;
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

    public Object getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(Object cronExpression) {
        if (cronExpression == null) {
            throw new ConstraintViolationException("cron_expression cannot be null");
        }
        this.cronExpression = cronExpression;
    }

    public Object getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(Object timeZoneId) {
        this.timeZoneId = timeZoneId;
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
        if (cronExpression == null) {
            errors.add("cron_expression is required");
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
