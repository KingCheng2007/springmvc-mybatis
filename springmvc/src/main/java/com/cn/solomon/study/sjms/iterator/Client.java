package com.cn.solomon.study.sjms.iterator;

public class Client {

	public static void main(String[] args) {
		Television tv = new HaierTv();
		Iterator it = tv.iterator();
		//System.out.println(it.first().getName());
		while(!it.isDone()){
			System.out.println(it.next().getName());
		}
	}
}
