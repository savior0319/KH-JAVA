package com.kh.java.exam;

public class Ex3 {
	public static void main(String[] args) {
		int startNum = 1;
		double result = 0;
		while (startNum <= 100) {
			result += startNum;
			startNum++;
		}
		System.out.println("ÇÕ°è : " + String.format("%.0f", result));
		System.out.println("Æò±Õ : " + result / 100);
	}
}
