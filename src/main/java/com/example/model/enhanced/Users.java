package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: users
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: email; employee_id, organisations_id, archived; username; 
 */
public class Users {

    // Fields
    private Boolean isSystemUser;
    private long createdAt;
    private Long organisationsId;
    private Object lastName;
    private Integer failedLoginAttempts;
    private Object type;
    private Long createdBy;
    private Integer failedAdditionalVerificationAttempts;
    private boolean archived;
    private Integer failedChallengeQuestionAttempts;
    private String password;
    private Long passwordUpdatedAt;
    private Long lockedAt;
    private Object employeeId;
    private Integer challengeQuestionsId;
    private Long modifiedBy;
    private Object challengeQuestionsAnswer;
    private long id;
    private Object state;
    private long modifiedAt;
    private Object department;
    private Object firstName;
    private Object email;
    private Object username;

    // Constructors
    public Users() {
    }

    // Constructor with required fields
    public Users(long createdAt, boolean archived, Object employeeId, long id, long modifiedAt, Object firstName) {
        this.createdAt = createdAt;
        this.archived = archived;
        this.employeeId = employeeId;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.firstName = firstName;
    }

    // Getters and Setters with constraint validation
    public Boolean getIsSystemUser() {
        return isSystemUser;
    }

    public void setIsSystemUser(Boolean isSystemUser) {
        this.isSystemUser = isSystemUser;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(Long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public Integer getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    public void setFailedLoginAttempts(Integer failedLoginAttempts) {
        this.failedLoginAttempts = failedLoginAttempts;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getFailedAdditionalVerificationAttempts() {
        return failedAdditionalVerificationAttempts;
    }

    public void setFailedAdditionalVerificationAttempts(Integer failedAdditionalVerificationAttempts) {
        this.failedAdditionalVerificationAttempts = failedAdditionalVerificationAttempts;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Integer getFailedChallengeQuestionAttempts() {
        return failedChallengeQuestionAttempts;
    }

    public void setFailedChallengeQuestionAttempts(Integer failedChallengeQuestionAttempts) {
        this.failedChallengeQuestionAttempts = failedChallengeQuestionAttempts;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Long getPasswordUpdatedAt() {
        return passwordUpdatedAt;
    }

    public void setPasswordUpdatedAt(Long passwordUpdatedAt) {
        this.passwordUpdatedAt = passwordUpdatedAt;
    }

    public Long getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(Long lockedAt) {
        this.lockedAt = lockedAt;
    }

    public Object getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Object employeeId) {
        if (employeeId == null) {
            throw new ConstraintViolationException("employee_id cannot be null");
        }
        this.employeeId = employeeId;
    }

    public Integer getChallengeQuestionsId() {
        return challengeQuestionsId;
    }

    public void setChallengeQuestionsId(Integer challengeQuestionsId) {
        this.challengeQuestionsId = challengeQuestionsId;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Object getChallengeQuestionsAnswer() {
        return challengeQuestionsAnswer;
    }

    public void setChallengeQuestionsAnswer(Object challengeQuestionsAnswer) {
        this.challengeQuestionsAnswer = challengeQuestionsAnswer;
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

    public long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Object getDepartment() {
        return department;
    }

    public void setDepartment(Object department) {
        this.department = department;
    }

    public Object getFirstName() {
        return firstName;
    }

    public void setFirstName(Object firstName) {
        if (firstName == null) {
            throw new ConstraintViolationException("first_name cannot be null");
        }
        this.firstName = firstName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (employeeId == null) {
            errors.add("employee_id is required");
        }
        if (firstName == null) {
            errors.add("first_name is required");
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
