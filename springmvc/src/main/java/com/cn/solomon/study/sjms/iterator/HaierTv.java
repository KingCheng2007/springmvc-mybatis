package com.cn.solomon.study.sjms.iterator;

import java.util.Vector;

public class HaierTv implements Television{

	private Vector channel;
	
	public HaierTv(){
		channel = new Vector();
		channel.add(new Item("channel 1"));
		channel.add(new Item("channel 2"));
		channel.add(new Item("channel 3"));
		channel.add(new Item("channel 4"));
		channel.add(new Item("channel 5"));
		channel.add(new Item("channel 6"));
		channel.add(new Item("channel 7"));
	}
	@Override
	public Iterator iterator() {
		return new Controller(channel);
	}

}
