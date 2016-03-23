/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.memento;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

public class Originator {

	private String province;
	private String city;
	private String postCode;

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Memento createMemento() {
		try {
			return new Memento(BeanUtils.describe(this));
		} catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void backFromMemento(Memento memento) {
		try {
			BeanUtils.populate(this, memento.getMem());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Originator [province=" + province + ", city=" + city + ", postCode=" + postCode
				+ "]";
	}

}
