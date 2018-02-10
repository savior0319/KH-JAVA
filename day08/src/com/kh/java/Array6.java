package com.kh.java;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 입력 : ");
			num[i] = sc.nextInt();
		}

		System.out.println("\n출력");
		System.out.println(num[0] + num[2] + num[4]);

	}
}
