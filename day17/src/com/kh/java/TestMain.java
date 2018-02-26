package com.kh.java;

public class TestMain {

	public static void main(String[] args) {
		int a = 10;
		double b = 0;
		
		System.out.println(Double.isFinite(a / b));
		
		
		int i = 5000;
		String str = String.valueOf(i);
		System.out.println(str);
		
		String j = "5000";
		int it = Integer.parseInt(j);
		System.out.println(it);
	}
}
