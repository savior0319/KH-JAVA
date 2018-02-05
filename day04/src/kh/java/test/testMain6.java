package kh.java.test;

import java.util.Scanner;

public class testMain6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		short ans;

		System.out.print("\n= = = = = = 심리 테스트 = = = = = = =\n\n\n");
//		while (true) {
			System.out.print("당신은 술을 좋아하십니까? (1. yes, 2.no) ");
			ans = sc.nextShort();

			if (ans == 1) {
				System.out.print("당신은 담배를 피웁니까? (1. yes, 2.no) ");
				ans = sc.nextShort();
				if (ans == 1) {
					System.out.println("담배는 건강에 좋지 않습니다!!!\n");
				} else {
					System.out.println("담배는 피우지 않아도 술 때문에 간이 위험해요\n");
				}
			} else {
				System.out.print("당신은 이성친구가 있습니까 (1. yes, 2.no) ");
				ans = sc.nextShort();
				if (ans == 1) {
					System.out.println("음\n");
				} else {
					System.out.println("....힘내세요....\n");
				}
			}
//		}
	}
}
