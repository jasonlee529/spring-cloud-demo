/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.java.observ;

import java.util.Observable;

public class Message extends Observable{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Message(String name) {
		super();
		this.name = name;
		this.setChanged();
	}
	
	

}
