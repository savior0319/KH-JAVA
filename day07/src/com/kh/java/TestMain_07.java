package com.kh.java;

import java.util.Scanner;

public class TestMain_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int num = 1;
		while(true) {
			num++;
			System.out.println(num);
			if(num % 500000 == 0) {
				System.out.print("종료하시겠습니까? (y, n) : ");
				if(sc.next().charAt(0) == 'y') {
					break;
				}
			}
		}
		System.out.print("종료");
	}
}