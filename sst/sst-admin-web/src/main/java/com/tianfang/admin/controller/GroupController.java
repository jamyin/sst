package com.tianfang.admin.controller;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tianfang.common.ext.ExtPageQuery;
import com.tianfang.common.model.MessageResp;
import com.tianfang.common.model.PageResult;
import com.tianfang.user.dto.GroupDto;
import com.tianfang.user.service.IGroupService;

@Controller
@RequestMapping(value="group")
public class GroupController extends BaseController{

	@Autowired
	private IGroupService groupService;
	
	@RequestMapping(value = "list")
    public ModelAndView findpage(GroupDto dto, ExtPageQuery page) throws Exception {
        ModelAndView mv = this.getModelAndView(this.getSessionUserId());
        PageResult<GroupDto> result = groupService.findGroupByParam(dto, page.changeToPageQuery());
        mv.setViewName("/group/list");
        mv.addObject("pageList", result);
        mv.addObject("params", dto);
        return mv;
    }
	
	@RequestMapping(value = "detail")
    public ModelAndView detail(String id) throws Exception {
        ModelAndView mv = this.getModelAndView(this.getSessionUserId());
        GroupDto dto = groupService.getGroupById(id, true);
        mv.setViewName("/group/detail");
        mv.addObject("datas", dto);
        return mv;
    }
	
	@RequestMapping(value = "delAdIds")
    @ResponseBody
    public Map<String, Object> delAdIds(String ids){
        if (StringUtils.isBlank(ids)) {
            return MessageResp.getMessage(false, "请求参数不能为空~");
        }
        Map<String, Object> result;
        try {
        	groupService.del(ids);
			result = MessageResp.getMessage(true, "删除成功~");
		} catch (Exception e) {
			e.printStackTrace();
			result = MessageResp.getMessage(false, e.getMessage());
		}
        return result;
    }
}