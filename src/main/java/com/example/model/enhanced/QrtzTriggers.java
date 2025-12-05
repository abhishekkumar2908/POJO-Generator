package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_triggers
 * Generated with database constraint enforcement
 * Primary Key: sched_name, trigger_name, trigger_group
 */
public class QrtzTriggers {

    // Fields
    private Object schedName;
    private Object jobGroup;
    private Object triggerType;
    private Long endTime;
    private Object description;
    private Object triggerState;
    private Integer priority;
    private Object calendarName;
    private Object triggerGroup;
    private Short misfireInstr;
    private Object triggerName;
    private long startTime;
    private Object jobName;
    private byte[] jobData;
    private Long prevFireTime;
    private Long nextFireTime;

    // Constructors
    public QrtzTriggers() {
    }

    // Constructor with required fields
    public QrtzTriggers(Object schedName, Object jobGroup, Object triggerType, Object triggerState, Object triggerGroup, Object triggerName, long startTime, Object jobName) {
        this.schedName = schedName;
        this.jobGroup = jobGroup;
        this.triggerType = triggerType;
        this.triggerState = triggerState;
        this.triggerGroup = triggerGroup;
        this.triggerName = triggerName;
        this.startTime = startTime;
        this.jobName = jobName;
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

    public Object getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(Object jobGroup) {
        if (jobGroup == null) {
            throw new ConstraintViolationException("job_group cannot be null");
        }
        this.jobGroup = jobGroup;
    }

    public Object getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(Object triggerType) {
        if (triggerType == null) {
            throw new ConstraintViolationException("trigger_type cannot be null");
        }
        this.triggerType = triggerType;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(Object triggerState) {
        if (triggerState == null) {
            throw new ConstraintViolationException("trigger_state cannot be null");
        }
        this.triggerState = triggerState;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Object getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(Object calendarName) {
        this.calendarName = calendarName;
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

    public Short getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
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

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
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

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    public Long getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
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
        if (jobName == null) {
            errors.add("job_name is required");
        }
        if (jobGroup == null) {
            errors.add("job_group is required");
        }
        if (triggerType == null) {
            errors.add("trigger_type is required");
        }
        if (triggerState == null) {
            errors.add("trigger_state is required");
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
