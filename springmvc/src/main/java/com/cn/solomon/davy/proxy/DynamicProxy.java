package com.cn.solomon.davy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>Title:DynamicProxy</p>
 * <p>Description:动态代理</p>
 * <p>Company:</p>
 * @author CMIN
 * @date 2016年9月21日 下午9:20:05
 * @version v1.0
 * 动态代理只能代理有接口的类
 */
public class DynamicProxy implements InvocationHandler {

	private Object target;

	public DynamicProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(target, args);
		after();
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getProxy(){
		return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	private void before() {
		System.out.println(".........before");
	}

	private void after() {
		System.out.println(".........after");
	}

	public static void main(String[] args) {
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloProxy = dynamicProxy.getProxy();
		helloProxy.say("金成敏");
	}

}
