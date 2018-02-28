package com.kh.java19;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionTest t = new ExceptionTest();
		try {
			t.sum(0, 100);
		} catch (NoZeroException e) {
			System.out.println("¤·¤·¤· " + e.getMessage());
		}
	}

}
