package com.kh.java;

import java.util.Scanner;

public class Switch_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===계산기 프로그램===\n");
		System.out.print("연산자 입력 (+, -, *, /) : ");
		char op = sc.next().charAt(0);
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("===== 결과 =====\n");

		switch (op) {
		case '+':
			System.out.println(num1 + " + " + num1 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num1 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " x " + num1 + " = " + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + " / " + num1 + " = " + String.format("%.2f", (double) ((double) num1 / num2)));
			break;

		default:
			System.out.println("잘 못된 연산자를 입력했습니다.");
			break;
		}

	}
}
