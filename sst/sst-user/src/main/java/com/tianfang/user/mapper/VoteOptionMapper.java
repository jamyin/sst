package com.tianfang.user.mapper;

import com.tianfang.user.pojo.VoteOption;
import com.tianfang.user.pojo.VoteOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VoteOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int countByExample(VoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int deleteByExample(VoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int insert(VoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int insertSelective(VoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    List<VoteOption> selectByExample(VoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    VoteOption selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int updateByExampleSelective(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int updateByExample(@Param("record") VoteOption record, @Param("example") VoteOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int updateByPrimaryKeySelective(VoteOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_vote_option
     *
     * @mbggenerated Tue Mar 08 15:17:27 CST 2016
     */
    int updateByPrimaryKey(VoteOption record);
}