/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.refactor.statement;

public class Rental {

	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}

	public double getCharge() {
		return getMovie().getCharge(daysRented);
	}

	public int getFrenquentRentalPoints() {
		return movie.getFrequentRentalPoints(daysRented);
	}

}
