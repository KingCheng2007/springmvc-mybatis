package com.cn.solomon.entity;

/**
 * <p>Title:User</p>
 * <p>Description:用户实体表</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月11日 上午12:35:14
 * @version v1.0
 */
@SuppressWarnings("serial")
public class User implements java.io.Serializable{
	private int userId;
	private String userName;
	private String userPassword;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	

}
