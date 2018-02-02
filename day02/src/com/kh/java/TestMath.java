package com.kh.java;

import java.util.Scanner;

public class TestMath {

	public void math() {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int iNum1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int iNum2 = sc.nextInt();
		System.out.println();
		System.out.println("더한결과 : " + iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.println("뺀   결과 : " + iNum1 + " - " + iNum2 + " = " + (iNum1 - iNum2));
		System.out.println("곱한결과 : " + iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
		System.out.println("나눈결과 : " + iNum1 + " / " + iNum2 + " = " + (iNum1 / iNum2));
	}
}
