package com.cn.solomon.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cn.solomon.entity.SysUser;


//合理使用描述参数和SQL语句返回值的接口

@Repository
public interface ISysUserMapper {

	public SysUser selectUserById(String id);

	public SysUser selectUserByName(String userName);

	public List<SysUser> selectUsers();
}
