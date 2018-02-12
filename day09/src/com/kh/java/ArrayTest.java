package com.kh.java;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		/*for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}*/
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
					/*복사를 할 대상 레퍼런스
						0번째 부터,
						복사 할 배열, 
						0번째 부터, 
						배열길이*/
		
		arr2[2] = 999;
		
		for (int i:arr1) {
			System.out.println(i);
		}
		System.out.println();
		for (int i:arr2) {
			System.out.println(i);
		}

	}
}
