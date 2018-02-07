package com.kh.java;

import java.util.Scanner;

public class TestMain3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n 의 수를 입력 : ");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;

		while (i <= n) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}
}
