/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.briage;

public class FilterUseTag extends UseTag {

	public FilterUseTag(Tag tag) {
		super(tag);
	}

	@Override
	public void doCal() {
		super.doCal();
		System.out.println(" filter use tag");
	}

	
}
