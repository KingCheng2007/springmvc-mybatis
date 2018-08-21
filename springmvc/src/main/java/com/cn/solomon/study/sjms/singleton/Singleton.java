package com.cn.solomon.study.sjms.singleton;

/**
 * <p>Title:Singleton</p>
 * <p>Description:单例模式</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午10:37:05
 * @version v1.0
 */
public class Singleton {

	private static Singleton instance = null;
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}
