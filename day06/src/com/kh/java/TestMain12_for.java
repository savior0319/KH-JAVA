package com.kh.java;

import java.util.Scanner;

public class TestMain12_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 1; i < 6; i++) {
			System.out.print("정수 값을 입력하시오 : ");
			int input = sc.nextInt();
			sum += input;
		}

		System.out.print("입력한  5개의 정수의 합 : " + sum);

	}
}
