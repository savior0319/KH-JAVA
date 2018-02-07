package com.kh.java;

import java.util.Scanner;

public class TestMain13_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		System.out.print("짝수들만의 합은 : " + sum);
	}

}
