package com.kh.java;

import java.util.Scanner;

public class Switch_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("===���� ���α׷�===\n");
		System.out.print("������ �Է� (+, -, *, /) : ");
		char op = sc.next().charAt(0);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();

		System.out.println("===== ��� =====\n");

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
			System.out.println("�� ���� �����ڸ� �Է��߽��ϴ�.");
			break;
		}

	}
}
