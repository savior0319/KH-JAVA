package com.kh.java;

import java.util.Scanner;

public class TestMain11_for {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("몇단을 출력 ? ");
		int input = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(input + " x " + i + " = " + input * i);
		}

	}
}
