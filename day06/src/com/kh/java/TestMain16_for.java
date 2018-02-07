package com.kh.java;

import java.util.Scanner;

public class TestMain16_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int count = 0;
		int sum = 0;
		double avg;

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (; num1 <= num2; num1++) {
			if (num1 % 3 == 0 || num1 % 5 == 0) {
				sum += num1;
				count++;
			}

		}
		avg = ((double) sum / (count));
		System.out.print("합 : " + sum + "\n평균 : " + String.format("%.1f", avg));
	}
}
