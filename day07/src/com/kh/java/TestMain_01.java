package com.kh.java;

public class TestMain_01 {

	public TestMain_01() {

		// IntStream.range(0, 10).forEach((int value) -> System.out.println(value));

		int a = 1;
		int b = 1;
		int c = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("c = " + c + " ");
				c++;
				for (int l = 0; l < 3; l++) {
					System.out.print("a = " + a + " ");
					a++;
				}
			}
			System.out.println();
			for (int k = 0; k < 7; k++) {
				System.out.print("b = " + b + " ");
				b++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TestMain_01();
	}
}
