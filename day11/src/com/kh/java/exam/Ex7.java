package com.kh.java.exam;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArr = new int[5];
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			System.out.print((i + 1) + "��° �� �Է� : ");
			intArr[i] = sc.nextInt();
			if (intArr[i] % 2 == 1) {
				sum += intArr[i];
			}
		}
		System.out.println("\nȦ������ �հ� : " + sum);

	}
}
