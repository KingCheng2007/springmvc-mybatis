package com.cn.solomon.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.solomon.entity.SysUser;
import com.cn.solomon.service.ISysUserService;

@Controller
public class UserController {
	private Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping("/sysuser/list")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("sysuser/list");
		List<SysUser> list = sysUserService.getUsers();
		log.info("数组大小为："+list.size());
		mav.addObject("list", list);
		mav.setViewName("sysuser/list");
		return mav;
	}
}
