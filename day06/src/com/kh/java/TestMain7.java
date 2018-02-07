package com.kh.java;

import java.util.Scanner;

public class TestMain7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char add;
		int sumPay = 0;
		do {
			System.out.println("\n김밥류===============");
			System.out.println("1. 원조김밥=====1000원");
			System.out.println("2. 치즈김밥=====1000원");
			System.out.println("3. 참치김밥=====1000원");
			System.out.println("라면=================");
			System.out.println("4. 그냥라면=====1200원");
			System.out.println("5. 치즈라면=====1500원");
			System.out.println("6. 짬뽕라면=====2000원");
			System.out.println("기타=================");
			System.out.println("7. 튀김========1200원");
			System.out.println("8. 순대========2500원");
			System.out.println("9. 오뎅========1000원");
			System.out.println("10. 음료수======800원\n");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();
			System.out.print("수량선택 : ");
			int num = sc.nextInt();
			System.out.print("\n" + menu + "번 메뉴 " + num + "개 주문하셨습니다.\n");
			System.out.print("추가 주문 하시겠습니까 ? (y/n) : ");
			add = sc.next().charAt(0);

			if (menu == 1 || menu == 2 || menu == 3 || menu == 9) {
				sumPay = sumPay + (1000 * num);
			} else if (menu == 4 || menu == 7) {
				sumPay = sumPay + (1200 * num);
			} else if (menu == 5) {
				sumPay = sumPay + (1500 * num);
			} else if (menu == 6) {
				sumPay = sumPay + (2000 * num);
			} else if (menu == 8) {
				sumPay = sumPay + (2500 * num);
			} else if (menu == 10) {
				sumPay = sumPay + (800 * num);
			}
		} while (add == 'y');
		System.out.print("\n총 주문 금액은 : " + sumPay + "원 입니다");
		try {
			while (true) {
				Thread.sleep(1);
			}
		} catch (Exception e) {
			System.out.print("Thread Err");
		}
	}

}
