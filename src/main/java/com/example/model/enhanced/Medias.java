package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: medias
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Medias {

    // Fields
    private String description;
    private long createdAt;
    private long organisationsId;
    private Object type;
    private long createdBy;
    private boolean archived;
    private Object filename;
    private Object originalFilename;
    private Object name;
    private long modifiedBy;
    private long id;
    private Object relativePath;
    private long modifiedAt;

    // Constructors
    public Medias() {
    }

    // Constructor with required fields
    public Medias(long createdAt, long organisationsId, Object type, long createdBy, boolean archived, Object filename, long modifiedBy, long id, Object relativePath, long modifiedAt) {
        this.createdAt = createdAt;
        this.organisationsId = organisationsId;
        this.type = type;
        this.createdBy = createdBy;
        this.archived = archived;
        this.filename = filename;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.relativePath = relativePath;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
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

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        if (type == null) {
            throw new ConstraintViolationException("type cannot be null");
        }
        this.type = type;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Object getFilename() {
        return filename;
    }

    public void setFilename(Object filename) {
        if (filename == null) {
            throw new ConstraintViolationException("filename cannot be null");
        }
        this.filename = filename;
    }

    public Object getOriginalFilename() {
        return originalFilename;
    }

    public void setOriginalFilename(Object originalFilename) {
        this.originalFilename = originalFilename;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(Object relativePath) {
        if (relativePath == null) {
            throw new ConstraintViolationException("relative_path cannot be null");
        }
        this.relativePath = relativePath;
    }

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (filename == null) {
            errors.add("filename is required");
        }
        if (type == null) {
            errors.add("type is required");
        }
        if (relativePath == null) {
            errors.add("relative_path is required");
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
