package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: challenge_questions
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ChallengeQuestions {

    // Fields
    private boolean archived;
    private Object question;
    private Long modifiedBy;
    private long createdAt;
    private int id;
    private long modifiedAt;
    private Long createdBy;

    // Constructors
    public ChallengeQuestions() {
    }

    // Constructor with required fields
    public ChallengeQuestions(boolean archived, Object question, long createdAt, int id, long modifiedAt) {
        this.archived = archived;
        this.question = question;
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

    public Object getQuestion() {
        return question;
    }

    public void setQuestion(Object question) {
        if (question == null) {
            throw new ConstraintViolationException("question cannot be null");
        }
        this.question = question;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (question == null) {
            errors.add("question is required");
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
