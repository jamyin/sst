package com.tianfang.user.mapper;

import com.tianfang.user.pojo.Vote;
import com.tianfang.user.pojo.VoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int countByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int deleteByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int insert(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int insertSelective(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    List<Vote> selectByExample(VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    Vote selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int updateByExampleSelective(@Param("record") Vote record, @Param("example") VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int updateByExample(@Param("record") Vote record, @Param("example") VoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int updateByPrimaryKeySelective(Vote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote
     *
     * @mbggenerated Mon Jan 11 16:19:40 CST 2016
     */
    int updateByPrimaryKey(Vote record);
}