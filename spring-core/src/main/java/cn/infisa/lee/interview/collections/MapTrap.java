/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.infisa.lee.interview.collections;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.BeanMetadataAttributeAccessor;
import org.springframework.core.AttributeAccessorSupport;

public class MapTrap {

	private final Map<String, Object> attributes = new LinkedHashMap<String, Object>(0);;
	public static void main(String[] args) {
		testMap();
	}

	private static void testMap() {
		MapTrap t = new MapTrap();
		t.attributes.put("a", "b");
		System.out.println(Arrays.toString(t.attributes.keySet().toArray()));
	}

	private static void testAttr() {
		AttributeAccessorSupport a = new BeanMetadataAttributeAccessor();
		a.setAttribute("a", "b");
		a.setAttribute("a", "ba");
		a.setAttribute("c", "c");
		System.out.println(Arrays.toString(a.attributeNames()));
		System.out.println(a.getAttribute("a"));
	}
}
