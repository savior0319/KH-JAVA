package com.kh.java;

import java.util.Scanner;

public class TestMain1_while {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count = 0;
		int sum = 0;

		while (count < 5) {
			System.out.print("정수 값을 입력하시오 : ");
			int input = scan.nextInt();
			sum += input;
			count++;
		}
		System.out.println();
		System.out.print("5개 정수의 합 :" + sum);
	}
}
