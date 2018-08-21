package com.cn.solomon.study.sjms.strategy;

public class BlackDuck extends Duck {
	
	public BlackDuck (){
		flyBehavior = new FlyWithWings();
		quakBehavior = new Quakquak();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
