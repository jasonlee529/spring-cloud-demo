/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.lego.algorithm.blue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Main {

	private static final String[] arrs = { "01", "02", "03", "04", "05", "06", "07", "08", "09",
			"10", "11", "12", "13", "14", "15", "16" };

	public static void main(String[] args) {
		List<String> queues = new ArrayList<String>() {
			{
				this.add("01");
				this.add("02");
				this.add("03");
				this.add("04");
				this.add("05");
				this.add("06");
			}
		};
		List<Probability> probablities = initProbabilities();
		for (String key : queues) {
			System.out.println(" calculate : " + key);
			calculate(probablities, key);
			System.out.println(probablities.toString());
			System.out.println("===========");
		}
	}

	private static List<Probability> calculate(List<Probability> list, String key) {
		for (Probability p : list) {
			if (StringUtils.equals(p.getPoint(), key)) {
				resetProbility(p);
			} else {
				p.setRate(p.getRate() * 1 / arrs.length);
				p.setLength(p.getLength() + 1);
			}
		}
		Collections.sort(list, new Comparator<Probability>() {

			@Override
			public int compare(Probability o1, Probability o2) {
				return (int) (o1.getRate() - o2.getRate() > 0 ? 1 : -1);
			}
		});
		return list;
	}

	private static List<Probability> initProbabilities() {
		List<Probability> list = new ArrayList<Probability>();
		for (String p : arrs) {
			Probability pro = new Probability(p);
			list.add(resetProbility(pro));
		}
		return list;
	}

	private static Probability resetProbility(Probability p) {
		p.setLength(0);
		p.setRate(1 / arrs.length);
		return p;
	}
}

class Probability {
	private String point;
	private double rate;
	private int length;

	public Probability() {
		super();
	}

	public Probability(String point) {
		super();
		this.point = point;
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
