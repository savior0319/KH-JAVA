package com.kh.java;

import java.util.Scanner;

public class NumCheck {

	Scanner sc = new Scanner(System.in);
	private int inputNum;

	public NumCheck() {

		System.out.println("====== ���� ���� ���α׷� v1.0 ======\n");

		System.out.print("������ ���� �Է��ϼ��� : ");
		inputNum = sc.nextInt();

		if (inputNum > 0) {
			System.out.println("����� �Է��� �� " + inputNum + " ��(��) ����Դϴ�.");
		} else if (inputNum == 0) {
			System.out.println("����� �Է��� �� " + inputNum + " ��(��) 0�Դϴ�.");
		} else {
			System.out.println("����� �Է��� �� " + inputNum + " ��(��) �����Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new NumCheck();
	}
}
