package com.kh.var.example;

import java.util.Scanner;

public class Example {

	Scanner sc = new Scanner(System.in);

	public void example1() {

		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.println();
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 : " + (num1 / num2));
		System.out.println("나누기한 나머지 : " + (num1 % num2));
	}

	public void example2() {
		System.out.println();
		System.out.print("가로 : ");
		double width = sc.nextInt();
		System.out.print("세로 : ");
		double height = sc.nextInt();

		double area = width * height;
		double round = (width * 2) + (height * 2);

		System.out.println("면적 : " + area);
		System.out.println("둘레 : " + round);

	}

	public void example3() {
		System.out.println();
		sc.nextLine();
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();

		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
