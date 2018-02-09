package com.kh.java;

public class Array {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int num = 100;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = num;
			System.out.println("arr["+ i +"] = " +arr[i]);
			num+=100;
		}

	}
}
