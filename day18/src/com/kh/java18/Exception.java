package com.kh.java18;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 -> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 -> ");
		int num2 = sc.nextInt();

		try {
			System.out.println("결과  -> " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}
}
