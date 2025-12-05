package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: variations
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: config_id, parameter_values_id; 
 */
public class Variations {

    // Fields
    private long parameterValuesId;
    private Object oldDetails;
    private String description;
    private long createdAt;
    private Object type;
    private long createdBy;
    private String variationNumber;
    private Object newDetails;
    private String configId;
    private String name;
    private long modifiedBy;
    private long id;
    private long modifiedAt;
    private long jobsId;

    // Constructors
    public Variations() {
    }

    // Constructor with required fields
    public Variations(long parameterValuesId, Object oldDetails, long createdAt, Object type, long createdBy, String variationNumber, Object newDetails, String configId, String name, long modifiedBy, long id, long modifiedAt, long jobsId) {
        this.parameterValuesId = parameterValuesId;
        this.oldDetails = oldDetails;
        this.createdAt = createdAt;
        this.type = type;
        this.createdBy = createdBy;
        this.variationNumber = variationNumber;
        this.newDetails = newDetails;
        this.configId = configId;
        this.name = name;
        this.modifiedBy = modifiedBy;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.jobsId = jobsId;
    }

    // Getters and Setters with constraint validation
    public long getParameterValuesId() {
        return parameterValuesId;
    }

    public void setParameterValuesId(long parameterValuesId) {
        this.parameterValuesId = parameterValuesId;
    }

    public Object getOldDetails() {
        return oldDetails;
    }

    public void setOldDetails(Object oldDetails) {
        if (oldDetails == null) {
            throw new ConstraintViolationException("old_details cannot be null");
        }
        this.oldDetails = oldDetails;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public String getVariationNumber() {
        return variationNumber;
    }

    public void setVariationNumber(String variationNumber) {
        if (variationNumber == null) {
            throw new ConstraintViolationException("variation_number cannot be null");
        }
        this.variationNumber = variationNumber == null ? null : variationNumber.trim();
    }

    public Object getNewDetails() {
        return newDetails;
    }

    public void setNewDetails(Object newDetails) {
        if (newDetails == null) {
            throw new ConstraintViolationException("new_details cannot be null");
        }
        this.newDetails = newDetails;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        if (configId == null) {
            throw new ConstraintViolationException("config_id cannot be null");
        }
        this.configId = configId == null ? null : configId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new ConstraintViolationException("name cannot be null");
        }
        this.name = name == null ? null : name.trim();
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
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

    public long getJobsId() {
        return jobsId;
    }

    public void setJobsId(long jobsId) {
        this.jobsId = jobsId;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (oldDetails == null) {
            errors.add("old_details is required");
        }
        if (type == null) {
            errors.add("type is required");
        }
        if (variationNumber == null) {
            errors.add("variation_number is required");
        }
        if (variationNumber != null && variationNumber.trim().isEmpty()) {
            errors.add("variation_number cannot be empty");
        }
        if (newDetails == null) {
            errors.add("new_details is required");
        }
        if (configId == null) {
            errors.add("config_id is required");
        }
        if (configId != null && configId.trim().isEmpty()) {
            errors.add("config_id cannot be empty");
        }
        if (name == null) {
            errors.add("name is required");
        }
        if (name != null && name.trim().isEmpty()) {
            errors.add("name cannot be empty");
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
