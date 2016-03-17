/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.refactor.statement;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 4;

	private String title;
	private int priceCode;
	private Price price;

	public Movie(String title, int priceCode) {
		super();
		this.title = title;
		this.setPriceCode(priceCode);
		;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrent price ");
		}
		this.priceCode = priceCode;
	}

	public int getFrequentRentalPoints(int daysRented) {
		return price.getFrequentRentalPoints(daysRented);
	}

	public double getCharge(int daysRented) {
		
		return price.getCharge(daysRented);
	}

}
