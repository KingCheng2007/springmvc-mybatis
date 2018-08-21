package com.cn.solomon.study.sjms.observer;

import java.util.Vector;

/**
 * <p>Title:Teacher</p>
 * <p>Description:老师对像，『学生需要知道老师的电话，所以老师是目标对象（subject），学生是观察者（observer），当老师的电话发生改变，学生得到通知，更新电话记录』</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2018年8月18日 上午10:50:56
 * @version v1.0
 */
public class Teacher implements Subject{
	
	private String phone;
	private Vector<Observer> students;
	
	public void setPhone(String phone){
		this.phone = phone;
		notice(); // 号码变化，发布通知
	}
	
	public String getPhone(){
		return phone;
	}
	
	public Teacher(){
		phone = "";
		students = new Vector<Observer>();
	}

	@Override
	public void attach(Observer o) {
		students.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		students.remove(o);
		
	}

	@Override
	public void notice() {
		// notice 发布通知给观察者对象
		for(int i=0;i<students.size();i++){
			students.get(i).update(); //update 观察者收到通知后更新 数据
		}
		
	}

}
