package com.kh.java;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] ch = new char[5];

		for (int count = 0; count < ch.length; count++) {
			System.out.print(count + 1 + "번째 입력 : ");
			ch[count] = sc.next().charAt(0);
		}

		System.out.println("\n출력");
		System.out.println("1번째 문자 : " + ch[0]);
		System.out.println("4번째 문자 : " + ch[3]);

	}
}
