package com.kh.java;

public class Practice_04 {
	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		int count = 1;

		for (; sum < 100; i++) {
			if (i % 2 == 0) {
				i = -i;
			} 
			sum += i;
			i++;
			count++;
		
		}
		System.out.print(count);
	}
	

}
