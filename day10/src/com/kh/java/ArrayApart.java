package com.kh.java;

import java.util.Scanner;

public class ArrayApart {

	public ArrayApart() {
		Scanner sc = new Scanner(System.in);
		int floor = 0;
		System.out.println("---- A 아파트 정보 입력 ----");
		while (true) {
			System.out.print("건물 총 층수 입력 : ");
			floor = sc.nextInt();
			if (floor <= 0) {
				System.out.println("0층 보다 큰 값을 입력하세요");
				continue;
			} else {
				break;
			}
		}
		System.out.println(floor + " 층이 생성 되었습니다");
		String[][] apart = new String[floor][];
		for (int i = 0; i < floor; i++) {
			while (true) {
				System.out.print(i + 1 + "층의 총 호실 입력 : ");
				try {
					apart[i] = new String[sc.nextInt()];
					if (apart[i].length <= 0) {
						System.out.println("0보다 큰 값을 입력하세요");
						continue;
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("0호실 보다 큰 값을 입력하세요");
				}
			}
		}
		sc.nextLine();
		for (int i = 0; i < floor; i++) {
			System.out.println(i + 1 + "층은" + apart[i].length + "호실까지 생성되었습니다");
		}

		for (int i = 0; i < floor; i++) {
			System.out.println("======= " + (i + 1) + "층 정보 입력 =======");
			for (int j = 0; j < apart[i].length; j++) {
				System.out.print((i + 1) + "층 " + (j + 1) + "호 입주자 : ");
				apart[i][j] = sc.nextLine();
			}
		}

		System.out.println("\n======각 층 입주자 정보 출력======");
		for (int i = 0; i < floor; i++) {
			System.out.print((i + 1) + "층 : ");
			for (int j = 0; j < apart[i].length; j++) {
				System.out.print(apart[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new ArrayApart();
	}
}
