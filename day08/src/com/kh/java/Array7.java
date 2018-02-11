package com.kh.java;

import java.util.Scanner;

public class Array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] weight = new double[6];
		double sum = 0;

		for (int i = 0; i < weight.length; i++) {
			System.out.print(i + 1 + "번째 몸무게 입력 : ");
			weight[i] = sc.nextDouble();
			sum += weight[i];
		}

		System.out.println("\n출력\n"+weight.length + "명 몸무게의 평균 : " 
		+ String.format("%.1f", sum / weight.length));

	}
}

