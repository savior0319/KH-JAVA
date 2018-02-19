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
			System.out.println("-------------<�޴�>-------------");
			System.out.println("1. �� ���� �Է�");
			System.out.println("2. �� ���� ����");
			System.out.println("3. �õ� �ɱ�");
			System.out.println("4. ���� �ϱ�");
			System.out.println("5. ����");
			System.out.println("-------------------------------");
			System.out.print("���� >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("���ڸ� �Է��ϼ���!");
				System.out.print("���� >>");
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
				System.out.println("\n��1~5 ������ �Է��ϼ���\n");
				break;
			}
		}
	}

	private void carInfoIn() {
		System.out.print("�� �𵨸��� �Է��ϼ��� : ");
		carName = sc.next();
		System.out.print("���� ȸ�縦 �Է��ϼ��� : ");
		factory = sc.next();
		System.out.print("�ִ� �ӵ� �Է��ϼ��� (���� KM/H): ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("���ڸ� �Է��ϼ���!");
			System.out.print("�ִ� �ӷ� �Է��ϼ��� (���� KM/H): ");
		}
		maxSpeed = sc.nextDouble();
		System.out.print("���� �Է��ϼ��� (���� KM/L): ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("���ڸ� �Է��ϼ���!");
			System.out.print("���� �Է��ϼ��� (���� KM/L): ");
		}
		fuelEconomy = sc.nextDouble();
		System.out.print("��ⷮ �Է��ϼ��� (���� CC): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("���ڸ� �Է��ϼ���!");
			System.out.print("��ⷮ �Է��ϼ��� (���� CC): ");
		}
		Displacement = sc.nextInt();
		System.out.print("���� �Է��ϼ��� (���� ����): ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("���ڸ� �Է��ϼ���!");
			System.out.print("���� �Է��ϼ��� (���� ��): ");
		}
		price = sc.nextLong();

		System.out.println("\n----- " + carName + "��(��) �ԷµǾ����ϴ� -----\n");
	}

	private void carInfoView() {
		if (carName.equals("")) {
			System.out.println("\n����ȸ�� ������ �����ϴ�!\n");
		} else {
			if (0 <= Displacement && Displacement < 1000) {
				car("����");
			} else if (1000 <= Displacement && Displacement < 1600) {
				car("������");
			} else if (1600 <= Displacement && Displacement < 2000) {
				car("������");
			} else if (2000 <= Displacement && Displacement < 5000) {
				car("������");
			} else if (5000 <= Displacement) {
				car("����ī");
			}
		}
	}

	private void car(String str) {
		System.out.println("-------------<��ȸ>-------------");
		System.out.printf("�𵨸� : %s\n", carName);
		System.out.printf("����ȸ�� : %s\n", factory);
		System.out.printf("�ִ�ӵ� : %.1fKM/H\n", maxSpeed);
		System.out.printf("���� : %.1fKM/L\n", fuelEconomy);
		System.out.printf("��ⷮ : %sCC\n", Displacement);
		System.out.printf("���� : %d����\n", price);
		System.out.printf("���� : %s\n", str);
		System.out.println("-------------------------------");
	}

	private void carOnOff() {
		if (carName.equals("")) {
			System.out.println("\n������ �����ϴ�!\n");
		}

		else if (carPower == false) {
			carPower = true;
			System.out.println("\n�õ��� �������ϴ�!\n");
		} else {
			carPower = false;
			System.out.println("\n�õ��� �������ϴ�!\n");
		}

	}

	private void carDrive() {
		int choice;
		if (carName.equals("")) {
			System.out.println("\n������ �����ϴ�!\n");
		} else if (carPower == false) {
			System.out.println("\n�õ��� �����ֽ��ϴ�!\n");
		} else {
			while (true) {
				if (nowSpeed > maxSpeed) {
					System.out.println("\n�ػ�� �����ϴ١�\n�׾����ϴ�..");
					System.exit(0);
				}
				System.out.println("-----------------------------------");
				System.out.println(carName + "�� �ִ� �ӵ� : " + maxSpeed + "KH/H");
				System.out.println("-----------------------------------");
				System.out.println("1. �ӵ� ���� (20KM/H�� ����): ");
				System.out.println("2. �ӵ� ���� (20KM/H�� ����): ");
				System.out.print("���� >> ");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("���ڸ� �Է��ϼ���!");
				}
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					if (nowSpeed <= maxSpeed) {
						nowSpeed += 10;
						if (nowSpeed == maxSpeed) {
							System.out.println("\n�ءءءءؼӵ��� �� �ø��� �׽��ϴ�!!�ءءءء�\n�ӵ��� ���̼���!\n");
						}
					}
					System.out.println("-----------------------------------");
					System.out.println("���� �ӵ� : " + nowSpeed + "KM/H");
					System.out.println("-----------------------------------");
					break;
				case 2:
					if (nowSpeed <= 0) {
						System.out.println("�ӵ��� 0KM/H ���� ���� �� �����ϴ�!");
						System.out.println("-----------------------------------");
						System.out.println("���� �ӵ� : " + nowSpeed + "KM/H");
						System.out.println("-----------------------------------");
					} else {
						nowSpeed -= 10;
					}
					System.out.println("-----------------------------------");
					System.out.println("���� �ӵ� : " + nowSpeed + "KM/H");
					System.out.println("-----------------------------------");
					break;
				default:
					System.out.println("1�Ǵ� 2�� �Է��ϼ���!");
					break;
				}
			}
		}
	}

	// private void carPrint() {
	//
	// }

	private void exit() {
		System.out.println("\n�����α׷��� �����մϴ�");
		System.exit(0);
	}
}
