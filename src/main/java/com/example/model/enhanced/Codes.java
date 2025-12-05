package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: codes
 * Generated with database constraint enforcement
 * Primary Key: organisations_id, type, clause
 */
public class Codes {

    // Fields
    private short clause;
    private long organisationsId;
    private int counter;
    private Object type;

    // Constructors
    public Codes() {
    }

    // Constructor with required fields
    public Codes(short clause, long organisationsId, int counter, Object type) {
        this.clause = clause;
        this.organisationsId = organisationsId;
        this.counter = counter;
        this.type = type;
    }

    // Getters and Setters with constraint validation
    public short getClause() {
        return clause;
    }

    public void setClause(short clause) {
        this.clause = clause;
    }

    public long getOrganisationsId() {
        return organisationsId;
    }

    public void setOrganisationsId(long organisationsId) {
        this.organisationsId = organisationsId;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
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

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

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
