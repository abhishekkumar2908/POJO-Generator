package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_locks
 * Generated with database constraint enforcement
 * Primary Key: sched_name, lock_name
 */
public class QrtzLocks {

    // Fields
    private Object lockName;
    private Object schedName;

    // Constructors
    public QrtzLocks() {
    }

    // Constructor with required fields
    public QrtzLocks(Object lockName, Object schedName) {
        this.lockName = lockName;
        this.schedName = schedName;
    }

    // Getters and Setters with constraint validation
    public Object getLockName() {
        return lockName;
    }

    public void setLockName(Object lockName) {
        if (lockName == null) {
            throw new ConstraintViolationException("lock_name cannot be null");
        }
        this.lockName = lockName;
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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (lockName == null) {
            errors.add("lock_name is required");
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
