package com.kh.java;

public class StringCal {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]), num2 = Integer.parseInt(args[2]);
		char op = args[1].charAt(0);

		switch (op) {
		case '+':
			System.out.println("Result = " + (num1 + num2));
			break;
		case '-':
			System.out.println("Result = " + (num1 - num2));
			break;
		case 'x':
			System.out.println("Result = " + (num1 * num2));
			break;
		case '/':
			System.out.println("Result = " + String.format("%.2f", (double) ((double) num1 / num2)));
			break;
		}
	}
}
