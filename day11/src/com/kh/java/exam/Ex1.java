package com.kh.java.exam;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inNum = 0;
		while (true) {
			System.out.print("�Է� : ");
			inNum = sc.nextInt();
			if (!(1 <= inNum && inNum <= 100)) {
				System.out.println("1���� 100���� ���� �Է��ϼ���!");
				continue;
			} else {
				break;
			}
		}
		if (inNum % 2 == 0) {
			System.out.println("2�� ����Դϴ�");
		} else if (inNum % 2 == 1) {
			System.out.print("2�� ����� �ƴմϴ�");

		}
	}
}
