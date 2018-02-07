package com.kh.java;

import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int result = 0;

		System.out.print("<1부터 n까지의 합> n값 입력 : ");
		int n = sc.nextInt();

		while (sum <= n) {
			result += sum;
			sum++;
		}

		System.out.print("1부터 " + n + "까지의 합 : " + result);

	}
}
