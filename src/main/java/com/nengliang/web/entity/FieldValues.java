package com.nengliang.web.entity;

import java.sql.Timestamp;

public class FieldValues {
    /**
     * 
     */
    protected Integer id;

    /**
     * 
     */
    protected String field;

    /**
     * 
     */
    protected String value;

    /**
     * 
     */
    protected String isCode;

    /**
     * 
     */
    protected String codeValue;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * field_values.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * field_values.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * field_values.field
     */
    public String getField() {
        return field;
    }

    /**
     * field_values.field
     */
    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    /**
     * field_values.value
     */
    public String getValue() {
        return value;
    }

    /**
     * field_values.value
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * field_values.is_code
     */
    public String getIsCode() {
        return isCode;
    }

    /**
     * field_values.is_code
     */
    public void setIsCode(String isCode) {
        this.isCode = isCode == null ? null : isCode.trim();
    }

    /**
     * field_values.code_value
     */
    public String getCodeValue() {
        return codeValue;
    }

    /**
     * field_values.code_value
     */
    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue == null ? null : codeValue.trim();
    }

    /**
     * field_values.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * field_values.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * field_values.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * field_values.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}