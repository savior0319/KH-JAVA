package com.kh.java;

public class TestMain_05 {
	public static void main(String[] args) {
		
		int a = 1;
		while(true) {
			System.out.println(a);
			a++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread Error");
			}
		}
	}
}
