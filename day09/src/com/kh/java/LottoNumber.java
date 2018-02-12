/*로또 번호 추첨*/
package com.kh.java;

import java.util.Random;
import java.util.Scanner;

public class LottoNumber {

	public LottoNumber() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] lotto = new int[6];
		int count = 1;

		int menu;
		boolean isFlag = true;

		System.out.println("-----로또 번호 뽑기-----");
		while (isFlag) {
			System.out.println("\n1. 뽑기\t2. 종료");
			System.out.print("선택 > ");
			menu = sc.nextInt();

			if (menu == 1) {

				try {
					System.out.print("번호를 뽑는 중 입니다");
					for (int i = 0; i < 4; i++) {
						System.out.print(".");
						Thread.sleep(250);
					}
					System.out.println("\n");
				} catch (Exception e) {
					System.err.println("ERROR");
				}

				for (int i = 0; i < lotto.length; i++) {
					lotto[i] = rd.nextInt(45) + 1;
					for (int j = 0; j < i; j++) {
						if (lotto[i] == lotto[j]) { // 중복되는 경우
							i = -1; // 다시 뽑기
							break;
						}
					}
				}
				System.out.println("★★★★★★★★★★★★★★★★★★\n");
				for (int i : lotto) {
					System.out.println(count + " 번째 번호 : " + i);
					count++;
				}
				System.out.println();
				count = 1;
				System.out.println("★★★★★★★★★★★★★★★★★★");

			} else if (menu == 2) {
				System.out.println("---종료합니다---");
				isFlag = false;
			} else {
				System.out.println("메뉴를 잘못선택했습니다");
			}
		}
	}

	public static void main(String[] args) {
		new LottoNumber();

	}
}
