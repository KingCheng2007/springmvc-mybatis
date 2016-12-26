package com.cn.solomon.base;

import java.util.List;

import com.cn.solomon.page.PageView;

/**
 * <p>Title:BaseDao</p>
 * <p>Description:集合持久层公用的增删改查接口</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月11日 上午12:26:57
 * @version v1.0
 * @param <T>
 */
public interface BaseDao<T> {

	/**
	 * 返回分页后的数据
	 * @param pageView
	 * @param t
	 * @return
	 */
	public List<T> query(PageView pageView,T t);
	
	/**
	 * 返回所有的数据
	 * @param t
	 * @return
	 */
	public List<T> queryAll(T t);
	
	public void delete(String id);
	
	public void modify(T t);
	
	public T getById(String id);
	
	public void add(T t);
	
}
