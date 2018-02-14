package com.kh.java.exam;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2 = 0;
		while (true) {
			System.out.print("첫번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두번쨰 숫자 : ");
			num2 = sc.nextInt();
			if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1) {
				System.out.println("1부터 ~ 9까지만 입력하세요");
				continue;
			} else
				break;
		}
		System.out.println("계산 결과 : " + (num1 * num2));
		if (num1 * num2 > 9) {
			System.out.print("두자리 수 입니다");
		} else
			System.out.print("한자리 수 입니다");

	}
}
