package com.cn.solomon.study.sjms.iterator;

/**
 * Item:集合中的各对象，若为其他类型可以改成接口或者类
 */
public interface Iterator {

	public Item first();
	public Item next();
	public boolean isDone();
	public Item currentItem();
}
