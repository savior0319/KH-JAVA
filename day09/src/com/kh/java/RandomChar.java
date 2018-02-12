package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class RandomChar {
	public static void main(String[] args) {
		
		Random rd = new Random();

		Scanner sc = new Scanner(System.in);
		int horizontal, vertical;
		System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
		horizontal = sc.nextInt();
		System.out.print("세로행의 개수를 입력하세요(1~10) ==> ");
		vertical = sc.nextInt();
		
		char[][] ch = new char[horizontal+1][vertical+1];
		
		
		for(int i = 0; i < horizontal; i++) {
			for(int j = 0; j < vertical; j++) {
				ch[j][i] = (char) ('a'+ rd.nextInt(25));
			}
		}
		for(int i = 0; i < horizontal; i++) {
		for(int j = 0; j < vertical; j++) {
			System.out.print(ch[j][i] + " ");
		
			}
		System.out.println();
		}
		
	
		
		
	}
}
