/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.briage;

public class ExportUseTag extends UseTag {

	public ExportUseTag(Tag tag) {
		super(tag);
	}

	@Override
	public void doCal() {
		// TODO Auto-generated method stub
		super.doCal();
		System.out.println("exoprt use tag " + this.getTag());
	}

}
