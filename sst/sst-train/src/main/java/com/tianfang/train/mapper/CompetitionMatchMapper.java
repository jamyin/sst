package com.tianfang.train.mapper;

import com.tianfang.train.pojo.CompetitionMatch;
import com.tianfang.train.pojo.CompetitionMatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompetitionMatchMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int countByExample(CompetitionMatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int deleteByExample(CompetitionMatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int insert(CompetitionMatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int insertSelective(CompetitionMatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    List<CompetitionMatch> selectByExample(CompetitionMatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    CompetitionMatch selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int updateByExampleSelective(@Param("record") CompetitionMatch record, @Param("example") CompetitionMatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int updateByExample(@Param("record") CompetitionMatch record, @Param("example") CompetitionMatchExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int updateByPrimaryKeySelective(CompetitionMatch record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_competition_match
     *
     * @mbggenerated Tue Feb 23 13:57:02 CST 2016
     */
    int updateByPrimaryKey(CompetitionMatch record);
}