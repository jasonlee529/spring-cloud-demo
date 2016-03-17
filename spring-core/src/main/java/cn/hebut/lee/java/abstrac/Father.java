/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.java.abstrac;

public abstract class Father {

	private String name ; 
	
	public Father(){
		
	}

	public Father(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Father [name=" + name + "]";
	}
	
}
