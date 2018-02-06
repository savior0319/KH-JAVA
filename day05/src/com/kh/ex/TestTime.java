package com.kh.ex;

public class TestTime {
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		for (long i = 1; i < 10000000000L; i++) {
			int a = 0;
			a += 1;
		}

		long endTime = System.currentTimeMillis();

		long lTime = endTime - startTime;
		System.out.println("TIME : " + lTime + "(ms)");

	}
}
