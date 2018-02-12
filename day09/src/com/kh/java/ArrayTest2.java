package com.kh.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] arr = new int[5][7];
		int k = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] <= 28) {
					System.out.printf("%5d", arr[i][j]);
				}
			}
			System.out.println();
		}
	}
}
