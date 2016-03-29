/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.java.observ;

import java.util.Observable;
import java.util.Observer;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Manager implements Observer {

	private String name;

	public Manager(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		Message m = (Message)o;
		System.out.println(name + " : "+ToStringBuilder.reflectionToString(m));
	}

}
