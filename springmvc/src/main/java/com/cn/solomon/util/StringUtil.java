package com.cn.solomon.util;

import org.springframework.util.StringUtils;

/**
 * <p>Title:StringUtil字符串工具类</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月20日 下午4:03:58
 * @version v1.0
 */
public class StringUtil {

	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str != null){
			str = str.trim();
		}
		return StringUtils.isEmpty(str);
	}
	
	/**
	 * 判断字符串是否为非空
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}
}
