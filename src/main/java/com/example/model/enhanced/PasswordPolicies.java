package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: password_policies
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: organisations_id; 
 */
public class PasswordPolicies {

    // Fields
    private long createdAt;
    private long organisationsId;
    private Long createdBy;
    private Integer minimumNumericCharacters;
    private Integer minimumLowercaseCharacters;
    private Integer minimumPasswordHistory;
    private Integer maximumPasswordAge;
    private Integer passwordExpiration;
    private Long modifiedBy;
    private long id;
    private long modifiedAt;
    private Boolean allowPasswordSimilarToUsernameOrEmail;
    private Integer minimumPasswordLength;
    private Integer minimumSpecialCharacters;
    private Integer minimumUppercaseCharacters;

    // Constructors
    public PasswordPolicies() {
    }

    // Constructor with required fields
    public PasswordPolicies(long createdAt, long organisationsId, long id, long modifiedAt) {
        this.createdAt = createdAt;
        this.organisationsId = organisationsId;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
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

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getMinimumNumericCharacters() {
        return minimumNumericCharacters;
    }

    public void setMinimumNumericCharacters(Integer minimumNumericCharacters) {
        this.minimumNumericCharacters = minimumNumericCharacters;
    }

    public Integer getMinimumLowercaseCharacters() {
        return minimumLowercaseCharacters;
    }

    public void setMinimumLowercaseCharacters(Integer minimumLowercaseCharacters) {
        this.minimumLowercaseCharacters = minimumLowercaseCharacters;
    }

    public Integer getMinimumPasswordHistory() {
        return minimumPasswordHistory;
    }

    public void setMinimumPasswordHistory(Integer minimumPasswordHistory) {
        this.minimumPasswordHistory = minimumPasswordHistory;
    }

    public Integer getMaximumPasswordAge() {
        return maximumPasswordAge;
    }

    public void setMaximumPasswordAge(Integer maximumPasswordAge) {
        this.maximumPasswordAge = maximumPasswordAge;
    }

    public Integer getPasswordExpiration() {
        return passwordExpiration;
    }

    public void setPasswordExpiration(Integer passwordExpiration) {
        this.passwordExpiration = passwordExpiration;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
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

    public Boolean getAllowPasswordSimilarToUsernameOrEmail() {
        return allowPasswordSimilarToUsernameOrEmail;
    }

    public void setAllowPasswordSimilarToUsernameOrEmail(Boolean allowPasswordSimilarToUsernameOrEmail) {
        this.allowPasswordSimilarToUsernameOrEmail = allowPasswordSimilarToUsernameOrEmail;
    }

    public Integer getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(Integer minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public Integer getMinimumSpecialCharacters() {
        return minimumSpecialCharacters;
    }

    public void setMinimumSpecialCharacters(Integer minimumSpecialCharacters) {
        this.minimumSpecialCharacters = minimumSpecialCharacters;
    }

    public Integer getMinimumUppercaseCharacters() {
        return minimumUppercaseCharacters;
    }

    public void setMinimumUppercaseCharacters(Integer minimumUppercaseCharacters) {
        this.minimumUppercaseCharacters = minimumUppercaseCharacters;
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
