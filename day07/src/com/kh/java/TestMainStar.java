package com.kh.java;

public class TestMainStar {
	public static void main(String[] args) {

		System.out.println("Q1.");
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}

		System.out.println();

		System.out.println("Q2.");
		for (int j = 1; j <= 5; j++) {
			System.out.println("*");
		}

		System.out.println();

		System.out.println("Q3.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q4.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q5.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q6.");
		int a = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1 + a; j <= 5 + a; j++) {
				System.out.print(j);
			}
			a++;
			System.out.println();
		}

		System.out.println();

		System.out.println("Q7.");

		int num;
		for (int i = 0; i < 5; i++) {
			num = 5 - i;
			for (int j = 0; j < 5; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q8.");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q9.");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q10.");
		for (int i = 1; i <= 5; i++) {

			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 6 - i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println("Q11.");
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("Q12.");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if (j <= 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("");

		System.out.println("Q.13");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
