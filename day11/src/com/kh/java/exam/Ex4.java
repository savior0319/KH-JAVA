package com.kh.java.exam;

public class Ex4 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[1]);

		if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1) {
			System.out.print("1���� 9������ �Է��ϼ���");
		} else {
			System.out.println("�� : " + (num1 + num2));
			System.out.println("�� : " + (num1 - num2));
			System.out.println("�� : " + (num1 * num2));
			System.out.println("������ : " + String.format("%.1f", (double) (num1 / (double) num2)));

		}
	}

}
