package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: client_credentials
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ClientCredentials {

    // Fields
    private boolean archived;
    private Object id;
    private Object clientSecret;
    private Object clientName;
    private Object clientDescription;

    // Constructors
    public ClientCredentials() {
    }

    // Constructor with required fields
    public ClientCredentials(boolean archived, Object id, Object clientSecret, Object clientName) {
        this.archived = archived;
        this.id = id;
        this.clientSecret = clientSecret;
        this.clientName = clientName;
    }

    // Getters and Setters with constraint validation
    public boolean getArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        if (id == null) {
            throw new ConstraintViolationException("id cannot be null");
        }
        this.id = id;
    }

    public Object getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(Object clientSecret) {
        if (clientSecret == null) {
            throw new ConstraintViolationException("client_secret cannot be null");
        }
        this.clientSecret = clientSecret;
    }

    public Object getClientName() {
        return clientName;
    }

    public void setClientName(Object clientName) {
        if (clientName == null) {
            throw new ConstraintViolationException("client_name cannot be null");
        }
        this.clientName = clientName;
    }

    public Object getClientDescription() {
        return clientDescription;
    }

    public void setClientDescription(Object clientDescription) {
        this.clientDescription = clientDescription;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (id == null) {
            errors.add("id is required");
        }
        if (clientSecret == null) {
            errors.add("client_secret is required");
        }
        if (clientName == null) {
            errors.add("client_name is required");
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
