/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.ha.toy.poly;

public class Poly {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println(a1.show(b)); // A and A
		System.out.println(a1.show(c)); // A and A
		System.out.println(a1.show(d)); // A and D
		System.out.println(a2.show(b)); // B and A
		System.out.println(a2.show(c)); // B and A
		System.out.println(a2.show(d)); // A and D
		System.out.println(b.show(b)); // B and B
		System.out.println(b.show(c)); // B and C
		System.out.println(b.show(d)); // A and D

	}
}

class A {
	public String show(A obj) {
		return ("A and A");
	}

	public String show(D obj) {
		return ("A and D");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	@Override
	public String show(A obj) {
		return ("B and A");
	}

	@Override
	public String show(D obj) {
		return super.show(obj);
	}

}

class C extends B {
}

class D extends B {
}
