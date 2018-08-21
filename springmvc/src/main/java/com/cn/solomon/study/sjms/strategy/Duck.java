package com.cn.solomon.study.sjms.strategy;

/**
 * 鸭子类对象
 * <p>Title:Duck</p>
 * <p>Description:</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午11:50:59
 * @version v1.0
 */
public abstract class Duck {

	FlyBehavior flyBehavior;//鸭子飞的行为
	QuakBehavior quakBehavior;//鸭子叫的行为
	public Duck(){}
	
	public abstract void display();
	
	public void swim(){
		
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuak(){
		quakBehavior.quack();
	}
}
