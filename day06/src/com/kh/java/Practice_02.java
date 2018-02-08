package com.kh.java;

import java.util.Scanner;

public class Practice_02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in;

		do {
			System.out.print("number? ");
			in = sc.nextInt();
			if (in > 0) {
				System.out.println("positive integer");
			} else if (in < 0)
				System.out.println("negative number");
		} while (in != 0);
		System.out.print("end");
	}
}
