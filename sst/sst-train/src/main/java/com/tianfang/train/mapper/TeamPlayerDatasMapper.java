package com.tianfang.train.mapper;

import com.tianfang.train.pojo.TeamPlayerDatas;
import com.tianfang.train.pojo.TeamPlayerDatasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamPlayerDatasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int countByExample(TeamPlayerDatasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int deleteByExample(TeamPlayerDatasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int insert(TeamPlayerDatas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int insertSelective(TeamPlayerDatas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    List<TeamPlayerDatas> selectByExample(TeamPlayerDatasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    TeamPlayerDatas selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int updateByExampleSelective(@Param("record") TeamPlayerDatas record, @Param("example") TeamPlayerDatasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int updateByExample(@Param("record") TeamPlayerDatas record, @Param("example") TeamPlayerDatasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int updateByPrimaryKeySelective(TeamPlayerDatas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sst_team_player_datas
     *
     * @mbggenerated Thu Mar 24 09:29:11 CST 2016
     */
    int updateByPrimaryKey(TeamPlayerDatas record);
}