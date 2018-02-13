package com.kh.java;

public class Calculator {

	public void start() {
		int a = 10;
		int b = 3;
		System.out.println(addFunction(a, b));
		System.out.println(subFunction(a, b));
		System.out.println(mulFunction(a, b));
		System.out.println(divFunction(a, b));
	}

	public int addFunction(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public int subFunction(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public int mulFunction(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public double divFunction(int num1, int num2) {
		double result = num1 / (double) num2;
		return result;
	}

}
