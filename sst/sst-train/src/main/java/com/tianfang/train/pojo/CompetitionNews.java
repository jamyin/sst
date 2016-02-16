package com.tianfang.train.pojo;

import java.util.Date;

public class CompetitionNews {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.comp_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String compId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.comp_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String compName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.title
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.summary
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String summary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.content
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.create_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String createAdminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.create_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String createAdminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.update_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String updateAdminId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.update_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private String updateAdminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.create_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.last_update_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sst_competition_news.stat
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    private Integer stat;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.id
     *
     * @return the value of sst_competition_news.id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.id
     *
     * @param id the value for sst_competition_news.id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.comp_id
     *
     * @return the value of sst_competition_news.comp_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.comp_id
     *
     * @param compId the value for sst_competition_news.comp_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.comp_name
     *
     * @return the value of sst_competition_news.comp_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getCompName() {
        return compName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.comp_name
     *
     * @param compName the value for sst_competition_news.comp_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.title
     *
     * @return the value of sst_competition_news.title
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.title
     *
     * @param title the value for sst_competition_news.title
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.summary
     *
     * @return the value of sst_competition_news.summary
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getSummary() {
        return summary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.summary
     *
     * @param summary the value for sst_competition_news.summary
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.content
     *
     * @return the value of sst_competition_news.content
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.content
     *
     * @param content the value for sst_competition_news.content
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.create_admin_id
     *
     * @return the value of sst_competition_news.create_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getCreateAdminId() {
        return createAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.create_admin_id
     *
     * @param createAdminId the value for sst_competition_news.create_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setCreateAdminId(String createAdminId) {
        this.createAdminId = createAdminId == null ? null : createAdminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.create_admin_name
     *
     * @return the value of sst_competition_news.create_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getCreateAdminName() {
        return createAdminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.create_admin_name
     *
     * @param createAdminName the value for sst_competition_news.create_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setCreateAdminName(String createAdminName) {
        this.createAdminName = createAdminName == null ? null : createAdminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.update_admin_id
     *
     * @return the value of sst_competition_news.update_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getUpdateAdminId() {
        return updateAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.update_admin_id
     *
     * @param updateAdminId the value for sst_competition_news.update_admin_id
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setUpdateAdminId(String updateAdminId) {
        this.updateAdminId = updateAdminId == null ? null : updateAdminId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.update_admin_name
     *
     * @return the value of sst_competition_news.update_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public String getUpdateAdminName() {
        return updateAdminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.update_admin_name
     *
     * @param updateAdminName the value for sst_competition_news.update_admin_name
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setUpdateAdminName(String updateAdminName) {
        this.updateAdminName = updateAdminName == null ? null : updateAdminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.create_time
     *
     * @return the value of sst_competition_news.create_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.create_time
     *
     * @param createTime the value for sst_competition_news.create_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.last_update_time
     *
     * @return the value of sst_competition_news.last_update_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.last_update_time
     *
     * @param lastUpdateTime the value for sst_competition_news.last_update_time
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sst_competition_news.stat
     *
     * @return the value of sst_competition_news.stat
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public Integer getStat() {
        return stat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sst_competition_news.stat
     *
     * @param stat the value for sst_competition_news.stat
     *
     * @mbggenerated Wed Feb 03 10:19:44 CST 2016
     */
    public void setStat(Integer stat) {
        this.stat = stat;
    }
}