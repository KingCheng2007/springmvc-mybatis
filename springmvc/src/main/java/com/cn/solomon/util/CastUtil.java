package com.cn.solomon.util;

/**
 * <p>Title:CastUtil</p>
 * <p>Description:转型操作类</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月20日 下午3:55:58
 * @version v1.0
 */
public class CastUtil {

	/**
	 * 转为String型
	 * @param obj
	 * @return
	 */
	public static String castString(Object obj) {
		return castString(obj,"") ;
	}

	/**
	 * 转为String型（提供默认值 ）
	 * @param obj
	 * @param defaultValue
	 * @return
	 */
	public static String castString(Object obj,String defaultValue) {
		return obj != null ?String.valueOf(obj) :defaultValue ;
	}

	public static int castInt(Object obj){
		return castInt(obj,0);
	}
	
	public static int castInt(Object obj,int defaultValue){
		int intValue = defaultValue;
		if(obj != null){
			String strValue = castString(obj);
			if(StringUtil.isNotEmpty(strValue)){
				try{
					intValue = Integer.parseInt(strValue);
				}catch(NumberFormatException e){
					intValue = defaultValue;
				}
			}
		}
		return intValue;
	}

}
