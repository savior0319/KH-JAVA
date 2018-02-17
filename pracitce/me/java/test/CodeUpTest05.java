package me.java.test;

import java.util.Scanner;

public class CodeUpTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 3;
		int sum = 0;
		for (int i = 1; i <= MAX; i++) {
			int in = sc.nextInt();
			sum += in;
		}
		System.out.println(sum);
		System.out.println(String.format("%.1f", sum / (double) 3));
	}
}
