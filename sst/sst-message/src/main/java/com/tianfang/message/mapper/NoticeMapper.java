package com.tianfang.message.mapper;

import com.tianfang.message.pojo.Notice;
import com.tianfang.message.pojo.NoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int countByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int deleteByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int insert(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int insertSelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    List<Notice> selectByExample(NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    Notice selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int updateByPrimaryKeySelective(Notice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_notice
     *
     * @mbggenerated Wed Jan 20 14:05:42 CST 2016
     */
    int updateByPrimaryKey(Notice record);
}