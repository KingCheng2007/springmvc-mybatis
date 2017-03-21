package com.cn.solomon.davy.proxy;

public class HelloImpl implements Hello {

	@Override
	public void say(String name) {
		// TODO Auto-generated method stub
		System.out.println("Hello!+"+name);
	}

}
