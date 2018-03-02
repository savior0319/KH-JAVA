package com.kh.java20;

public class AnimalMgr <T extends Animal>{
	public T data;

	public AnimalMgr(T data) {
		this.data = data;
	}
}
