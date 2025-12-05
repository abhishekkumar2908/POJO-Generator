package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: parameter_rules
 * Generated with database constraint enforcement
 * Primary Key: id
 */
public class ParameterRules {

    // Fields
    private Object input;
    private boolean visibility;
    private long id;
    private Object rulesId;
    private Object operator;

    // Constructors
    public ParameterRules() {
    }

    // Constructor with required fields
    public ParameterRules(Object input, boolean visibility, long id, Object rulesId, Object operator) {
        this.input = input;
        this.visibility = visibility;
        this.id = id;
        this.rulesId = rulesId;
        this.operator = operator;
    }

    // Getters and Setters with constraint validation
    public Object getInput() {
        return input;
    }

    public void setInput(Object input) {
        if (input == null) {
            throw new ConstraintViolationException("input cannot be null");
        }
        this.input = input;
    }

    public boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Object getRulesId() {
        return rulesId;
    }

    public void setRulesId(Object rulesId) {
        if (rulesId == null) {
            throw new ConstraintViolationException("rules_id cannot be null");
        }
        this.rulesId = rulesId;
    }

    public Object getOperator() {
        return operator;
    }

    public void setOperator(Object operator) {
        if (operator == null) {
            throw new ConstraintViolationException("operator cannot be null");
        }
        this.operator = operator;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (input == null) {
            errors.add("input is required");
        }
        if (rulesId == null) {
            errors.add("rules_id is required");
        }
        if (operator == null) {
            errors.add("operator is required");
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
