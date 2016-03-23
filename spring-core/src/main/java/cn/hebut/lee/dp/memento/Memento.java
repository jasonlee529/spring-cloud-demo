/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.memento;

import java.util.Map;

public class Memento {
	
	private Map<String, String> mem;

	public Memento(Map<String, String> describe) {
		this.mem = describe;
	}

	public Map<String, String> getMem() {
		return mem;
	}

	public void setMem(Map<String, String> mem) {
		this.mem = mem;
	}

	
}
