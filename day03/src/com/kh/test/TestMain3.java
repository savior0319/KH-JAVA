package com.kh.test;

import java.util.Scanner;

public class TestMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ҹ��� �Է� : ");
		char ch = sc.next().charAt(0);

		System.out.println();
		System.out.println("---�빮��1---");
		String str = String.valueOf(ch).toUpperCase();
		System.out.println(str);
		System.out.println("---�빮��2---");

		System.out.println((char) (ch ^ 32));
	}
}
