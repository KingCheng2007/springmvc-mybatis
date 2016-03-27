package com.cn.solomon.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cn.solomon.entity.SysUser;
import com.cn.solomon.mapper.ISysUserMapper;
import com.cn.solomon.service.ISysUserService;
@Service
@Qualifier("sysUserService")
public class SysUserServiceImpl implements ISysUserService{
	
	@Resource
	private ISysUserMapper sysUserMapper;
	
	public SysUser getUser(String id) {
		return sysUserMapper.selectUserById(id);
	}

}
