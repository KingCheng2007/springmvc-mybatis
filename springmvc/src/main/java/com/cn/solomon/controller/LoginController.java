package com.cn.solomon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.solomon.entity.SysUser;
import com.cn.solomon.service.ISysUserService;

@Controller
public class LoginController {
	@Autowired
	@Qualifier("sysUserService")
	private ISysUserService sysUserService;

	@RequestMapping("/login")
	public ModelAndView doLogin() {
		SysUser user = sysUserService.getUser("1");
		System.out.println(user.getUsername());
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "HelloWorld");
		mav.setViewName("mainpage");
		return mav;
	}
}
