package com.kh.java;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키 (cm)입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 (kg)입력 : ");
		double weight = sc.nextDouble();

		double bmi = (weight / ((height * height) * 0.01));
		
		if(bmi < 18.5) {
			System.out.println("저체중 입니다.");
		} else if (18.5 <= bmi && bmi < 23) {
			System.out.println("정상체중 입니다.");
		} else if (23 <= bmi && bmi < 25) {
			System.out.println("과체중 입니다.");
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("비만 입니다.");
		} else {
			System.out.println("고도비만 입니다.");
		}
	}

}
