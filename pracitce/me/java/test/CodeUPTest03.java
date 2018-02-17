package me.java.test;

import java.util.Scanner;

public class CodeUPTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inStr = sc.nextLine();
		char[] inChar = new char[inStr.length()];

		for (int i = 0; i < inChar.length; i++) {
			inChar[i] = inStr.charAt(i);
			System.out.println("\'" + inChar[i] + "\'");
		}
	}
}
