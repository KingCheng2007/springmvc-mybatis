package com.cn.solomon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.solomon.entity.SysUser;
import com.cn.solomon.mapper.ISysUserMapper;
import com.cn.solomon.service.ISysUserService;
@Service
public class SysUserServiceImpl implements ISysUserService{
	
	@Autowired
	private ISysUserMapper sysUserMapper;
	
	public SysUser getUser(String id) {
		return sysUserMapper.selectUserById(id);
	}
	
	public SysUser getSingerUser(String userName) {
		return sysUserMapper.selectUserByName(userName);
	}

	public List<SysUser> getUsers() {
		return sysUserMapper.selectUsers();
	}
}
