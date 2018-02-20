package com.kh.java;

public class OverLoadingMain02 {
	public static void main(String[] args) {
		OverLoadingClass02 olc1 = new OverLoadingClass02("홍길동", 20, "경기도 부천", "운동");
		OverLoadingClass02 olc2 = new OverLoadingClass02("김말똥", 30, "경기도 인천");
		OverLoadingClass02 olc3 = new OverLoadingClass02("고길동");
		olc1.printData();
		olc2.printData();
		olc3.printData();
	}
}
