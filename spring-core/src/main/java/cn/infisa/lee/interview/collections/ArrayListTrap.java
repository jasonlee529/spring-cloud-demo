/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.infisa.lee.interview.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sets = new HashSet<Integer>();
		List<Integer> lists = new ArrayList<Integer>();

		for (int i = -3; i < 4; i++) {
			sets.add(i);
			lists.add(i);
		}

		for (int i = 0; i < 4; i++) {
			sets.remove(i);
			lists.remove(i);
		}
		for (Integer i : sets) {
			System.out.println(" sets " + i);
		}
		for (Integer i : lists) {
			System.out.println(" lists " + i);
		}

	}

}
