package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: services
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: name; error_code_range; 
 */
public class Services {

    // Fields
    private boolean archived;
    private String resetPasswordPath;
    private String registrationPath;
    private String loginPath;
    private Long modifiedBy;
    private Object name;
    private long createdAt;
    private Object id;
    private long modifiedAt;
    private Long createdBy;
    private Object errorCodeRange;

    // Constructors
    public Services() {
    }

    // Constructor with required fields
    public Services(boolean archived, long createdAt, Object id, long modifiedAt) {
        this.archived = archived;
        this.createdAt = createdAt;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getResetPasswordPath() {
        return resetPasswordPath;
    }

    public void setResetPasswordPath(String resetPasswordPath) {
        this.resetPasswordPath = resetPasswordPath == null ? null : resetPasswordPath.trim();
    }

    public String getRegistrationPath() {
        return registrationPath;
    }

    public void setRegistrationPath(String registrationPath) {
        this.registrationPath = registrationPath == null ? null : registrationPath.trim();
    }

    public String getLoginPath() {
        return loginPath;
    }

    public void setLoginPath(String loginPath) {
        this.loginPath = loginPath == null ? null : loginPath.trim();
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        if (id == null) {
            throw new ConstraintViolationException("id cannot be null");
        }
        this.id = id;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Object getErrorCodeRange() {
        return errorCodeRange;
    }

    public void setErrorCodeRange(Object errorCodeRange) {
        this.errorCodeRange = errorCodeRange;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (id == null) {
            errors.add("id is required");
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
