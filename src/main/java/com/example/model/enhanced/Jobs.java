package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: jobs
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Jobs {

    // Fields
    private Object code;
    private Long expectedStartDate;
    private long createdAt;
    private long organisationsId;
    private Long expectedEndDate;
    private long facilitiesId;
    private long createdBy;
    private Long schedulersId;
    private long useCasesId;
    private long checklistsId;
    private long modifiedBy;
    private Long startedAt;
    private Long endedBy;
    private long id;
    private Object state;
    private long modifiedAt;
    private Long checklistAncestorId;
    private Long startedBy;
    private Boolean isScheduled;
    private Long endedAt;

    // Constructors
    public Jobs() {
    }

    // Constructor with required fields
    public Jobs(Object code, long createdAt, long organisationsId, long facilitiesId, long createdBy, long useCasesId, long checklistsId, long modifiedBy, long id, Object state, long modifiedAt) {
        this.code = code;
        this.createdAt = createdAt;
        this.organisationsId = organisationsId;
        this.facilitiesId = facilitiesId;
        this.createdBy = createdBy;
        this.useCasesId = useCasesId;
        this.checklistsId = checklistsId;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.state = state;
        this.modifiedAt = modifiedAt;
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

    public Long getExpectedStartDate() {
        return expectedStartDate;
    }

    public void setExpectedStartDate(Long expectedStartDate) {
        this.expectedStartDate = expectedStartDate;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public Long getExpectedEndDate() {
        return expectedEndDate;
    }

    public void setExpectedEndDate(Long expectedEndDate) {
        this.expectedEndDate = expectedEndDate;
    }

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getSchedulersId() {
        return schedulersId;
    }

    public void setSchedulersId(Long schedulersId) {
        this.schedulersId = schedulersId;
    }

    public long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(long useCasesId) {
        this.useCasesId = useCasesId;
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

    public Long getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    public Long getEndedBy() {
        return endedBy;
    }

    public void setEndedBy(Long endedBy) {
        this.endedBy = endedBy;
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

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getChecklistAncestorId() {
        return checklistAncestorId;
    }

    public void setChecklistAncestorId(Long checklistAncestorId) {
        this.checklistAncestorId = checklistAncestorId;
    }

    public Long getStartedBy() {
        return startedBy;
    }

    public void setStartedBy(Long startedBy) {
        this.startedBy = startedBy;
    }

    public Boolean getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(Boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public Long getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Long endedAt) {
        this.endedAt = endedAt;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (code == null) {
            errors.add("code is required");
        }
        if (state == null) {
            errors.add("state is required");
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
