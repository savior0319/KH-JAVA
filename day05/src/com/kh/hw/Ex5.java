package com.kh.hw;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int result = 0;

		while (i < 5) {
			System.out.print("정수 값을 입력하시오 : ");
			int num = sc.nextInt();
			result += num;
			i++;
		}

		System.out.print("입력한  5개의 정수의 합 : " + result);
	}
}
