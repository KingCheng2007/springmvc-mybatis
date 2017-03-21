package com.cn.solomon.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.cn.solomon.base.impl.BaseDaoImpl;
import com.cn.solomon.dao.UserDao;
import com.cn.solomon.entity.Roles;
import com.cn.solomon.entity.User;

/**
 * 具体Dao 实现类集成 基础Dao的类，实现具体Dao的接口
 * <p>Title:UserDaoImpl</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月11日 上午12:47:55
 * @version v1.0
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public int countUser(String userName, String userPassword) {
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("userName", userName);
		map.put("userPassword", userPassword);
		return (Integer)getSqlSession().selectOne("user.countUser", map);
	}

	@Override
	public User querySingleUser(String userName) {
		return (User)getSqlSession().selectOne("user.querySingleUser",userName);
	}

	@Override
	public Roles findByUserRole(String userId) {
		return null;
	}

}
