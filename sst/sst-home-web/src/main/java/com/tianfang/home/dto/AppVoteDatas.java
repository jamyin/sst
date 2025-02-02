package com.tianfang.home.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**		
 * <p>Title: AppVoteDatas </p>
 * <p>Description: 类描述:移动端投票发起数据封装</p>
 * <p>Copyright (c) 2015 </p>
 * <p>Company: 上海天坊信息科技有限公司</p>
 * @author xiang_wang	
 * @date 2016年3月9日下午1:21:31
 * @version 1.0
 * <p>修改人：</p>
 * <p>修改时间：</p>
 * <p>修改备注：</p>
 */
public class AppVoteDatas implements Serializable{

	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@Getter
	@Setter
	private String userId;

	/**
	 * 投票标题
	 */
	@Setter
	@Getter
    private String title;

	/**
	 * 允许投票项数
	 */
	@Setter
	@Getter
    private Integer optionNum;

	/**
	 * 截止时间(格式:yyyy-MM-dd HH)
	 */
	@Setter
	@Getter
    private String endTime;
	
	/**
	 * 是否匿名
	 */
	@Setter
	@Getter
    private Integer isAnonymous;
	
	/**
	 * 发送给那些用户
	 */
	@Setter
	@Getter
	private String[] toUserIds;

	/**
	 * 选项对象封装
	 */
	@Getter
	@Setter
	private List<AppOption> options;
	
	@Getter
	@Setter
    private String [] jIds;   //接收用户的聊天账号  即电话号码
}