package com.cn.solomon.study.sjms.observer;
/**
 * 
 * <p>Title:Observer</p>
 * <p>Description:观察者接口</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午10:45:03
 * @version v1.0
 */
public interface Observer {

	/**
	 * 收到目标（subject）通知（notice）后的更新接口
	 */
	public void update();
}
