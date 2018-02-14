package com.kh.java.exam;

public class Ex8 {
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };
		int sum = 0, count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + (double) sum / count);
	}
}
