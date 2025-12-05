package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: schedulers
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Schedulers {

    // Fields
    private Object code;
    private Boolean isCustomRecurrence;
    private Object data;
    private long expectedStartDate;
    private Boolean isRepeated;
    private String description;
    private long createdAt;
    private long facilitiesId;
    private Integer dueDateInterval;
    private long createdBy;
    private Boolean enabled;
    private long useCasesId;
    private Boolean archived;
    private Long deprecatedAt;
    private Object name;
    private long checklistsId;
    private long modifiedBy;
    private String recurrenceRule;
    private long id;
    private Object state;
    private Object checklistsName;
    private Object dueDateDuration;
    private long modifiedAt;
    private long versionsId;

    // Constructors
    public Schedulers() {
    }

    // Constructor with required fields
    public Schedulers(Object code, Object data, long expectedStartDate, long createdAt, long facilitiesId, long createdBy, long useCasesId, Object name, long checklistsId, long modifiedBy, long id, Object state, Object checklistsName, long modifiedAt, long versionsId) {
        this.code = code;
        this.data = data;
        this.expectedStartDate = expectedStartDate;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.createdBy = createdBy;
        this.useCasesId = useCasesId;
        this.name = name;
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.state = state;
        this.checklistsName = checklistsName;
        this.modifiedAt = modifiedAt;
        this.versionsId = versionsId;
    }

    // Getters and Setters with constraint validation
    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        if (code == null) {
            throw new ConstraintViolationException("code cannot be null");
        }
        this.code = code;
    }

    public Boolean getIsCustomRecurrence() {
        return isCustomRecurrence;
    }

    public void setIsCustomRecurrence(Boolean isCustomRecurrence) {
        this.isCustomRecurrence = isCustomRecurrence;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        if (data == null) {
            throw new ConstraintViolationException("data cannot be null");
        }
        this.data = data;
    }

    public long getExpectedStartDate() {
        return expectedStartDate;
    }

    public void setExpectedStartDate(long expectedStartDate) {
        this.expectedStartDate = expectedStartDate;
    }

    public Boolean getIsRepeated() {
        return isRepeated;
    }

    public void setIsRepeated(Boolean isRepeated) {
        this.isRepeated = isRepeated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public Integer getDueDateInterval() {
        return dueDateInterval;
    }

    public void setDueDateInterval(Integer dueDateInterval) {
        this.dueDateInterval = dueDateInterval;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(long useCasesId) {
        this.useCasesId = useCasesId;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Long getDeprecatedAt() {
        return deprecatedAt;
    }

    public void setDeprecatedAt(Long deprecatedAt) {
        this.deprecatedAt = deprecatedAt;
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

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getRecurrenceRule() {
        return recurrenceRule;
    }

    public void setRecurrenceRule(String recurrenceRule) {
        this.recurrenceRule = recurrenceRule == null ? null : recurrenceRule.trim();
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

    public Object getChecklistsName() {
        return checklistsName;
    }

    public void setChecklistsName(Object checklistsName) {
        if (checklistsName == null) {
            throw new ConstraintViolationException("checklists_name cannot be null");
        }
        this.checklistsName = checklistsName;
    }

    public Object getDueDateDuration() {
        return dueDateDuration;
    }

    public void setDueDateDuration(Object dueDateDuration) {
        this.dueDateDuration = dueDateDuration;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public long getVersionsId() {
        return versionsId;
    }

    public void setVersionsId(long versionsId) {
        this.versionsId = versionsId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (code == null) {
            errors.add("code is required");
        }
        if (data == null) {
            errors.add("data is required");
        }
        if (name == null) {
            errors.add("name is required");
        }
        if (state == null) {
            errors.add("state is required");
        }
        if (checklistsName == null) {
            errors.add("checklists_name is required");
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
