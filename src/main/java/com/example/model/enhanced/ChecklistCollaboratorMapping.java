package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklist_collaborator_mapping
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ChecklistCollaboratorMapping {

    // Fields
    private int phase;
    private Long modifiedBy;
    private long checklistsId;
    private Long createdAt;
    private int orderTree;
    private long usersId;
    private Object phaseType;
    private long id;
    private Object state;
    private Long modifiedAt;
    private Object type;
    private Long createdBy;

    // Constructors
    public ChecklistCollaboratorMapping() {
    }

    // Constructor with required fields
    public ChecklistCollaboratorMapping(int phase, long checklistsId, int orderTree, long usersId, Object phaseType, long id, Object type) {
        this.phase = phase;
        this.checklistsId = checklistsId;
        this.orderTree = orderTree;
        this.usersId = usersId;
        this.phaseType = phaseType;
        this.id = id;
        this.type = type;
    }

    // Getters and Setters with constraint validation
    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
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

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
    }

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(long usersId) {
        this.usersId = usersId;
    }

    public Object getPhaseType() {
        return phaseType;
    }

    public void setPhaseType(Object phaseType) {
        if (phaseType == null) {
            throw new ConstraintViolationException("phase_type cannot be null");
        }
        this.phaseType = phaseType;
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
        this.state = state;
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
        if (type == null) {
            throw new ConstraintViolationException("type cannot be null");
        }
        this.type = type;
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

        if (phaseType == null) {
            errors.add("phase_type is required");
        }
        if (type == null) {
            errors.add("type is required");
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
