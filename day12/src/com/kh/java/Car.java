package com.kh.java;

import java.util.Scanner;

public class Car{
	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("unused")
	private int startSpeed = 0, nowSpeed, Displacement;
	private long price;
	private double maxSpeed, fuelEconomy;
	private String carName = "", factory;
	private boolean carPower = false;
	
	public void start() {
		menu();
	}

	private void menu() {
		while (true) {
			System.out.println("-------------<메뉴>-------------");
			System.out.println("1. 차 정보 입력");
			System.out.println("2. 차 정보 보기");
			System.out.println("3. 시동 걸기");
			System.out.println("4. 운전 하기");
			System.out.println("5. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택 >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("숫자만 입력하세요!");
				System.out.print("선택 >>");
			}
			int menuSelect = sc.nextInt();
			switch (menuSelect) {
			case 1:
				carInfoIn();
				break;
			case 2:
				carInfoView();
				break;
			case 3:
				carOnOff();
				break;
			case 4:
				carDrive();
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("\n※1~5 까지만 입력하세요\n");
				break;
			}
		}
	}

	private void carInfoIn() {
		System.out.print("차 모델명을 입력하세요 : ");
		carName = sc.next();
		System.out.print("제조 회사를 입력하세요 : ");
		factory = sc.next();
		System.out.print("최대 속도 입력하세요 (단위 KM/H): ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("숫자만 입력하세요!");
			System.out.print("최대 속력 입력하세요 (단위 KM/H): ");
		}
		maxSpeed = sc.nextDouble();
		System.out.print("연비를 입력하세요 (단위 KM/L): ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("숫자만 입력하세요!");
			System.out.print("연비를 입력하세요 (단위 KM/L): ");
		}
		fuelEconomy = sc.nextDouble();
		System.out.print("배기량 입력하세요 (단위 CC): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("숫자만 입력하세요!");
			System.out.print("배기량 입력하세요 (단위 CC): ");
		}
		Displacement = sc.nextInt();
		System.out.print("가격 입력하세요 (단위 만원): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("숫자만 입력하세요!");
			System.out.print("가격 입력하세요 (단위 원): ");
		}
		price = sc.nextLong();

		System.out.println("\n----- " + carName + "이(가) 입력되었습니다 -----\n");
	}

	private void carInfoView() {
		if (carName.equals("")) {
			System.out.println("\n※조회할 정보가 없습니다!\n");
		} else {
			if (0 <= Displacement && Displacement < 1000) {
				car("경차");
			} else if (1000 <= Displacement && Displacement < 1600) {
				car("소형차");
			} else if (1600 <= Displacement && Displacement < 2000) {
				car("중형차");
			} else if (2000 <= Displacement && Displacement < 5000) {
				car("대형차");
			} else if (5000 <= Displacement) {
				car("슈퍼카");
			}
		}
	}

	private void car(String str) {
		System.out.println("-------------<조회>-------------");
		System.out.printf("모델명 : %s\n", carName);
		System.out.printf("제조회사 : %s\n", factory);
		System.out.printf("최대속도 : %.1fKM/H\n", maxSpeed);
		System.out.printf("연비 : %.1fKM/L\n", fuelEconomy);
		System.out.printf("배기량 : %sCC\n", Displacement);
		System.out.printf("가격 : %d만원\n", price);
		System.out.printf("차종 : %s\n", str);
		System.out.println("-------------------------------");
	}

	private void carOnOff() {
		if (carName.equals("")) {
			System.out.println("\n※차가 없습니다!\n");
		}

		else if (carPower == false) {
			carPower = true;
			System.out.println("\n시동이 켜졌습니다!\n");
		} else {
			carPower = false;
			System.out.println("\n시동이 껴졌습니다!\n");
		}

	}

	private void carDrive() {
		int choice;
		if (carName.equals("")) {
			System.out.println("\n※차가 없습니다!\n");
		} else if (carPower == false) {
			System.out.println("\n시동이 꺼져있습니다!\n");
		} else {
			while (true) {
				if (nowSpeed > maxSpeed) {
					System.out.println("\n※사고가 났습니다※\n죽었습니다..");
					System.exit(0);
				}
				System.out.println("-----------------------------------");
				System.out.println(carName + "의 최대 속도 : " + maxSpeed + "KH/H");
				System.out.println("-----------------------------------");
				System.out.println("1. 속도 증가 (20KM/H씩 증가): ");
				System.out.println("2. 속도 감소 (20KM/H씩 감소): ");
				System.out.print("선택 >> ");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("숫자만 입력하세요!");
				}
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					if (nowSpeed <= maxSpeed) {
						nowSpeed += 10;
						if (nowSpeed == maxSpeed) {
							System.out.println("\n※※※※※속도를 더 올리면 죽습니다!!※※※※※\n속도를 줄이세요!\n");
						}
					}
					System.out.println("-----------------------------------");
					System.out.println("현재 속도 : " + nowSpeed + "KM/H");
					System.out.println("-----------------------------------");
					break;
				case 2:
					if (nowSpeed <= 0) {
						System.out.println("속도는 0KM/H 보다 작을 수 없습니다!");
						System.out.println("-----------------------------------");
						System.out.println("현재 속도 : " + nowSpeed + "KM/H");
						System.out.println("-----------------------------------");
					} else {
						nowSpeed -= 10;
					}
					System.out.println("-----------------------------------");
					System.out.println("현재 속도 : " + nowSpeed + "KM/H");
					System.out.println("-----------------------------------");
					break;
				default:
					System.out.println("1또는 2를 입력하세요!");
					break;
				}
			}
		}
	}

	// private void carPrint() {
	//
	// }

	private void exit() {
		System.out.println("\n※프로그램을 종료합니다");
		System.exit(0);
	}
}
