package com.kh.java;

import java.util.Scanner;

public class TestMain_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n의 수를 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n + 1; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}
}
