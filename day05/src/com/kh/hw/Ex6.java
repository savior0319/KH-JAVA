package com.kh.hw;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		int sum = 0;

		while (i < 101) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}
}
