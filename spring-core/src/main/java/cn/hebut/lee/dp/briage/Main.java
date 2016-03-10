/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.briage;

public class Main {

	public static void main(String[] args) {
		Tag tag = new NumberTag();
		UseTag uTag = new FilterUseTag(tag);
		uTag.doCal();

		tag = new EnumsTag();
		uTag.setTag(tag);;
		uTag.doCal();
		
		
		tag = new NumberTag();
		uTag = new ExportUseTag(tag);
		uTag.doCal();

		tag = new EnumsTag();
		uTag.setTag(tag);;
		uTag.doCal();
	}
}
