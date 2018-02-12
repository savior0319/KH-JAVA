package com.kh.java;

public class ArrayTest4 {
	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		int k = 1;

		System.out.println("1번");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		k = 1;

		System.out.println("2번");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= 0; j--) {
				arr[j][i] = k++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		k = 1;

		System.out.println("3번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[j][i] = k++;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		k = 1;

		System.out.println("4번");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) {
					arr[i][j] = j + 1 + i * k * 5;
				} else
					arr[i][j] = (i + 1) * 5 * k - j;
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
	

	}
}
