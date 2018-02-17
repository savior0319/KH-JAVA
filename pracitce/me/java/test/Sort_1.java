package me.java.test;

import java.util.Scanner;

public class Sort_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] inArr = new int[3];

		for (int i = 0; i < inArr.length; i++) {
			inArr[i] = sc.nextInt();
			for (int j = 0; j < inArr.length; j++) {
				if (inArr[i] < inArr[j]) {
					int temp = inArr[i];
					inArr[i] = inArr[j];
					inArr[j] = temp;
				}
			}

		}
		for (int i : inArr) {
			System.out.print(i + " ");
		}
	}
}
