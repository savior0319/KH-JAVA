package com.kh.java;

public class OverLoadingMain {
	public static void main(String[] args) {
		OverLoadingClass tc = new OverLoadingClass();
		System.out.println("����Ʈ ������ : " + tc.getTestClass());
		OverLoadingClass tc1 = new OverLoadingClass(20);
		System.out.println(tc1.getTestClass());

	}
}
