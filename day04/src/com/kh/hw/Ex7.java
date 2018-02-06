package com.kh.hw;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===심리테스트===\n");
		System.out.println("당신을 먹을 것을 좋아합니까?");
		System.out.print("===<보기>===\n");
		System.out.println("1. 좋아요");
		System.out.println("2. 싫어요");
		System.out.print("선택 : ");
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.print("\n많이 좋아합니까?\n");
			System.out.print("===<보기>===\n");
			System.out.println("1. 네");
			System.out.println("2. 아니오");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("당신은 돼지입니다");
			} else {
				System.out.println("좀 더 힘내세요ㅎㅎ");
			}

		} else if (choice == 2) {
			System.out.println("\n많이 싫어합니까?\n");
			System.out.print("===<보기>===\n");
			System.out.println("1. 네");
			System.out.println("2. 아니오");
			System.out.print("선택 : ");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("당신은 멸치입니다");
			} else {
				System.out.println("다행히 멸치는 아니네요ㅎㅎ");
			}
		}

	}
}
