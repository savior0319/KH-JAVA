package me.java.test;

import java.util.Scanner;

public class TwoByArr {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();

		int[][] arr = new int[row][column];
		int k = 1;
		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < column; j++) {
					arr[i][j] = k++;
				}
			} else if (i % 2 == 1) {
				for (int a = column - 1; a >= 0; a--) {
					arr[i][a] = k++;
				}

			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
