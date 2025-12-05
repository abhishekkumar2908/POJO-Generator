package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_scheduler_state
 * Generated with database constraint enforcement
 * Primary Key: sched_name, instance_name
 */
public class QrtzSchedulerState {

    // Fields
    private Object instanceName;
    private Object schedName;
    private long lastCheckinTime;
    private long checkinInterval;

    // Constructors
    public QrtzSchedulerState() {
    }

    // Constructor with required fields
    public QrtzSchedulerState(Object instanceName, Object schedName, long lastCheckinTime, long checkinInterval) {
        this.instanceName = instanceName;
        this.schedName = schedName;
        this.lastCheckinTime = lastCheckinTime;
        this.checkinInterval = checkinInterval;
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

    public long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (instanceName == null) {
            errors.add("instance_name is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
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
