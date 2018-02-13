package com.kh.java;

public class MethodTest {
	public void test1() {
		int[] arr = {1,2,3,4,5};
		test2(arr); // Call by reference
		test3(arr[0]); // Call by value
	}
	public void test2(int[] a) {
		// Call by reference	
	}
	
	public void test3(int a) {
		// Call by value
	}
}
