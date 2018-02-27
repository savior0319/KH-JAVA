package com.kh.java18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMenu {

	private Scanner sc = new Scanner(System.in);

	public void menuPrint() {
		System.out.println("--------- 메뉴 선택 -----------");
		System.out.println("1. 반갑습니다.");
		System.out.println("2. 잘지내세요.");
		System.out.println("3. 또 만나요 ");
		System.out.print("입력 : ");
	}

	public void ExceptionDemo1_Print(int choice) {
		switch (choice) {
		case 1:
			System.out.println("반갑습니다");
			break;
		case 2:
			System.out.println("잘지내세요");
			break;
		case 3:
			System.out.println("또 만나요");
			break;
		default:
			System.out.println("1~3 에서 선택해주세요");
		}

	}

	public void start() {
		int choice = 0;
		this.menuPrint();
		// while(!sc.hasNextInt()) {
		// sc.next();
		// System.out.println("숫자만 입력하세요!");
		// System.out.print("입력 : ");
		// }
		// choice = sc.nextInt();
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
		ExceptionDemo1_Print(choice);
	}
}
