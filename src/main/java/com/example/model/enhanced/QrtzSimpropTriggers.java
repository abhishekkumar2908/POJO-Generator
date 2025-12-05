package com.example.model.enhanced;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Constraint-aware POJO for table: qrtz_simprop_triggers
 * Generated with database constraint enforcement
 * Primary Key: sched_name, trigger_name, trigger_group
 */
public class QrtzSimpropTriggers {

    // Fields
    private Object schedName;
    private Long longProp2;
    private Long longProp1;
    private Object strProp3;
    private Object strProp2;
    private Object strProp1;
    private Object triggerGroup;
    private Object triggerName;
    private Boolean boolProp1;
    private Boolean boolProp2;
    private Integer intProp1;
    private Integer intProp2;
    private BigDecimal decProp2;
    private BigDecimal decProp1;

    // Constructors
    public QrtzSimpropTriggers() {
    }

    // Constructor with required fields
    public QrtzSimpropTriggers(Object schedName, Object triggerGroup, Object triggerName) {
        this.schedName = schedName;
        this.triggerGroup = triggerGroup;
        this.triggerName = triggerName;
    }

    // Getters and Setters with constraint validation
    public Object getSchedName() {
        return schedName;
    }

    public void setSchedName(Object schedName) {
        if (schedName == null) {
            throw new ConstraintViolationException("sched_name cannot be null");
        }
        this.schedName = schedName;
    }

    public Long getLongProp2() {
        return longProp2;
    }

    public void setLongProp2(Long longProp2) {
        this.longProp2 = longProp2;
    }

    public Long getLongProp1() {
        return longProp1;
    }

    public void setLongProp1(Long longProp1) {
        this.longProp1 = longProp1;
    }

    public Object getStrProp3() {
        return strProp3;
    }

    public void setStrProp3(Object strProp3) {
        this.strProp3 = strProp3;
    }

    public Object getStrProp2() {
        return strProp2;
    }

    public void setStrProp2(Object strProp2) {
        this.strProp2 = strProp2;
    }

    public Object getStrProp1() {
        return strProp1;
    }

    public void setStrProp1(Object strProp1) {
        this.strProp1 = strProp1;
    }

    public Object getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(Object triggerGroup) {
        if (triggerGroup == null) {
            throw new ConstraintViolationException("trigger_group cannot be null");
        }
        this.triggerGroup = triggerGroup;
    }

    public Object getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(Object triggerName) {
        if (triggerName == null) {
            throw new ConstraintViolationException("trigger_name cannot be null");
        }
        this.triggerName = triggerName;
    }

    public Boolean getBoolProp1() {
        return boolProp1;
    }

    public void setBoolProp1(Boolean boolProp1) {
        this.boolProp1 = boolProp1;
    }

    public Boolean getBoolProp2() {
        return boolProp2;
    }

    public void setBoolProp2(Boolean boolProp2) {
        this.boolProp2 = boolProp2;
    }

    public Integer getIntProp1() {
        return intProp1;
    }

    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    public Integer getIntProp2() {
        return intProp2;
    }

    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    public BigDecimal getDecProp2() {
        return decProp2;
    }

    public void setDecProp2(BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    public BigDecimal getDecProp1() {
        return decProp1;
    }

    public void setDecProp1(BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    // Validation methods
    public List<String> validate() {
        List<String> errors = new ArrayList<>();

        if (triggerName == null) {
            errors.add("trigger_name is required");
        }
        if (schedName == null) {
            errors.add("sched_name is required");
        }
        if (triggerGroup == null) {
            errors.add("trigger_group is required");
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
