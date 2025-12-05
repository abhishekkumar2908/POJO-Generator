package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklists
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Checklists {

    // Fields
    private Object jobLogColumns;
    private Object code;
    private Long releasedBy;
    private long createdAt;
    private String description;
    private long organisationsId;
    private boolean isGlobal;
    private Long releasedAt;
    private long createdBy;
    private boolean archived;
    private Long useCasesId;
    private String name;
    private long modifiedBy;
    private int reviewCycle;
    private long id;
    private Object state;
    private long modifiedAt;
    private Object colorCode;
    private Long versionsId;

    // Constructors
    public Checklists() {
    }

    // Constructor with required fields
    public Checklists(Object code, long createdAt, long organisationsId, boolean isGlobal, long createdBy, boolean archived, String name, long modifiedBy, int reviewCycle, long id, Object state, long modifiedAt) {
        this.code = code;
        this.createdAt = createdAt;
        this.organisationsId = organisationsId;
        this.isGlobal = isGlobal;
        this.createdBy = createdBy;
        this.archived = archived;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.reviewCycle = reviewCycle;
        this.id = id;
        this.state = state;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getJobLogColumns() {
        return jobLogColumns;
    }

    public void setJobLogColumns(Object jobLogColumns) {
        this.jobLogColumns = jobLogColumns;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        if (code == null) {
            throw new ConstraintViolationException("code cannot be null");
        }
        this.code = code;
    }

    public Long getReleasedBy() {
        return releasedBy;
    }

    public void setReleasedBy(Long releasedBy) {
        this.releasedBy = releasedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public boolean getIsGlobal() {
        return isGlobal;
    }

    public void setIsGlobal(boolean isGlobal) {
        this.isGlobal = isGlobal;
    }

    public Long getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(Long releasedAt) {
        this.releasedAt = releasedAt;
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

    public Long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(Long useCasesId) {
        this.useCasesId = useCasesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name == null ? null : name.trim();
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public int getReviewCycle() {
        return reviewCycle;
    }

    public void setReviewCycle(int reviewCycle) {
        this.reviewCycle = reviewCycle;
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

    public Object getColorCode() {
        return colorCode;
    }

    public void setColorCode(Object colorCode) {
        this.colorCode = colorCode;
    }

    public Long getVersionsId() {
        return versionsId;
    }

    public void setVersionsId(Long versionsId) {
        this.versionsId = versionsId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (code == null) {
            errors.add("code is required");
        }
        if (name == null) {
            errors.add("name is required");
        }
        if (name != null && name.trim().isEmpty()) {
            errors.add("name cannot be empty");
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
