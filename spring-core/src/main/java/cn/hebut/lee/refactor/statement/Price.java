/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.refactor.statement;

/**
 * 租用价格计算类
 */
public abstract class Price {

	abstract int getPriceCode();

	public abstract double getCharge(int daysRented);

	public int getFrequentRentalPoints(int daysRented) {
		return 1;
	}

}

class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

}

class RegularPrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}
}

class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRentalPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}