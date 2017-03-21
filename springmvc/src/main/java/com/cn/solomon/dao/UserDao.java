package com.cn.solomon.dao;

import com.cn.solomon.base.BaseDao;
import com.cn.solomon.entity.Roles;
import com.cn.solomon.entity.User;

/**
 * <p>Title:UserDao</p>
 * <p>Description:用户Dao接口</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月11日 上午12:38:27
 * @version v1.0
 */
public interface UserDao extends BaseDao<User>{

	/**
	 * 查询用户数
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	public int countUser(String userName,String userPassword);
	
	public User querySingleUser(String userName);
	
	public Roles findByUserRole(String userId);
}
