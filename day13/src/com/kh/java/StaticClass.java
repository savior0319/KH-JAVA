package com.kh.java;

public class StaticClass {
	private static int count = 0;

	public StaticClass() {
		increCount();
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return this.count;
	}

	public void increCount() {
		this.count++;
	}
}
