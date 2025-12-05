package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: email_audits
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class EmailAudits {

    // Fields
    private Object cc;
    private Object bcc;
    private long createdOn;
    private String subject;
    private Object toAddresses;
    private Short maxAttempts;
    private String messageId;
    private long id;
    private String body;
    private Short retryAttempts;
    private String fromAddress;

    // Constructors
    public EmailAudits() {
    }

    // Constructor with required fields
    public EmailAudits(long createdOn, long id, String fromAddress) {
        this.createdOn = createdOn;
        this.id = id;
        this.fromAddress = fromAddress;
    }

    // Getters and Setters with constraint validation
    public Object getCc() {
        return cc;
    }

    public void setCc(Object cc) {
        this.cc = cc;
    }

    public Object getBcc() {
        return bcc;
    }

    public void setBcc(Object bcc) {
        this.bcc = bcc;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public Object getToAddresses() {
        return toAddresses;
    }

    public void setToAddresses(Object toAddresses) {
        this.toAddresses = toAddresses;
    }

    public Short getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(Short maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public Short getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(Short retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        if (fromAddress == null) {
            throw new ConstraintViolationException("from_address cannot be null");
        }
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (fromAddress == null) {
            errors.add("from_address is required");
        }
        if (fromAddress != null && fromAddress.trim().isEmpty()) {
            errors.add("from_address cannot be empty");
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
