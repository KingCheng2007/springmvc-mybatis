package com.cn.solomon.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.cn.solomon.page.PageView;

/**
 * <p>Title:BaseDaoImpl</p>
 * <p>Description:集合持久层的公用增删改查类</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月10日 下午11:41:54
 * @version v1.0
 * @param <T> 表示传入的实体类
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport {
	
	/**
	 * 获取传过来的泛型名称
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public String getClassName(){
		ParameterizedType pt = null ;
		Class<T> clazz =  null ;
		try{
			pt = (ParameterizedType) this.getClass().getGenericSuperclass();
			clazz = (Class<T>) pt.getActualTypeArguments()[0] ;
		}catch(ClassCastException e){
			clazz = (Class<T>) this.getClass();
		}catch(Exception e){
			throw e;
		}
		return clazz.getSimpleName().toString().toLowerCase();
	}
	
	public void add(T t){
		getSqlSession().insert(this.getClassName()+".add", t);
	}
	
	public void delete(String id){
		getSqlSession().delete(this.getClassName()+".deleteById", id);
	}
	
	public void modify(T t){
		getSqlSession().update(this.getClassName()+".update",t);
	}
	
	public T getById(String id){
		return getSqlSession().selectOne(this.getClassName()+".getById", id);
	}
	
	public List<T> query(PageView pageView,T t){
		Map<Object,Object> map = new HashMap<Object,Object>();
		map.put("paging", pageView);
		map.put("t", t);
		return getSqlSession().selectList(this.getClassName()+".query",map);
	}
	
	public List<T> queryAll(T t){
		return getSqlSession().selectList(this.getClassName()+".queryAll", t);
	}
	
	public static void main(String[] args) {
		System.out.println(new BaseDaoImpl<>().getClassName());
	}

}
