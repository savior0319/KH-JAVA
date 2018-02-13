package com.kh.java;

import java.util.Scanner;

public class CharChange {
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("==== 변 환  ====");
		System.out.print(ch + " -->  ");
		ch = charChange(ch);
		System.out.println(ch + "\n");
	}
	
	public char charChange(char ch) {
		return (char) (ch ^ 32);
	}
}
