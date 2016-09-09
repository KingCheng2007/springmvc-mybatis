package com.cn.solomon.tools.spoon;

import java.util.LinkedList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("order") 
public class Order {

	private LinkedList<Hop> hops = new LinkedList<Hop>();

	public LinkedList<Hop> getHops() {
		return hops;
	}

	public void setHops(LinkedList<Hop> hops) {
		this.hops = hops;
	}
	
	public String buildXml(){
		
		return null;
	}

}
