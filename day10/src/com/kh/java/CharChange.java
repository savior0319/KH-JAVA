package com.kh.java;

import java.util.Scanner;

public class CharChange {
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է� : ");
		char ch = sc.next().charAt(0);
		System.out.println("==== �� ȯ  ====");
		System.out.print(ch + " -->  ");
		ch = charChange(ch);
		System.out.println(ch + "\n");
	}
	
	public char charChange(char ch) {
		return (char) (ch ^ 32);
	}
}
