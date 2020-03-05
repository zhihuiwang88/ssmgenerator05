package com.nengliang.web.entity;

public class ModPageField {
    /**
     * 字段ID
     */
    protected Long fldId;

    /**
     * 页面ID
     */
    protected Long pageId;

    /**
     * 字段编码
     */
    protected String fldCode;

    /**
     * 字段名称
     */
    protected String fldName;

    /**
     * 字段类型
     */
    protected String fldType;

    /**
     * 字段备注
     */
    protected String fldComment;

    /**
     * mod_page_field.fld_id
     */
    public Long getFldId() {
        return fldId;
    }

    /**
     * mod_page_field.fld_id
     */
    public void setFldId(Long fldId) {
        this.fldId = fldId;
    }

    /**
     * mod_page_field.page_id
     */
    public Long getPageId() {
        return pageId;
    }

    /**
     * mod_page_field.page_id
     */
    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }

    /**
     * mod_page_field.fld_code
     */
    public String getFldCode() {
        return fldCode;
    }

    /**
     * mod_page_field.fld_code
     */
    public void setFldCode(String fldCode) {
        this.fldCode = fldCode == null ? null : fldCode.trim();
    }

    /**
     * mod_page_field.fld_name
     */
    public String getFldName() {
        return fldName;
    }

    /**
     * mod_page_field.fld_name
     */
    public void setFldName(String fldName) {
        this.fldName = fldName == null ? null : fldName.trim();
    }

    /**
     * mod_page_field.fld_type
     */
    public String getFldType() {
        return fldType;
    }

    /**
     * mod_page_field.fld_type
     */
    public void setFldType(String fldType) {
        this.fldType = fldType == null ? null : fldType.trim();
    }

    /**
     * mod_page_field.fld_comment
     */
    public String getFldComment() {
        return fldComment;
    }

    /**
     * mod_page_field.fld_comment
     */
    public void setFldComment(String fldComment) {
        this.fldComment = fldComment == null ? null : fldComment.trim();
    }
}