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
import com.tianfang.user.dto.RemindDto;
import com.tianfang.user.enums.RemindType;
import com.tianfang.user.service.IRemindService;

@Controller
@RequestMapping(value = "remind")
public class RemindController extends BaseController{

	@Autowired
	private IRemindService remindService;
	
	@RequestMapping(value = "list")
    public ModelAndView findpage(RemindDto dto, ExtPageQuery page) throws Exception {
        ModelAndView mv = this.getModelAndView(this.getSessionUserId());
        PageResult<RemindDto> result = remindService.findRemindByParam(dto, page.changeToPageQuery());
        mv.setViewName("/remind/list");
        mv.addObject("pageList", result);
        mv.addObject("types", RemindType.values());
        mv.addObject("params", dto);
        return mv;
    }
	
	@RequestMapping(value = "detail")
    public ModelAndView detail(String id) throws Exception {
        ModelAndView mv = this.getModelAndView(this.getSessionUserId());
        RemindDto remind = remindService.getRemindById(id);
        mv.setViewName("/remind/detail");
        mv.addObject("datas", remind);
        mv.addObject("types", RemindType.values());
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
        	remindService.del(ids);
			result = MessageResp.getMessage(true, "删除成功~");
		} catch (Exception e) {
			e.printStackTrace();
			result = MessageResp.getMessage(false, e.getMessage());
		}
        return result;
    }
}