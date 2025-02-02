package com.tianfang.user.mapper;

import com.tianfang.user.pojo.Plan;
import com.tianfang.user.pojo.PlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int countByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int deleteByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int insert(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int insertSelective(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    List<Plan> selectByExample(PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    Plan selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") Plan record, @Param("example") PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int updateByExample(@Param("record") Plan record, @Param("example") PlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int updateByPrimaryKeySelective(Plan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_plan
     *
     * @mbggenerated Wed Feb 03 14:53:03 CST 2016
     */
    int updateByPrimaryKey(Plan record);
}