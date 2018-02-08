package com.kh.java;

import java.util.Scanner;

public class TestMain_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sel = 0;
		int sum = 0;
		boolean start = true;
		
		while(start) {
			System.out.print("더할 수를 입력하세요 (종료 == 0) : ");
			sel = sc.nextInt();
			
			if(sel==0) 
				start = false;
				sum += sel;
		}
		System.out.print("입력하신 값들의 전체 합 : " + sum);
	}
}
