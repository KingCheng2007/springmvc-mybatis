package com.cn.solomon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("login")
	public ModelAndView doLogin(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","HelloWorld");
		mav.setViewName("mainpage");
		return mav;
	}
}
