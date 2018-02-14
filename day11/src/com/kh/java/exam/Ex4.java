package com.kh.java.exam;

public class Ex4 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);

		if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1) {
			System.out.print("1부터 9까지만 입력하세요");
		} else {
			System.out.println("합 : " + (num1 + num2));
			System.out.println("차 : " + (num1 - num2));
			System.out.println("곱 : " + (num1 * num2));
			System.out.println("나누기 : " + String.format("%.1f", (double) (num1 / (double) num2)));

		}
	}

}
