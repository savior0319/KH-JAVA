package com.kh.java;

public class ArrayTest3 {
	public static void main(String[] args) {

		int[][] arr = new int[5][5];

		System.out.println("1번");
		int k = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = k--;
			}
			k += 10;
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("2번");
		k = 1;
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

		System.out.println("3번");
		k = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = k;
				k += 5;
			}
			k -= 26;
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("3번");
		k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = k++;
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("1번");
		k = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j < 0; j++) {
				arr[i][j] = k++;
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
