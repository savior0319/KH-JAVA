package me.java.test;

import java.util.Scanner;

public class CodeUpTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] arr = new int[input][input];
		int k = 1;
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < input; j++) {
				System.out.printf("%6d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
