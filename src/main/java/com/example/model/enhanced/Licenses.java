package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: licenses
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class Licenses {

    // Fields
    private Integer intimateBefore;
    private Object product;
    private Boolean paymentDone;
    private Object workflow;
    private long organisationsId;
    private long createdAt;
    private long facilitiesId;
    private Object type;
    private Long createdBy;
    private Integer gracePeriod;
    private boolean archived;
    private java.sql.Date subscriptionRenewalDate;
    private java.sql.Date subscriptionStartDate;
    private Long modifiedBy;
    private Integer subscriptionPeriod;
    private long id;
    private long modifiedAt;

    // Constructors
    public Licenses() {
    }

    // Constructor with required fields
    public Licenses(long organisationsId, long createdAt, long facilitiesId, boolean archived, long id, long modifiedAt) {
        this.organisationsId = organisationsId;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.archived = archived;
        this.id = id;
        this.modifiedAt = modifiedAt;
    }

    // Getters and Setters with constraint validation
    public Integer getIntimateBefore() {
        return intimateBefore;
    }

    public void setIntimateBefore(Integer intimateBefore) {
        this.intimateBefore = intimateBefore;
    }

    public Object getProduct() {
        return product;
    }

    public void setProduct(Object product) {
        this.product = product;
    }

    public Boolean getPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(Boolean paymentDone) {
        this.paymentDone = paymentDone;
    }

    public Object getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Object workflow) {
        this.workflow = workflow;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(long facilitiesId) {
        this.facilitiesId = facilitiesId;
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

    public Integer getGracePeriod() {
        return gracePeriod;
    }

    public void setGracePeriod(Integer gracePeriod) {
        this.gracePeriod = gracePeriod;
    }

    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public java.sql.Date getSubscriptionRenewalDate() {
        return subscriptionRenewalDate;
    }

    public void setSubscriptionRenewalDate(java.sql.Date subscriptionRenewalDate) {
        this.subscriptionRenewalDate = subscriptionRenewalDate;
    }

    public java.sql.Date getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(java.sql.Date subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Integer getSubscriptionPeriod() {
        return subscriptionPeriod;
    }

    public void setSubscriptionPeriod(Integer subscriptionPeriod) {
        this.subscriptionPeriod = subscriptionPeriod;
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
