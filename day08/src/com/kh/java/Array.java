package com.kh.java;

public class Array {
	public static void main(String[] args) {

		int num = 100;
		int[] arr = { num, num * 2, num * 3, num * 4, num * 5 };

		for (int i : arr) {
			System.out.println(i);
		}

	}
}
