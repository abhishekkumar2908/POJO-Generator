package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: tokens
 * Generated with database constraint enforcement
 * Primary Key: token
 */
public class Tokens {

    // Fields
    private Long usersId;
    private Long expiration;
    private Object type;
    private Object token;

    // Constructors
    public Tokens() {
    }

    // Constructor with required fields
    public Tokens(Object type, Object token) {
        this.type = type;
        this.token = token;
    }

    // Getters and Setters with constraint validation
    public Long getUsersId() {
        return usersId;
    }

    public void setUsersId(Long usersId) {
        this.usersId = usersId;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
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

    public Object getToken() {
        return token;
    }

    public void setToken(Object token) {
        if (token == null) {
            throw new ConstraintViolationException("token cannot be null");
        }
        this.token = token;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (type == null) {
            errors.add("type is required");
        }
        if (token == null) {
            errors.add("token is required");
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
