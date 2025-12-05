package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_calendars
 * Generated with database constraint enforcement
 * Primary Key: sched_name, calendar_name
 */
public class QrtzCalendars {

    // Fields
    private byte[] calendar;
    private Object schedName;
    private Object calendarName;

    // Constructors
    public QrtzCalendars() {
    }

    // Constructor with required fields
    public QrtzCalendars(byte[] calendar, Object schedName, Object calendarName) {
        this.calendar = calendar;
        this.schedName = schedName;
        this.calendarName = calendarName;
    }

    // Getters and Setters with constraint validation
    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        if (calendar == null) {
            throw new ConstraintViolationException("calendar cannot be null");
        }
        this.calendar = calendar;
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

    public Object getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(Object calendarName) {
        if (calendarName == null) {
            throw new ConstraintViolationException("calendar_name cannot be null");
        }
        this.calendarName = calendarName;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (calendar == null) {
            errors.add("calendar is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
        }
        if (calendarName == null) {
            errors.add("calendar_name is required");
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
