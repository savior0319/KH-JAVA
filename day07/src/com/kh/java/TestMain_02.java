package com.kh.java;

public class TestMain_02 {
	public static void main(String[] args) {

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j >= 10)
					System.out.print(i + "x" + j + "=" + i * j + " ");
				else
					System.out.print(i + "x" + j + "= " + i * j + " ");
			}
			System.out.println();

		}
	}
}
