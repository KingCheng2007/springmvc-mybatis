package com.cn.solomon.study.sjms.observer;

public class Student implements Observer{
	private String name;
	private String phone;
	private Teacher teacher;
	public Student(String name,Teacher teacher){
		this.name = name;
		this.teacher = teacher;
	}
	public void show(){
		System.out.println("学生:"+name+"的老师："+teacher+",的电话是"+phone);
	}

	@Override
	public void update() {
		phone = teacher.getPhone();
		
	}

}
