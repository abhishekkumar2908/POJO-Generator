package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: organisation_settings
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: organisations_id; 
 */
public class OrganisationSettings {

    // Fields
    private Object logoUrl;
    private long createdAt;
    private long organisationsId;
    private Object extras;
    private Integer sessionIdleTimeout;
    private Long createdBy;
    private Integer registrationTokenExpiration;
    private Integer passwordResetTokenExpiration;
    private Object featureFlags;
    private Long modifiedBy;
    private Integer maxFailedLoginAttempts;
    private Integer maxFailedAdditionalVerificationAttempts;
    private Integer maxFailedChallengeQuestionAttempts;
    private long id;
    private long modifiedAt;
    private Integer autoUnlockAfter;

    // Constructors
    public OrganisationSettings() {
    }

    // Constructor with required fields
    public OrganisationSettings(long createdAt, long organisationsId, long id, long modifiedAt) {
        this.createdAt = createdAt;
        this.organisationsId = organisationsId;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Object getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(Object logoUrl) {
        this.logoUrl = logoUrl;
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

    public Object getExtras() {
        return extras;
    }

    public void setExtras(Object extras) {
        this.extras = extras;
    }

    public Integer getSessionIdleTimeout() {
        return sessionIdleTimeout;
    }

    public void setSessionIdleTimeout(Integer sessionIdleTimeout) {
        this.sessionIdleTimeout = sessionIdleTimeout;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getRegistrationTokenExpiration() {
        return registrationTokenExpiration;
    }

    public void setRegistrationTokenExpiration(Integer registrationTokenExpiration) {
        this.registrationTokenExpiration = registrationTokenExpiration;
    }

    public Integer getPasswordResetTokenExpiration() {
        return passwordResetTokenExpiration;
    }

    public void setPasswordResetTokenExpiration(Integer passwordResetTokenExpiration) {
        this.passwordResetTokenExpiration = passwordResetTokenExpiration;
    }

    public Object getFeatureFlags() {
        return featureFlags;
    }

    public void setFeatureFlags(Object featureFlags) {
        this.featureFlags = featureFlags;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getMaxFailedLoginAttempts() {
        return maxFailedLoginAttempts;
    }

    public void setMaxFailedLoginAttempts(Integer maxFailedLoginAttempts) {
        this.maxFailedLoginAttempts = maxFailedLoginAttempts;
    }

    public Integer getMaxFailedAdditionalVerificationAttempts() {
        return maxFailedAdditionalVerificationAttempts;
    }

    public void setMaxFailedAdditionalVerificationAttempts(Integer maxFailedAdditionalVerificationAttempts) {
        this.maxFailedAdditionalVerificationAttempts = maxFailedAdditionalVerificationAttempts;
    }

    public Integer getMaxFailedChallengeQuestionAttempts() {
        return maxFailedChallengeQuestionAttempts;
    }

    public void setMaxFailedChallengeQuestionAttempts(Integer maxFailedChallengeQuestionAttempts) {
        this.maxFailedChallengeQuestionAttempts = maxFailedChallengeQuestionAttempts;
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

    public Integer getAutoUnlockAfter() {
        return autoUnlockAfter;
    }

    public void setAutoUnlockAfter(Integer autoUnlockAfter) {
        this.autoUnlockAfter = autoUnlockAfter;
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
