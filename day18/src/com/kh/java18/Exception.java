package com.kh.java18;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� -> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� -> ");
		int num2 = sc.nextInt();

		try {
			System.out.println("���  -> " + (num1 / num2));
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		}
	}
}
