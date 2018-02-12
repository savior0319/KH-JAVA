package com.kh.java;

public class ArrayTest4 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int k = 1;
		System.out.println();
		System.out.println("1번.");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5s", arr[i][j]);
			}
			System.out.println();
		}		
		System.out.println();
		System.out.println("2번.");
		k = 1;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5s", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3번.");
		k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = k++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5s", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("4번.");
		k = 1;
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) {
					arr[i][j] = k++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					arr[i][j] = k++;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5s", arr[i][j]);
			}
			System.out.println();
		}
	}
}
