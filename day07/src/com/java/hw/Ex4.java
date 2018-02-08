package com.java.hw;

public class Ex4 {
	public static void main(String[] args) {

		int sum = 0;
		for (int j = 10; j >= 0; j--) {
			for (int i = 1; i <= j; i++) {
				sum = sum + i;
			}
		}
		System.out.print("합산 결과 : " + sum);

	}
}
