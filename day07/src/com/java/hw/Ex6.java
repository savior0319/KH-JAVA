package com.java.hw;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num >= 3) {
				for (int k = 1; k <= i; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
