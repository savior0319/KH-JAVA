package com.kh.java;

import java.util.Scanner;

public class TestMain4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		if (num1 <= num2) {
			int i = num1;
			while (i <= num2) {
				sum += i;
				i++;
			}
		} else {
			int temp;
			temp = num1; num1 = num2; num2 = temp;
			int i = num1;
			while (i <= num2) {
				sum += i;
				i++;
			}
		}
		System.out.print(num1 + "부터 " + num2 + "까지의 합  : " + sum);
		
		try {
			while(true) {
				Thread.sleep(1);
			}
		} catch (Exception e) {
			System.out.println("Thread Error");
		}
	}
}
