/*02-12 BubbleSort*/
package com.kh.java;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.print("정렬할 배열의 개수 입력 : ");
		int size = sc.nextInt();
		System.out.println();
		int[] inArr = new int[size];
		
		for (int i = 0; i < inArr.length; i++) {
			System.out.print("정렬 할 " + (i + 1) + "번째 숫자 : ");
			inArr[i] = sc.nextInt();
		}
		for (int i = 1; i < inArr.length; i++) {
			for (int j = 0; j < inArr.length; j++) {
				if (inArr[i] < inArr[j]) {
					int temp = inArr[i];
					inArr[i] = inArr[j];
					inArr[j] = temp;
				}
			}
		}
		System.out.println("\n정렬 결과 <오름차순>");
		for (int i : inArr) {
			System.out.print(i + " ");
		}

		System.out.println("\n\n정렬 결과 <내림차순>");
		for (int i = inArr.length - 1; i >= 0; i--) {
			System.out.print(inArr[i] + " ");
		}

	}
}
