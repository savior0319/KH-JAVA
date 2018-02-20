package com.kh.java;


public class OverLoadingMain01 {
	public static void main(String[] args) {
		OverLoadingClass01 olc = new OverLoadingClass01();
		olc.overLoadMethod();
		olc.overLoadMethod(10);
		olc.overLoadMethod(10, 20);
	}
}
