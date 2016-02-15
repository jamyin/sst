package com.tianfang.user.pojo;

import java.util.Date;

public class Group {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.create_user_id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.create_user_name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private String createUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.create_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.last_update_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group.stat
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.id
     *
     * @return the value of sst_group.id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.id
     *
     * @param id the value for sst_group.id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.name
     *
     * @return the value of sst_group.name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.name
     *
     * @param name the value for sst_group.name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.create_user_id
     *
     * @return the value of sst_group.create_user_id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.create_user_id
     *
     * @param createUserId the value for sst_group.create_user_id
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.create_user_name
     *
     * @return the value of sst_group.create_user_name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.create_user_name
     *
     * @param createUserName the value for sst_group.create_user_name
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.create_time
     *
     * @return the value of sst_group.create_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.create_time
     *
     * @param createTime the value for sst_group.create_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.last_update_time
     *
     * @return the value of sst_group.last_update_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.last_update_time
     *
     * @param lastUpdateTime the value for sst_group.last_update_time
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group.stat
     *
     * @return the value of sst_group.stat
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group.stat
     *
     * @param stat the value for sst_group.stat
     *
     * @mbggenerated Fri Jan 15 13:21:40 CST 2016
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}