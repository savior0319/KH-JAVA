package com.kh.java;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double result = 0;

		System.out.println("==계산기 프로그램==");
		while (true) {
			System.out.print("연산자 입력 (+, -, *, /, (q:종료)) : ");
			char op = sc.next().charAt(0);

			if (op == 'q' || op == 'Q') {
				System.out.print("종료합니다");
				System.exit(0);
			}

			if (op != '+' && op != '-' && op != '*' && op != '/') {
				System.out.println(op + "를 입력했습니다. 연산자를 다시 입력하세요 ");
				continue;
			}

			System.out.print("첫번째 숫자입력 : ");
			double num1 = sc.nextDouble();
			System.out.print("두번째 숫자입력 : ");
			double num2 = sc.nextDouble();

			switch (op) {
			case '+':
				result = (int) (num1 + num2);
				break;
			case '-':
				result = (int) (num1 - num2);
				break;
			case '*':
				result = (int) (num1 * num2);
				break;
			case '/':
				result = num1 / num2;
				break;
			}

			try {
				System.out.print("계산하는 중입니다.");
				for (int i = 1; i < 5; i++) {
					Thread.sleep(250);
					System.out.print(".");
				}
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.print("Thread Error");
			}

			System.out.println("\n====결과====\n");
			if (op == '/') {
				System.out.print((int) num1 + " " + op + " " + (int) num2 + " = " + String.format("%.2f", result) + "\n\n");
			} else {
				System.out.print((int) num1 + " " + op + " " + (int) num2 + " = " + (int) result + "\n\n");
			}
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				System.err.print("Thread Error");
			}
			clean();
		}
	}

	public static void clean() {
		for (int i = 0; i <= 50; i++) {
			System.out.println();
		}
	}
}
