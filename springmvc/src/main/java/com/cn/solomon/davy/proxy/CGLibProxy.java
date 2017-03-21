package com.cn.solomon.davy.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor {

	@SuppressWarnings("unchecked")
	public <T> T getProxy(Class<T> cls) {
		return (T) Enhancer.create(cls, this);
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) 
			throws Throwable {
		before();
		Object result = proxy.invokeSuper(obj, args);
		after();
		return null;
	}

	private void before() {
		// TODO Auto-generated method stub
		
	}
	
	private void after() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=30;i++){
			if(i<10)
			System.out.println("pan /file C:\\PMES\\PMES_Delpoy\\DataTranslate\\Davy_ETL\\pmesls10groups\\PMES-DATACOPY-0"+i+".ktr /logfile C:\\PMES\\ETL\\PMES-DATACOPY-0"+i+".ktr");
			else
			System.out.println("pan /file C:\\PMES\\PMES_Delpoy\\DataTranslate\\Davy_ETL\\pmesls10groups\\PMES-DATACOPY-"+i+".ktr /logfile C:\\PMES\\ETL\\PMES-DATACOPY-"+i+".ktr");
		}
	}

}
