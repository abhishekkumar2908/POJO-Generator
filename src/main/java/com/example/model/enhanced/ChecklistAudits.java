package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: checklist_audits
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ChecklistAudits {

    // Fields
    private Long triggeredFor;
    private Long tasksId;
    private long checklistsId;
    private long triggeredAt;
    private Object action;
    private long organisationsId;
    private String details;
    private long id;
    private long triggeredBy;
    private Long stagesId;

    // Constructors
    public ChecklistAudits() {
    }

    // Constructor with required fields
    public ChecklistAudits(long checklistsId, long triggeredAt, long organisationsId, long id, long triggeredBy) {
        this.checklistsId = checklistsId;
        this.triggeredAt = triggeredAt;
        this.organisationsId = organisationsId;
        this.id = id;
        this.triggeredBy = triggeredBy;
    }

    // Getters and Setters with constraint validation
    public Long getTriggeredFor() {
        return triggeredFor;
    }

    public void setTriggeredFor(Long triggeredFor) {
        this.triggeredFor = triggeredFor;
    }

    public Long getTasksId() {
        return tasksId;
    }

    public void setTasksId(Long tasksId) {
        this.tasksId = tasksId;
    }

    public long getChecklistsId() {
        return checklistsId;
    }

    public void setChecklistsId(long checklistsId) {
        this.checklistsId = checklistsId;
    }

    public long getTriggeredAt() {
        return triggeredAt;
    }

    public void setTriggeredAt(long triggeredAt) {
        this.triggeredAt = triggeredAt;
    }

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(long triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public Long getStagesId() {
        return stagesId;
    }

    public void setStagesId(Long stagesId) {
        this.stagesId = stagesId;
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
