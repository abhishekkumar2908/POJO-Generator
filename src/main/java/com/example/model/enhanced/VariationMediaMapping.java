package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: variation_media_mapping
 * Generated with database constraint enforcement
 * Primary Key: medias_id, variations_id
 */
public class VariationMediaMapping {

    // Fields
    private Boolean archived;
    private long variationsId;
    private long modifiedBy;
    private long mediasId;
    private long createdAt;
    private long modifiedAt;
    private long createdBy;

    // Constructors
    public VariationMediaMapping() {
    }

    // Constructor with required fields
    public VariationMediaMapping(long variationsId, long modifiedBy, long mediasId, long createdAt, long modifiedAt, long createdBy) {
        this.variationsId = variationsId;
        this.modifiedBy = modifiedBy;
        this.mediasId = mediasId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
    }

    // Getters and Setters with constraint validation
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public long getVariationsId() {
        return variationsId;
    }

    public void setVariationsId(long variationsId) {
        this.variationsId = variationsId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getMediasId() {
        return mediasId;
    }

    public void setMediasId(long mediasId) {
        this.mediasId = mediasId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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
