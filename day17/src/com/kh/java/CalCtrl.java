package com.kh.java;

import java.util.Scanner;

public class CalCtrl implements Calculator1 {

	private Scanner sc = new Scanner(System.in);

	public CalCtrl() {}

	@Override
	public int add(String su1, String su2) {
		int result = Integer.parseInt(su1) + Integer.parseInt(su2);
		return result;
	}
	
	@Override
	public int subtract(String su1, String su2) {
		int result = Integer.parseInt(su1) - Integer.parseInt(su2);
		return result;
	}

	@Override
	public int multiply(String su1, String su2) {
		int result = Integer.parseInt(su1) * Integer.parseInt(su2);
		return result;
	}

	@Override
	public double divide(String su1, String su2) {
		double result = (double) Integer.parseInt(su1) / Integer.parseInt(su2);
		return result;
	}

	@Override
	public void start() {
		while (true) {
			System.out.print("연산자 입력<+, -, *, /, q(종료)>  -> ");
			char ch = sc.next().charAt(0);
			if(!(ch == 'q' || ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
				System.out.println("\n※연산자를 잘못 입력했습니다!\n");
				continue;
			}
			if(ch == 'q') {System.out.println("\n※종료합니다"); return;}
			System.out.print("첫번째 숫자 입력 -> ");
			String su1 = sc.next();
			System.out.print("두번째 숫자 입력 -> ");
			String su2 = sc.next();
			System.out.println();
			switch (ch) {
			case '+': System.out.println(su1 + " + " + su2 + " = " + add(su1, su2) + "\n"); break;
			case '-': System.out.println(su1 + " - " + su2 + " = " + subtract(su1, su2) + "\n"); break;
			case '*': System.out.println(su1 + " x " + su2 + " = " + multiply(su1, su2) + "\n"); break;
			case '/': System.out.println(su1 + " / " + su2 + " = " + String.format("%.2f", divide(su1, su2)) + "\n"); break;
			}
		}
	}
}
