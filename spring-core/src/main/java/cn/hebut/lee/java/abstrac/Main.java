/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.java.abstrac;

import org.junit.Test;

public class Main {

	@Test
	public void testAbstract(){
		Father f = new Son();
		Son s = new Son();
		System.out.println(f.toString());
		System.out.println(s.toString());
	}
}
