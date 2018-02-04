package com.kh.java;

import java.util.Scanner;

public class Cal {

	Scanner sc = new Scanner(System.in);
	private char op;
	private double fNum, sNum, result;

	public Cal() {
		System.out.println("계산기 프로그램 ver 1.0");
		System.out.print("연산자를 입력하세요(+, -, *, /) : ");
		op = sc.next().charAt(0);
		System.out.print("첫 번째 수 입력 : ");
		fNum = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
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
