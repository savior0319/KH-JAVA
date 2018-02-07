package com.kh.java;

import java.util.Scanner;

public class TestMain6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int su = sc.nextInt();

		do {
			System.out.println(su % 10);
			su /= 10;
		} while (su > 0);
	}
}
