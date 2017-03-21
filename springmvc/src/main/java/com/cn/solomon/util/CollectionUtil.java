package com.cn.solomon.util;

import java.util.Collection;
import java.util.Map;

import org.springframework.util.CollectionUtils;

/**
 * <p>Title:CollectionUtil</p>
 * <p>Description:集合工具类</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月20日 下午4:09:57
 * @version v1.0
 */
public class CollectionUtil {

	/**
	 * 判断Collection 是否为空
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection){
		return CollectionUtils.isEmpty(collection);
	}
	
	/**
	 * 判断Collection 是否为非空
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Collection<?> collection){
		return !isEmpty(collection);
	}
	
}
