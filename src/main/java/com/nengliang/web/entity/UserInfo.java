package com.nengliang.web.entity;

public class UserInfo {
    /**
     * 
     */
    protected Integer id;

    /**
     * 
     */
    protected String userId;

    /**
     * 
     */
    protected String userName;

    /**
     * 
     */
    protected String userDeptNo;

    /**
     * 
     */
    protected String sn;

    /**
     * 
     */
    protected String sfzh;

    /**
     * user_info.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * user_info.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * user_info.user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * user_info.user_id
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * user_info.user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * user_info.user_name
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * user_info.user_dept_no
     */
    public String getUserDeptNo() {
        return userDeptNo;
    }

    /**
     * user_info.user_dept_no
     */
    public void setUserDeptNo(String userDeptNo) {
        this.userDeptNo = userDeptNo == null ? null : userDeptNo.trim();
    }

    /**
     * user_info.sn
     */
    public String getSn() {
        return sn;
    }

    /**
     * user_info.sn
     */
    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    /**
     * user_info.sfzh
     */
    public String getSfzh() {
        return sfzh;
    }

    /**
     * user_info.sfzh
     */
    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }
}