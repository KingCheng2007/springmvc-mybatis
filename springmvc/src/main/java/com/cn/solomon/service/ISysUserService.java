package com.cn.solomon.service;

import java.util.List;

import com.cn.solomon.entity.SysUser;

public interface ISysUserService {

	public SysUser getUser(String id);
	
	public SysUser getSingerUser(String userName);
	
	public List<SysUser> getUsers();
}
