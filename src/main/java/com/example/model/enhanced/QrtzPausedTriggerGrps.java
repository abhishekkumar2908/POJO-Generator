package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_paused_trigger_grps
 * Generated with database constraint enforcement
 * Primary Key: sched_name, trigger_group
 */
public class QrtzPausedTriggerGrps {

    // Fields
    private Object schedName;
    private Object triggerGroup;

    // Constructors
    public QrtzPausedTriggerGrps() {
    }

    // Constructor with required fields
    public QrtzPausedTriggerGrps(Object schedName, Object triggerGroup) {
        this.schedName = schedName;
        this.triggerGroup = triggerGroup;
    }

    // Getters and Setters with constraint validation
    public Object getSchedName() {
        return schedName;
    }

    public void setSchedName(Object schedName) {
        if (schedName == null) {
            throw new ConstraintViolationException("sched_name cannot be null");
        }
        this.schedName = schedName;
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
