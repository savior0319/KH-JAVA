package com.kh.java.exam;

public class Ex9 {
	public static void main(String[] args) {
		int[] array = { 82, 10, 12, 61, 39, 22, 44, 55, 11 };

		int min = 0, max = 0;

		for (int i = 0; i < array.length; i++) {
			min = array[i];
			for (int j = 0; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
				}
			}
		}
		System.out.println("최소값 : " + min);
		for (int i = 0; i < array.length; i++) {
			max = array[i];
			for (int j = 0; j < array.length; j++) {
				if (max < array[j]) {
					max = array[j];
				}
			}
		}
		System.out.println("최대값 : " + max);
	}
}
