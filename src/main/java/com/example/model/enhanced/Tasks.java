package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: tasks
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Tasks {

    // Fields
    private Object timerOperator;
    private boolean hasStop;
    private boolean hasExecutorLock;
    private Long minPeriod;
    private boolean isSoloTask;
    private long createdAt;
    private boolean isMandatory;
    private Long taskSchedulesId;
    private long createdBy;
    private Long maxPeriod;
    private long stagesId;
    private Boolean hasInterlocks;
    private boolean archived;
    private Long taskRecurrencesId;
    private Boolean enableScheduling;
    private Object name;
    private long modifiedBy;
    private int orderTree;
    private boolean isTimed;
    private long id;
    private Boolean enableRecurrence;
    private long modifiedAt;
    private Boolean hasBulkVerification;

    // Constructors
    public Tasks() {
    }

    // Constructor with required fields
    public Tasks(boolean hasStop, boolean hasExecutorLock, boolean isSoloTask, long createdAt, boolean isMandatory, long createdBy, long stagesId, boolean archived, Object name, long modifiedBy, int orderTree, boolean isTimed, long id, long modifiedAt) {
        this.hasStop = hasStop;
        this.hasExecutorLock = hasExecutorLock;
        this.isSoloTask = isSoloTask;
        this.createdAt = createdAt;
        this.isMandatory = isMandatory;
        this.createdBy = createdBy;
        this.stagesId = stagesId;
        this.archived = archived;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.isTimed = isTimed;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getTimerOperator() {
        return timerOperator;
    }

    public void setTimerOperator(Object timerOperator) {
        this.timerOperator = timerOperator;
    }

    public boolean getHasStop() {
        return hasStop;
    }

    public void setHasStop(boolean hasStop) {
        this.hasStop = hasStop;
    }

    public boolean getHasExecutorLock() {
        return hasExecutorLock;
    }

    public void setHasExecutorLock(boolean hasExecutorLock) {
        this.hasExecutorLock = hasExecutorLock;
    }

    public Long getMinPeriod() {
        return minPeriod;
    }

    public void setMinPeriod(Long minPeriod) {
        this.minPeriod = minPeriod;
    }

    public boolean getIsSoloTask() {
        return isSoloTask;
    }

    public void setIsSoloTask(boolean isSoloTask) {
        this.isSoloTask = isSoloTask;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Long getTaskSchedulesId() {
        return taskSchedulesId;
    }

    public void setTaskSchedulesId(Long taskSchedulesId) {
        this.taskSchedulesId = taskSchedulesId;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getMaxPeriod() {
        return maxPeriod;
    }

    public void setMaxPeriod(Long maxPeriod) {
        this.maxPeriod = maxPeriod;
    }

    public long getStagesId() {
        return stagesId;
    }

    public void setStagesId(long stagesId) {
        this.stagesId = stagesId;
    }

    public Boolean getHasInterlocks() {
        return hasInterlocks;
    }

    public void setHasInterlocks(Boolean hasInterlocks) {
        this.hasInterlocks = hasInterlocks;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Long getTaskRecurrencesId() {
        return taskRecurrencesId;
    }

    public void setTaskRecurrencesId(Long taskRecurrencesId) {
        this.taskRecurrencesId = taskRecurrencesId;
    }

    public Boolean getEnableScheduling() {
        return enableScheduling;
    }

    public void setEnableScheduling(Boolean enableScheduling) {
        this.enableScheduling = enableScheduling;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
    }

    public boolean getIsTimed() {
        return isTimed;
    }

    public void setIsTimed(boolean isTimed) {
        this.isTimed = isTimed;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getEnableRecurrence() {
        return enableRecurrence;
    }

    public void setEnableRecurrence(Boolean enableRecurrence) {
        this.enableRecurrence = enableRecurrence;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Boolean getHasBulkVerification() {
        return hasBulkVerification;
    }

    public void setHasBulkVerification(Boolean hasBulkVerification) {
        this.hasBulkVerification = hasBulkVerification;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (name == null) {
            errors.add("name is required");
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
