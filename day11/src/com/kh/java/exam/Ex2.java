package com.kh.java.exam;

public class Ex2 {

	public static void main(String[] args) {

		System.out.println("구구단 출력\n");
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i * j % 2 == 1) {
					System.out.println(i + "x" + j + "=" + i * j);
				}
			}
			System.out.println();
		}
	}
}
