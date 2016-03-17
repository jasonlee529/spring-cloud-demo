/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.infisa.lee.interview.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientTrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean a = new Bean("namesf", "key");
		System.out.println(a.toString());
		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("logInfo.out") );
			out.writeObject(a);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"logInfo.out"));
			Bean logInfo = (Bean) in.readObject();
			System.out.println(logInfo.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static class Bean implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = -7047671472829348979L;
		private String name = "abc";
		private transient String key = "a";

		public Bean(String name, String key) {
			super();
			this.name = name;
			this.key = key;
		}

		@Override
		public String toString() {
			String k = null;
			if (key == null) {
				k = "not know";
			} else {
				k = key;
			}
			return "Bean [name=" + name + ", key=" + k + "]";
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

	}
}
