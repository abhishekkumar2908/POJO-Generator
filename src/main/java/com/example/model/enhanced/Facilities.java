package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: facilities
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Facilities {

    // Fields
    private Object timeFormat;
    private Object logoUrl;
    private long organisationsId;
    private long createdAt;
    private Object timeZone;
    private Long createdBy;
    private Boolean archived;
    private Object name;
    private Long modifiedBy;
    private Object dateFormat;
    private long id;
    private long modifiedAt;
    private Object dateTimeFormat;

    // Constructors
    public Facilities() {
    }

    // Constructor with required fields
    public Facilities(Object timeFormat, long organisationsId, long createdAt, Object timeZone, Object dateFormat, long id, long modifiedAt, Object dateTimeFormat) {
        this.timeFormat = timeFormat;
        this.organisationsId = organisationsId;
        this.createdAt = createdAt;
        this.timeZone = timeZone;
        this.dateFormat = dateFormat;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.dateTimeFormat = dateTimeFormat;
    }

    // Getters and Setters with constraint validation
    public Object getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(Object timeFormat) {
        if (timeFormat == null) {
            throw new ConstraintViolationException("time_format cannot be null");
        }
        this.timeFormat = timeFormat;
    }

    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(Object timeZone) {
        if (timeZone == null) {
            throw new ConstraintViolationException("time_zone cannot be null");
        }
        this.timeZone = timeZone;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(Object dateFormat) {
        if (dateFormat == null) {
            throw new ConstraintViolationException("date_format cannot be null");
        }
        this.dateFormat = dateFormat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Object getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(Object dateTimeFormat) {
        if (dateTimeFormat == null) {
            throw new ConstraintViolationException("date_time_format cannot be null");
        }
        this.dateTimeFormat = dateTimeFormat;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (timeFormat == null) {
            errors.add("time_format is required");
        }
        if (dateFormat == null) {
            errors.add("date_format is required");
        }
        if (timeZone == null) {
            errors.add("time_zone is required");
        }
        if (dateTimeFormat == null) {
            errors.add("date_time_format is required");
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
