package com.kh.test;

import java.util.Scanner;

public class Testmain1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° �� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		int num2 = sc.nextInt();

		System.out.println();
		System.out.println("���Ѽ� : " + (num1 + num2));
		System.out.println("��   �� : " + (num1 - num2));
		System.out.println("���Ѽ� : " + (num1 * num2));
		System.out.println("������ : " + String.format("%.20f", (double)num1 / (double)num2));
		
		
	}
}
