package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: versions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Versions {

    // Fields
    private Long parent;
    private Long deprecatedAt;
    private Long ancestor;
    private Long modifiedBy;
    private Long createdAt;
    private Long self;
    private Long versionedAt;
    private long id;
    private Long modifiedAt;
    private Object type;
    private Integer version;
    private Long createdBy;

    // Constructors
    public Versions() {
    }

    // Constructor with required fields
    public Versions(long id) {
        this.id = id;
    }

    // Getters and Setters with constraint validation
    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getDeprecatedAt() {
        return deprecatedAt;
    }

    public void setDeprecatedAt(Long deprecatedAt) {
        this.deprecatedAt = deprecatedAt;
    }

    public Long getAncestor() {
        return ancestor;
    }

    public void setAncestor(Long ancestor) {
        this.ancestor = ancestor;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getSelf() {
        return self;
    }

    public void setSelf(Long self) {
        this.self = self;
    }

    public Long getVersionedAt() {
        return versionedAt;
    }

    public void setVersionedAt(Long versionedAt) {
        this.versionedAt = versionedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

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
