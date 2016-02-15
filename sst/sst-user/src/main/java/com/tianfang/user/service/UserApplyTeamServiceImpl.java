package com.tianfang.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tianfang.common.constants.DataStatus;
import com.tianfang.common.model.PageQuery;
import com.tianfang.common.model.PageResult;
import com.tianfang.common.util.BeanUtils;
import com.tianfang.common.util.StringUtils;
import com.tianfang.common.util.UUIDGenerator;
import com.tianfang.user.dao.UserApplyTeamDao;
import com.tianfang.user.dto.UserApplyTeamDto;
import com.tianfang.user.pojo.UserApplyTeam;

public class UserApplyTeamServiceImpl implements IUserApplyTeamService {

	@Autowired
	private UserApplyTeamDao userApplyTeamDao;

	@Override
	public String save(UserApplyTeamDto dto) throws Exception {
		checkObjIsNull(dto);
		UserApplyTeam m = BeanUtils.createBeanByTarget(dto, UserApplyTeam.class);
		String id = UUIDGenerator.getUUID();
		m.setId(id);
		userApplyTeamDao.insertSelective(m);
		return id;
	}

	@Override
	public void del(String id) throws Exception {
		checkIdIsNull(id);
		UserApplyTeam m = userApplyTeamDao.selectByPrimaryKey(id);
		checkObjIsNotExist(m);
		m.setStat(DataStatus.DISABLED);
		userApplyTeamDao.updateByPrimaryKeySelective(m);
	}

	@Override
	public void update(UserApplyTeamDto dto) throws Exception {
		checkObjIsNull(dto);
		checkIdIsNull(dto.getId());
		checkObjIsNotExist(userApplyTeamDao.selectByPrimaryKey(dto.getId()));
		UserApplyTeam m = BeanUtils.createBeanByTarget(dto, UserApplyTeam.class);
		userApplyTeamDao.updateByPrimaryKeySelective(m);
	}

	@Override
	public UserApplyTeamDto getUserApplyTeamById(String id) throws Exception {
		checkIdIsNull(id);
		UserApplyTeam m = userApplyTeamDao.selectByPrimaryKey(id);
		UserApplyTeamDto dto = BeanUtils.createBeanByTarget(m, UserApplyTeamDto.class);
		return dto;
	}

	@Override
	public List<UserApplyTeamDto> findUserApplyTeamByParam(UserApplyTeamDto dto) throws Exception {
		return userApplyTeamDao.findUserApplyTeamByParam(dto);
	}

	@Override
	public PageResult<UserApplyTeamDto> findUserApplyTeamByParam(UserApplyTeamDto dto, PageQuery query)
			throws Exception {
		int total = userApplyTeamDao.countUserApplyTeamByParam(dto);
		if (total > 0){
			query.setTotal(total);
			List<UserApplyTeamDto> results = userApplyTeamDao.findUserApplyTeamByParam(dto, query);
			return new PageResult<UserApplyTeamDto>(query, results);
		}
		
		return null;
	}

	private void checkObjIsNull(Object obj) {
		if (null == obj){
			throw new RuntimeException("对不起,用户申请球队记录对象为空!");
		}
	}
	
	private void checkIdIsNull(String id) {
		if (StringUtils.isBlank(id)){
			throw new RuntimeException("对不起,用户申请球队记录对象主键ID为空!");
		}
	}
	
	private void checkObjIsNotExist(Object obj) {
		if (null == obj){
			throw new RuntimeException("对不起,用户申请球队记录对象不存在!");
		}
	}
}