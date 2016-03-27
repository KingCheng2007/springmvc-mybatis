package com.cn.solomon.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter{
	
	private int comingCount = 0;
	
	private FilterConfig config;

	/* 
	 * 用户完成Filter的初始化
	 */
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

	//这个方法是Filter的核心方法
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		comingCount++;
		ServletContext context = this.config.getServletContext() ;
		long begin = System.currentTimeMillis();
		//输出过滤信息
		System.out.println("开始过滤"+this.comingCount+"...");
		HttpServletRequest hRequest = (HttpServletRequest) request;
		System.out.println("Filter已经获取到用户请求的地址："+hRequest.getServletPath());
		
		System.out.println("getServerInfo的信息："+context.getServerInfo());
		//处理完成后，交给下个Filter或者Servlet处理
		chain.doFilter(hRequest, response);
		
		//对服务器的响应进行处理
		long end = System.currentTimeMillis();
		System.out.println("过滤结束"+this.comingCount+"...");
		System.out.println("请求被定为到："+hRequest.getRequestURI()+";所花费的时间为："+(end-begin));
	}

	public void destroy() {
		this.config = null ;
		System.out.println("destory...");
	}

}
