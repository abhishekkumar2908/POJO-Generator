package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: facility_use_case_property_mapping
 * Generated with database constraint enforcement
 * Primary Key: id
 * Unique Constraints: facilities_id, use_cases_id, properties_id; 
 */
public class FacilityUseCasePropertyMapping {

    // Fields
    private long useCasesId;
    private long propertiesId;
    private long modifiedBy;
    private int orderTree;
    private long createdAt;
    private long facilitiesId;
    private Object labelAlias;
    private boolean isMandatory;
    private long id;
    private long modifiedAt;
    private long createdBy;
    private Object placeHolderAlias;

    // Constructors
    public FacilityUseCasePropertyMapping() {
    }

    // Constructor with required fields
    public FacilityUseCasePropertyMapping(long useCasesId, long propertiesId, long modifiedBy, int orderTree, long createdAt, long facilitiesId, Object labelAlias, boolean isMandatory, long id, long modifiedAt, long createdBy, Object placeHolderAlias) {
        this.useCasesId = useCasesId;
        this.propertiesId = propertiesId;
        this.modifiedBy = modifiedBy;
        this.orderTree = orderTree;
        this.createdAt = createdAt;
        this.facilitiesId = facilitiesId;
        this.labelAlias = labelAlias;
        this.isMandatory = isMandatory;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.placeHolderAlias = placeHolderAlias;
    }

    // Getters and Setters with constraint validation
    public long getUseCasesId() {
        return useCasesId;
    }

    public void setUseCasesId(long useCasesId) {
        this.useCasesId = useCasesId;
    }

    public long getPropertiesId() {
        return propertiesId;
    }

    public void setPropertiesId(long propertiesId) {
        this.propertiesId = propertiesId;
    }

    public long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public int getOrderTree() {
        return orderTree;
    }

    public void setOrderTree(int orderTree) {
        this.orderTree = orderTree;
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

    public Object getLabelAlias() {
        return labelAlias;
    }

    public void setLabelAlias(Object labelAlias) {
        if (labelAlias == null) {
            throw new ConstraintViolationException("label_alias cannot be null");
        }
        this.labelAlias = labelAlias;
    }

    public boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
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

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Object getPlaceHolderAlias() {
        return placeHolderAlias;
    }

    public void setPlaceHolderAlias(Object placeHolderAlias) {
        if (placeHolderAlias == null) {
            throw new ConstraintViolationException("place_holder_alias cannot be null");
        }
        this.placeHolderAlias = placeHolderAlias;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (labelAlias == null) {
            errors.add("label_alias is required");
        }
        if (placeHolderAlias == null) {
            errors.add("place_holder_alias is required");
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
