/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.lego.algorithm.dp;

import java.util.Arrays;

/**
 * https://www.zhihu.com/question/41507833
 * 知乎的一个问题：有两个数组a,b，大小都为n,；通过交换a,b中的元素，使|sum(a)-sum(b)|最小
 */
public class Max2N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int[] originA;
	private int[] originB;
	private int[] resultA;
	private int[] resultB;

	public Max2N(int[] a, int[] b) {
		super();
		this.originA = a;
		this.originB = b;
	}

	public int[] getOriginA() {
		return originA;
	}

	public int[] getOriginB() {
		return originB;
	}

	public int[] getResultA() {
		return resultA;
	}

	public int[] getResultB() {
		return resultB;
	}

	public void calculate() {
		initResult();
		int _a = sum(resultA);
		int _b = sum(resultB);
		int _c = _a - _b;
		boolean hasNext = true;
		do {
			if (_c == 0) {
				hasNext = false;
			}

		} while (hasNext);
	}

	private void initResult() {
		int length = resultA.length;
		int[] c = new int[length * 2];
		System.arraycopy(resultA, 0, c, 0, length);
		System.arraycopy(resultB, 0, c, length, length);
		Arrays.sort(c);
		resultA = new int[length];
		resultB = new int[length];
		for (int i = 0; i < length; i++) {
			resultA[i] = c[i * 2];
			resultB[i] = c[i * 2 + 1];
		}
	}

	private void swap(int index){
		
	}
	private int sum(int[] in) {
		int r = 0;
		for (int i : in) {
			r += i;
		}
		return r;
	}
}
