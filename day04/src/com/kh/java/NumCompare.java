package com.kh.java;

import java.util.Scanner;

public class NumCompare {

	Scanner sc = new Scanner(System.in);
	private int stNum, ndNum;

	public NumCompare() {
		System.out.println("= = = �� ���� �� �ϴ� ���α׷� v1.0 = = =\n");

		System.out.print("ù��° ���� �Է��ϼ��� : ");
		stNum = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		ndNum = sc.nextInt();

		if (stNum > ndNum) {
			System.out.println(stNum + " > " + ndNum + "\nù ��° ���� �� Ů�ϴ�.");
		} else if (stNum == ndNum) {
			System.out.println(stNum + " = " + ndNum + "\n�� ���� ���� �� �Դϴ�.");
		} else {
			System.out.println(stNum + " < " + ndNum + "\n�� ��° ���� �� Ů�ϴ�.");
		}

	}

	public static void main(String[] args) {
		new NumCompare();
	}
}
