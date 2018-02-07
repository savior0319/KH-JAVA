package com.kh.java;

import java.util.Scanner;

public class TestMain_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		int sum = 0;

		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		} else {
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;

			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}
		System.out.print(num1 + "부터 " + num2 + "까지의 합  : " + sum);

	}
}
