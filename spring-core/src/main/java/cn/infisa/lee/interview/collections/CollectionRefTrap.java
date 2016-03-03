/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.infisa.lee.interview.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionRefTrap {
	
	public static void main(String[] args) {
		List<Bean> beans = new ArrayList<Bean>();
		Bean a = new Bean("A");
		Bean b = new Bean("B");
		Bean c = new Bean("C");
		beans.add(a);
		beans.add(b);
		beans.add(c);
		for(Bean bean : beans){
			System.out.println(bean);
		}
		System.out.println("========分割线 ===========");
		a.setName("a1");
		for(Bean bean : beans){
			System.out.println(bean);
		}
	}
}

class Bean{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bean(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bean [name=" + name + "]";
	}
	
}