package com.kh.java;

public class Practice_03 {
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 0;
		int i = 0;
		
		for(i = 1; i < 10; i++) {
			for(j = 0; j < i; j++) {
				sum = sum + i;
				System.out.print(sum + " ");
			}
			
		}


	}
}
