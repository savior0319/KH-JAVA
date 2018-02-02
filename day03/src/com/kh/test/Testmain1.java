package com.kh.test;

import java.util.Scanner;

public class Testmain1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = sc.nextInt();

		System.out.println();
		System.out.println("더한수 : " + (num1 + num2));
		System.out.println("뺀   수 : " + (num1 - num2));
		System.out.println("곱한수 : " + (num1 * num2));
		System.out.println("나눈수 : " + String.format("%.20f", (double)num1 / (double)num2));
		
		
	}
}
