package kh.java.test;

import java.util.Scanner;

public class testMain7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();

		if (num1 == 1) {
			System.out.println("one");
		} else if (num1 == 2) {
			System.out.println("two");
		} else if (num1 == 3) {
			System.out.println("three");
		} else {
			System.out.println("error");
		}

	}
}
