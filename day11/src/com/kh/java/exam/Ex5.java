package com.kh.java.exam;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2 = 0;
		while (true) {
			System.out.print("ù��° ���� : ");
			num1 = sc.nextInt();
			System.out.print("�ι��� ���� : ");
			num2 = sc.nextInt();
			if (num1 > 9 || num1 < 1 || num2 > 9 || num2 < 1) {
				System.out.println("1���� ~ 9������ �Է��ϼ���");
				continue;
			} else
				break;
		}
		System.out.println("��� ��� : " + (num1 * num2));
		if (num1 * num2 > 9) {
			System.out.print("���ڸ� �� �Դϴ�");
		} else
			System.out.print("���ڸ� �� �Դϴ�");

	}
}
