package com.kh.java.exam;

import java.util.ArrayList;
import java.util.Collections;

public class Ex9 {
	public static void main(String[] args) {
		int[] array = { 82, 10, 12, 61, 39, 22, 44, 55, 11 };

		/*
		 * int min = 0, max = 0;
		 * 
		 * for (int i = 0; i < array.length; i++) { min = array[i]; max = array[i]; for
		 * (int j = 0; j < array.length; j++) { if (min > array[j]) { min = array[j]; }
		 * if (max < array[j]) { max = array[j]; } } } System.out.println("최소값 : " +
		 * min); System.out.println("최대값 : " + max);
		 */

		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			aList.add(array[i]);
		}

		System.out.println("최대 값 : " + Collections.max(aList));
		System.out.println("최소 값 : " + Collections.min(aList));
		Collections.sort(aList);
		System.out.print("오름차순 : ");
		for (int i : aList) {
			System.out.print(i + " ");
		}
		Collections.reverse(aList);
		System.out.print("\n내림차순 : ");
		for (int i : aList) {
			System.out.print(i + " ");
		}

	}
}
