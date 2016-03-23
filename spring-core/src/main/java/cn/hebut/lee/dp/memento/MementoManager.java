/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.dp.memento;

import java.util.HashMap;

public class MementoManager {
	private HashMap<String, Memento> meMap = new HashMap<String, Memento>();

	public Memento getMemento(String id) {
		return this.meMap.get(id);
	}

	public void setMemento(String id, Memento me) {
		this.meMap.put(id, me);
	}
}
