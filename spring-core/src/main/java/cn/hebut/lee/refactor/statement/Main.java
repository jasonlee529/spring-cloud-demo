/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.refactor.statement;

import org.junit.Test;

public class Main {

	@Test
	public void testRental(){
		Customer lee = new Customer("lee");
		
		Movie m1 = new Movie("Liar Liar", 2);
		Movie m2 = new Movie("Bruce Almighty", 4);
		Movie m3 = new Movie("Teenage Mutant Ninja Turtles", 4);
		Movie m4 = new Movie("Titannic", 0);
		
		Rental r1 = new Rental(m1, 1);
		Rental r2 = new Rental(m2, 2);
		Rental r3 = new Rental(m3, 3);
		Rental r4 = new Rental(m4, 4);
		
		lee.addRental(r1);
		lee.addRental(r2);
		lee.addRental(r3);
		lee.addRental(r4);
		
		System.out.println(lee.statement());
	}
}
