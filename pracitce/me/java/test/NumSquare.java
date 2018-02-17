package me.java.test;

import java.util.Scanner;

public class NumSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int k = 1;
		int[][] arr = new int[input][input];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}

	}
}
