package me.java.test;

import java.util.Scanner;

public class CodeUpTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char in;
		while (true) {
			in = sc.next().charAt(0);
			System.out.println(in);
			if (in == 'q') {
				break;
			}
		}
	}
}
