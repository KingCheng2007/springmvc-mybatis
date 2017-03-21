package com.cn.solomon.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Title:PropsUtil</p>
 * <p>Description:属性文件工具类</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月20日 下午3:16:09
 * @version v1.0
 */
public class PropsUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);
	
	/**
	 * 加载属性文件
	 * @param fileName
	 * @return
	 */
	public static Properties loadProps(String fileName){
		Properties props = null ;
		InputStream is = null ;
		try{
			is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName
					);
			if(is == null ){
				throw new FileNotFoundException(fileName+"file is not found") ;
			}
			props = new Properties() ;
			props.load(is);
		}catch(IOException e){
			LOGGER.error("load properties file failure",e);
		}finally{
			if(is != null){
				try{
					is.close();
				}catch(IOException e){
					LOGGER.error("close input stream failure",e);
				}
			}
		}
		return props;
	}
	
	/**
	 * 获取字符型属性（默认值为空字符串）
	 * @param props
	 * @param key
	 * @return
	 */
	public static String getString(Properties props,String key){
		return getString(props,key,"");
	}
	
	/**
	 * 获取字符型属性（可指定默认值）
	 * @param props
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public static String getString(Properties props,String key,String defaultValue){
		String value = defaultValue;
		if(props.containsKey(key)){
			value = props.getProperty(key);
		}
		return value;	
	}
	
	public static int getInt(Properties props,String key){
		return getInt(props, key, 0);
	}
	
	public static int getInt(Properties props,String key,int defaultValue){
		int value = defaultValue;
		if(props.containsKey(key)){
			value = CastUtil.castInt(props.getProperty(key));
		}
		return value;	
	}
}
