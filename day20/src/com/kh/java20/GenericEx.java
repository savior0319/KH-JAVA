package com.kh.java20;

public class GenericEx <T, E> {

	private T data1;
	private E data2;
	
	public GenericEx(T data1, E data2) { this.data1 = data1; this.data2 = data2;}
	public T getData1() { return data1; }
	public E getData2() { return data2; }
}
