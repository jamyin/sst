package com.tianfang.user.pojo;

import java.util.Date;

public class GroupUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.group_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.user_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.create_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.last_update_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_group_user.stat
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.id
     *
     * @return the value of sst_group_user.id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.id
     *
     * @param id the value for sst_group_user.id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.group_id
     *
     * @return the value of sst_group_user.group_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.group_id
     *
     * @param groupId the value for sst_group_user.group_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.user_id
     *
     * @return the value of sst_group_user.user_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.user_id
     *
     * @param userId the value for sst_group_user.user_id
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.create_time
     *
     * @return the value of sst_group_user.create_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.create_time
     *
     * @param createTime the value for sst_group_user.create_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.last_update_time
     *
     * @return the value of sst_group_user.last_update_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.last_update_time
     *
     * @param lastUpdateTime the value for sst_group_user.last_update_time
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_group_user.stat
     *
     * @return the value of sst_group_user.stat
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_group_user.stat
     *
     * @param stat the value for sst_group_user.stat
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}