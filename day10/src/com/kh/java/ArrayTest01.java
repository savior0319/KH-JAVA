package com.kh.java;

public class ArrayTest01 {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] { 1, 2, 3 };
		arr[1] = new int[] { 4, 5 };
		arr[2] = new int[] { 6, 7, 8, 9, 10 };
		
		System.out.printf("%5s",arr[2][2]);
		System.out.printf("%5s",arr[1][1]);

	}
}
