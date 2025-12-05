package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: parameter_rule_mapping
 * Generated with database constraint enforcement
 * Primary Key: parameter_rules_id, impacted_parameters_id, triggering_parameters_id
 */
public class ParameterRuleMapping {

    // Fields
    private long triggeringParametersId;
    private long parameterRulesId;
    private long impactedParametersId;

    // Constructors
    public ParameterRuleMapping() {
    }

    // Constructor with required fields
    public ParameterRuleMapping(long triggeringParametersId, long parameterRulesId, long impactedParametersId) {
        this.triggeringParametersId = triggeringParametersId;
        this.parameterRulesId = parameterRulesId;
        this.impactedParametersId = impactedParametersId;
    }

    // Getters and Setters with constraint validation
    public long getTriggeringParametersId() {
        return triggeringParametersId;
    }

    public void setTriggeringParametersId(long triggeringParametersId) {
        this.triggeringParametersId = triggeringParametersId;
    }

    public long getParameterRulesId() {
        return parameterRulesId;
    }

    public void setParameterRulesId(long parameterRulesId) {
        this.parameterRulesId = parameterRulesId;
    }

    public long getImpactedParametersId() {
        return impactedParametersId;
    }

    public void setImpactedParametersId(long impactedParametersId) {
        this.impactedParametersId = impactedParametersId;
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
