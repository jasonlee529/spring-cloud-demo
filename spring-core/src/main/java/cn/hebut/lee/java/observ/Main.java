/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.java.observ;

public class Main {

	public static void main(String[] args) {
		Message m = new Message("ab");
		Manager m1 = new Manager("m1");
		Manager m2 = new Manager("m2");
		m.addObserver(m1);
		m.addObserver(m2);
		m.notifyObservers();
	}
}
