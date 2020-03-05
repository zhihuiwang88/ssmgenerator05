package com.nengliang.web.entity;

import java.sql.Timestamp;

public class OperationsParams {
    /**
     * 
     */
    protected Integer id;

    /**
     * 
     */
    protected String operationType;

    /**
     * 
     */
    protected String operationId;

    /**
     * 
     */
    protected String sourceId;

    /**
     * 
     */
    protected String dataObjId;

    /**
     * 
     */
    protected String conditiones;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * operations_params.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * operations_params.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * operations_params.operation_type
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * operations_params.operation_type
     */
    public void setOperationType(String operationType) {
        this.operationType = operationType == null ? null : operationType.trim();
    }

    /**
     * operations_params.operation_id
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * operations_params.operation_id
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId == null ? null : operationId.trim();
    }

    /**
     * operations_params.source_id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * operations_params.source_id
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * operations_params.data_obj_id
     */
    public String getDataObjId() {
        return dataObjId;
    }

    /**
     * operations_params.data_obj_id
     */
    public void setDataObjId(String dataObjId) {
        this.dataObjId = dataObjId == null ? null : dataObjId.trim();
    }

    /**
     * operations_params.conditiones
     */
    public String getConditiones() {
        return conditiones;
    }

    /**
     * operations_params.conditiones
     */
    public void setConditiones(String conditiones) {
        this.conditiones = conditiones == null ? null : conditiones.trim();
    }

    /**
     * operations_params.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * operations_params.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * operations_params.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * operations_params.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}