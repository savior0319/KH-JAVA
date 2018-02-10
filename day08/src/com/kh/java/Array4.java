package com.kh.java;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] ch = new char[5];

		for (int count = 0; count < ch.length; count++) {
			System.out.print(count + 1 + "번째 입력 : ");
			ch[count] = sc.next().charAt(0);
		}

		System.out.println("\n출력");
		for (char out : ch) {
			System.out.print(out);
		}
	}
}
