package com.kh.ex;

import java.util.Scanner;

public class TestMain4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("===계산기 프로그램====\n\n");
		System.out.print("연산자 입력 (+, -, *, /) : ");
		char op = sc.next().charAt(0);
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			System.out.print("첫 번째 숫자 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 입력 : ");
			int num2 = sc.nextInt();
			System.out.println("\n=====결과=====\n");

			switch (op) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case '*':
				System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
				break;
			case '/':
				System.out
						.println(num1 + " / " + num2 + " = " + String.format("%.2f", (double) ((double) num1 / num2)));
				break;
			}
		} else {
			System.out.println("연산자를 잘못 입력했습니다");
		}

	}
}
