package com.tianfang.user.pojo;

import java.util.Date;

public class UserFriend {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.user_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.friend_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private String friendId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.care
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private Integer care;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.last_create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private Date lastCreateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_user_friend.stat
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.id
     *
     * @return the value of sst_user_friend.id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.id
     *
     * @param id the value for sst_user_friend.id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.user_id
     *
     * @return the value of sst_user_friend.user_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.user_id
     *
     * @param userId the value for sst_user_friend.user_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.friend_id
     *
     * @return the value of sst_user_friend.friend_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public String getFriendId() {
        return friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.friend_id
     *
     * @param friendId the value for sst_user_friend.friend_id
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setFriendId(String friendId) {
        this.friendId = friendId == null ? null : friendId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.care
     *
     * @return the value of sst_user_friend.care
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public Integer getCare() {
        return care;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.care
     *
     * @param care the value for sst_user_friend.care
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setCare(Integer care) {
        this.care = care;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.create_time
     *
     * @return the value of sst_user_friend.create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.create_time
     *
     * @param createTime the value for sst_user_friend.create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.last_create_time
     *
     * @return the value of sst_user_friend.last_create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public Date getLastCreateTime() {
        return lastCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.last_create_time
     *
     * @param lastCreateTime the value for sst_user_friend.last_create_time
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setLastCreateTime(Date lastCreateTime) {
        this.lastCreateTime = lastCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_user_friend.stat
     *
     * @return the value of sst_user_friend.stat
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_user_friend.stat
     *
     * @param stat the value for sst_user_friend.stat
     *
     * @mbggenerated Wed Jan 20 13:58:09 CST 2016
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}