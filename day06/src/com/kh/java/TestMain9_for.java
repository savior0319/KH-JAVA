package com.kh.java;

import java.util.Scanner;

public class TestMain9_for {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번? : ");

		int num = sc.nextInt();
		System.out.println();
		for(int i = 0; i < num; i++) {
			System.out.println("안녕");
		}
	}
}
