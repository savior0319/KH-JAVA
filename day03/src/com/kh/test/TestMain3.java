package com.kh.test;

import java.util.Scanner;

public class TestMain3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 입력 : ");
		char ch = sc.next().charAt(0);

		System.out.println();
		System.out.println("---대문자1---");
		String str = String.valueOf(ch).toUpperCase();
		System.out.println(str);
		System.out.println("---대문자2---");

		System.out.println((char) (ch ^ 32));
	}
}
