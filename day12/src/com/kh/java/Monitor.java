/*
   1. 대상 물색 -> 모니터
   2. 추상화 -> 
   ## 속성 ##
       사이즈, 해상도, 모델명, 가격, 제조회사
   ## 기능 ##
       출력, 전원
*/
package com.kh.java;

import java.util.Scanner;

public class Monitor {
	Scanner sc = new Scanner(System.in);
	double inch; // 사이즈
	int resolution, price; // 해상도 가격
	String modelName, factory; // 모델명 제조회사
	boolean power = false; // 전원

	public void menu() {
		System.out.println("\n---------------메뉴---------------");
		System.out.println("1. 전원 on/off");
		System.out.println("2. 모니터 정보 보기");
		System.out.println("3. 모니터 정보 입력");
		System.out.println("4. 출력");
		System.out.print("선택 >> ");
	}

	public void start() {
		monitorInfoIn();
		while (true) {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				onOffButton();
				break;
			case 2:
				monitorInfo();
				break;
			case 3:
				monitorInfoIn();
				break;
			case 4:
				print();
				break;
			}
		}
	}

	public void monitorInfoIn() {
		System.out.print("사이즈를 입력하세요 (단위 - inch) : ");
		inch = sc.nextDouble();
		System.out.print("해상도를 입력하세요  : ");
		resolution = sc.nextInt();
		sc.nextLine();
		System.out.print("모델명을 입력하세요 : ");
		modelName = sc.nextLine();
		System.out.print("가격을 입력하세요 : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("제조회사를 입력하세요 : ");
		factory = sc.nextLine();
	}

	public void print() {
		if (power == true) {
			System.out.print("⊂_ヽ \r\n" + 
					"　 ＼＼  Λ＿Λ \r\n" + 
					"　　 ＼ ('ㅅ')  두둠칫 \r\n" + 
					"　　　 >　⌒ヽ \r\n" + 
					"　　　/ 　 へ＼ \r\n" + 
					"　　 /　　/　＼＼ \r\n" + 
					"　　/　ノ　　  ＼ _つ \r\n" + 
					"　　/　/ 두둠칫 \r\n" + 
					"　 /　/| \r\n" + 
					"　(　(  \r\n" + 
					"　|　|、＼ \r\n" + 
					"　| | ＼ ⌒) \r\n" + 
					"　| |　　) / \r\n" + 
					"(`ノ )　　L/");
		} else
			System.out.println("현재 모니터가 off 상태입니다\n모니터 전원을 on 해주시고 실행해주세요\n\n");
	}

	public void monitorInfo() {
		if (power == true) {
			System.out.println("\n---------------------------------------------");
			System.out.println("제조회사\t모델명\t사이즈\t해상도\t가격\t");
			System.out.println(factory + "\t" + modelName + "\t" + inch + "\t" + resolution + "\t" + price);
			System.out.println("---------------------------------------------");
		} else
			System.out.println("현재 모니터가 off 상태입니다\n모니터 전원을 on 해주시고 실행해주세요\n\n");
	}

	public void onOffButton() {
		if (power == false) {
			power = true;
			System.out.println("전원이 on 되었습니다\n");
		} else {
			power = false;
			System.out.println("전원 off 되었습니다\n");
		}
	}
}
