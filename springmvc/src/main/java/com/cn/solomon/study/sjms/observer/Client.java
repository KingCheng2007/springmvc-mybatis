package com.cn.solomon.study.sjms.observer;

import java.util.Vector;

public class Client {

	public static void main(String[] args) {
		/**
		 * 老师是目标人，目标人(subject)状态发生变化，告诉预约（attach）过的的观察者，
		 * 观察者（observer）更新（update）自己的信息
		 */
		Vector<Observer> students = new Vector<Observer>();
		Teacher teacher = new Teacher();
		for(int i=0;i<10;i++){
			Student student = new Student("学生"+i,teacher);
			students.add(student);
			//teacher.attach(student); //
		}
		
		teacher.setPhone("120");
		for(int i=0;i<10;i++){
			((Student)students.get(i)).show();
		}
		
		teacher.setPhone("119");
		for(int i=0;i<10;i++){
			((Student)students.get(i)).show();
		}
	}
}
