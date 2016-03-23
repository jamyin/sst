package com.tianfang.train.mapper;

import com.tianfang.train.pojo.MatchPlayerBaseDatas;

import java.util.List;
import java.util.Map;

public interface MatchPlayerBaseDatasExMapper {

    void batchInsertPlayerBaseDatas(List<MatchPlayerBaseDatas> dtos);

    void deleteByMatchIdAndTeamId(Map<String, String> map);
}