package com.cn.solomon.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cn.solomon.entity.SysUser;
import com.cn.solomon.service.ISysUserService;

@Controller
public class LoginController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	@Autowired
	private ISysUserService sysUserService;

	@RequestMapping("/login")
	public ModelAndView doLogin(String username,String password,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("redirect:/index.jsp");
		log.info("username"+username+",password"+password+"method"+request.getMethod());
		if (!request.getMethod().equals("POST")) {
			request.getSession().setAttribute("message", "支持POST方法提交！");
		}else{
			SysUser user = sysUserService.getSingerUser(username);
			if(user == null){
				request.getSession().setAttribute("message", "用户不存在！");
			}else{
				if(!user.getPassword().equals(password)){
					request.getSession().setAttribute("message", "用户或者密码错误！");
				}else{
					mav.addObject("message", "HelloWorld!"+user.getUsername()+","+user.getPassword());
					mav.setViewName("mainpage");
				}
			}
			
		}
		return mav;
	}
	
	
}
