package com.kh.java;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("신장 (cm)을 입력하세요 => ");
		double height = sc.nextDouble();
		System.out.print("체중 (kg)을 입력하세요 => ");
		double weight = sc.nextDouble();

		double avgWeight = (height - 100) * 0.9;

		if (avgWeight + 1 < weight) {
			System.out.println("표준체중은 " + String.format("%.1f", avgWeight) + "kg입니다.");
			System.out.println("고로 당신은 과체중 입니다");
		} else if (avgWeight - 1 > weight) {
			System.out.println("표준체중은 " + String.format("%.1f", avgWeight) + "kg입니다.");
			System.out.println("고로 당신은 저체중 입니다");
		} else {
			System.out.println("표준체중은 " + String.format("%.1f", avgWeight) + "kg입니다.");
			System.out.println("고로 당신은 표준체중 입니다");
		}
	}
}
