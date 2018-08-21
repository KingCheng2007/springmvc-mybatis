package com.cn.solomon.study.sjms.strategy;

/**
 * 呱呱叫的
 * <p>Title:Quakquak</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午11:57:55
 * @version v1.0
 */
public class Quakquak implements QuakBehavior {

	@Override
	public void quack() {
		System.out.println("我是呱呱叫");
	}

}
