/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.refactor.statement;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector _rentals = new Vector();

	public Customer(String name) {
		super();
		this.name = name;
	}

	public void addRental(Rental rental) {
		_rentals.add(rental);
	}

	public String getName() {
		return this.name;
	}

	public String statement() {
		int frequentRenterPoints = 0;
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + ": \n";
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";
		}
		result += "Amount owes is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	public double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}

	public double getFrequentRenterPoints() {
		int result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrenquentRentalPoints();
		}
		return result;
	}

}
