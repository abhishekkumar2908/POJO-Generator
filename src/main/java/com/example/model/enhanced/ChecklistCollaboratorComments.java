package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklist_collaborator_comments
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ChecklistCollaboratorComments {

    // Fields
    private long checklistCollaboratorMappingsId;
    private String comments;
    private Long modifiedBy;
    private long checklistsId;
    private Long createdAt;
    private long id;
    private Long modifiedAt;
    private Long createdBy;
    private Object reviewState;

    // Constructors
    public ChecklistCollaboratorComments() {
    }

    // Constructor with required fields
    public ChecklistCollaboratorComments(long checklistCollaboratorMappingsId, String comments, long checklistsId, long id) {
        this.checklistCollaboratorMappingsId = checklistCollaboratorMappingsId;
        this.comments = comments;
        this.checklistsId = checklistsId;
        this.id = id;
    }

    // Getters and Setters with constraint validation
    public long getChecklistCollaboratorMappingsId() {
        return checklistCollaboratorMappingsId;
    }

    public void setChecklistCollaboratorMappingsId(long checklistCollaboratorMappingsId) {
        this.checklistCollaboratorMappingsId = checklistCollaboratorMappingsId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        if (comments == null) {
            throw new ConstraintViolationException("comments cannot be null");
        }
        this.comments = comments == null ? null : comments.trim();
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Object getReviewState() {
        return reviewState;
    }

    public void setReviewState(Object reviewState) {
        this.reviewState = reviewState;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (comments == null) {
            errors.add("comments is required");
        }
        if (comments != null && comments.trim().isEmpty()) {
            errors.add("comments cannot be empty");
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
