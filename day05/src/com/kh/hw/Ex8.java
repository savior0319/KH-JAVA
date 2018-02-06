package com.kh.hw;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();

		int i = num1;
		while (i < num2 + 1) {
			result += i;
			i++;
		}
		System.out.print(num1 + " ~ " + num2 + " 까지의 합 : " + result);

	}
}
