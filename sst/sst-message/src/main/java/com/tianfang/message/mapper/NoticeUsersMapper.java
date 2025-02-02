package com.tianfang.message.mapper;

import com.tianfang.message.pojo.NoticeUsers;
import com.tianfang.message.pojo.NoticeUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int countByExample(NoticeUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int deleteByExample(NoticeUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int insert(NoticeUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int insertSelective(NoticeUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    List<NoticeUsers> selectByExample(NoticeUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    NoticeUsers selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int updateByExampleSelective(@Param("record") NoticeUsers record, @Param("example") NoticeUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int updateByExample(@Param("record") NoticeUsers record, @Param("example") NoticeUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int updateByPrimaryKeySelective(NoticeUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice_users
     *
     * @mbggenerated Wed Feb 03 14:25:18 CST 2016
     */
    int updateByPrimaryKey(NoticeUsers record);
}