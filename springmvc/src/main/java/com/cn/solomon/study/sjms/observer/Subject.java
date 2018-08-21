package com.cn.solomon.study.sjms.observer;

/**
 * 
 * <p>Title:Subject</p>
 * <p>Description:目标接口</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午10:47:11
 * @version v1.0
 */
public interface Subject {

	/**
	 * 注册观察者
	 * @param o
	 */
	public void attach(Observer o);
	/**
	 * 删除观察者
	 * @param o
	 */
	public void detach(Observer o);
	
	/**
	 * 当目标状态发生改变时，发布通知给观察者对象
	 */
	public void notice();
}
