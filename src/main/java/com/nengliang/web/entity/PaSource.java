package com.nengliang.web.entity;

import java.sql.Timestamp;

public class PaSource {
    /**
     * 
     */
    protected Integer id;

    /**
     * 
     */
    protected String sourceId;

    /**
     * 
     */
    protected String sign;

    /**
     * 
     */
    protected Timestamp createTime;

    /**
     * 
     */
    protected Timestamp updateTime;

    /**
     * pa_source.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * pa_source.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * pa_source.source_id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * pa_source.source_id
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    /**
     * pa_source.sign
     */
    public String getSign() {
        return sign;
    }

    /**
     * pa_source.sign
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * pa_source.create_time
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * pa_source.create_time
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * pa_source.update_time
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * pa_source.update_time
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}