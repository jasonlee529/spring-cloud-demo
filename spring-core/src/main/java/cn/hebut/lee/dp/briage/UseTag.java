/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.briage;

public abstract class UseTag {
	private Tag tag;

	public UseTag(Tag tag) {
		super();
		this.tag = tag;
	}

	public void doCal() {
		System.out.println(tag.getName());
	}

	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	

}
