/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.infisa.lee.interview.collections;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	public static void main(String[] args) {
		List<Beans> list = new ArrayList<Beans>() {
			{
				add(new Beans("4"));
			}
		};
		list.add(new Beans("1"));
		list.add(new Beans("3"));
		list.add(new Beans("2"));

		// sort this list

		// 输出
		for (Beans b : list) {
			System.out.println(b.toString());
		}
	}
}

class Beans {
	private String name;

	public Beans(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}