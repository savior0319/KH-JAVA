package com.kh.java;

import java.util.Scanner;

public class Cal {

	Scanner sc = new Scanner(System.in);
	private char op;
	private double fNum, sNum, result;

	public Cal() {
		System.out.println("���� ���α׷� ver 1.0");
		System.out.print("�����ڸ� �Է��ϼ���(+, -, *, /) : ");
		op = sc.next().charAt(0);
		System.out.print("ù ��° �� �Է� : ");
		fNum = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		sNum = sc.nextInt();

		switch (op) {
		case '+':
			result = fNum + sNum;
			System.out.println((int) fNum + "+" + (int) sNum + "=" + (int) result);
			break;
		case '-':
			result = fNum - sNum;
			System.out.println((int) fNum + "-" + (int) sNum + "=" + (int) result);
			break;
		case '*':
			result = fNum * sNum;
			System.out.println((int) fNum + "x" + (int) sNum + "=" + (int) result);
			break;
		case '/':
			result = fNum / sNum;
			System.out.println((int) fNum + "/" + (int) sNum + "=" + String.format("%.2f", result));
			break;
		}

	}

	public static void main(String[] args) {
		new Cal();
	}
}
