package com.nengliang.web.entity;

import java.sql.Timestamp;

public class PaData {
    /**
     * 
     */
    protected Integer id;

    /**
     * 
     */
    protected String version;

    /**
     * 
     */
    protected String sessionId;

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
    protected String orderBy;

    /**
     * 
     */
    protected String fieldes;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * pa_data.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * pa_data.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * pa_data.version
     */
    public String getVersion() {
        return version;
    }

    /**
     * pa_data.version
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * pa_data.session_id
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * pa_data.session_id
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    /**
     * pa_data.data_obj_id
     */
    public String getDataObjId() {
        return dataObjId;
    }

    /**
     * pa_data.data_obj_id
     */
    public void setDataObjId(String dataObjId) {
        this.dataObjId = dataObjId == null ? null : dataObjId.trim();
    }

    /**
     * pa_data.conditiones
     */
    public String getConditiones() {
        return conditiones;
    }

    /**
     * pa_data.conditiones
     */
    public void setConditiones(String conditiones) {
        this.conditiones = conditiones == null ? null : conditiones.trim();
    }

    /**
     * pa_data.order_by
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * pa_data.order_by
     */
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy == null ? null : orderBy.trim();
    }

    /**
     * pa_data.fieldes
     */
    public String getFieldes() {
        return fieldes;
    }

    /**
     * pa_data.fieldes
     */
    public void setFieldes(String fieldes) {
        this.fieldes = fieldes == null ? null : fieldes.trim();
    }

    /**
     * pa_data.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * pa_data.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * pa_data.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * pa_data.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}