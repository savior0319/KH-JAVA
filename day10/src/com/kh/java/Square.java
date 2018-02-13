package com.kh.java;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("<100������ �ڿ����� �Է��ϼ���> : ");
			int num = sc.nextInt();
			if (!(1 <= num && num <= 100)) {
				System.out.println();
				continue;
			} else
				printSquare(num);
			break;
		}
	}

	public static void printSquare(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.printf("%5d", i * j);
			}
			System.out.println();
		}
	}
}
