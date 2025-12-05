package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: corrections_media_mapping
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class CorrectionsMediaMapping {

    // Fields
    private boolean archived;
    private long parameterValuesId;
    private boolean isOldMedia;
    private long modifiedBy;
    private long createdAt;
    private long correctionsId;
    private long mediasId;
    private long id;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public CorrectionsMediaMapping() {
    }

    // Constructor with required fields
    public CorrectionsMediaMapping(boolean archived, long parameterValuesId, boolean isOldMedia, long modifiedBy, long createdAt, long correctionsId, long mediasId, long id, long modifiedAt, long createdBy) {
        this.archived = archived;
        this.parameterValuesId = parameterValuesId;
        this.isOldMedia = isOldMedia;
        this.modifiedBy = modifiedBy;
        this.createdAt = createdAt;
        this.correctionsId = correctionsId;
        this.mediasId = mediasId;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public long getParameterValuesId() {
        return parameterValuesId;
    }

    public void setParameterValuesId(long parameterValuesId) {
        this.parameterValuesId = parameterValuesId;
    }

    public boolean getIsOldMedia() {
        return isOldMedia;
    }

    public void setIsOldMedia(boolean isOldMedia) {
        this.isOldMedia = isOldMedia;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getCorrectionsId() {
        return correctionsId;
    }

    public void setCorrectionsId(long correctionsId) {
        this.correctionsId = correctionsId;
    }

    public long getMediasId() {
        return mediasId;
    }

    public void setMediasId(long mediasId) {
        this.mediasId = mediasId;
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
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
