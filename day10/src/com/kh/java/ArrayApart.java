package com.kh.java;

import java.util.Scanner;

public class ArrayApart {

	public ArrayApart() {
		Scanner sc = new Scanner(System.in);
		int floor = 0;
		System.out.println("---- A ����Ʈ ���� �Է� ----");
		while (true) {
			System.out.print("�ǹ� �� ���� �Է� : ");
			floor = sc.nextInt();
			if (floor <= 0) {
				System.out.println("0�� ���� ū ���� �Է��ϼ���");
				continue;
			} else {
				break;
			}
		}
		System.out.println(floor + " ���� ���� �Ǿ����ϴ�");
		String[][] apart = new String[floor][];
		for (int i = 0; i < floor; i++) {
			while (true) {
				System.out.print(i + 1 + "���� �� ȣ�� �Է� : ");
				try {
					apart[i] = new String[sc.nextInt()];
					if (apart[i].length <= 0) {
						System.out.println("0���� ū ���� �Է��ϼ���");
						continue;
					} else {
						break;
					}
				} catch (Exception e) {
					System.out.println("0ȣ�� ���� ū ���� �Է��ϼ���");
				}
			}
		}
		sc.nextLine();
		for (int i = 0; i < floor; i++) {
			System.out.println(i + 1 + "����" + apart[i].length + "ȣ�Ǳ��� �����Ǿ����ϴ�");
		}

		for (int i = 0; i < floor; i++) {
			System.out.println("======= " + (i + 1) + "�� ���� �Է� =======");
			for (int j = 0; j < apart[i].length; j++) {
				System.out.print((i + 1) + "�� " + (j + 1) + "ȣ ������ : ");
				apart[i][j] = sc.nextLine();
			}
		}

		System.out.println("\n======�� �� ������ ���� ���======");
		for (int i = 0; i < floor; i++) {
			System.out.print((i + 1) + "�� : ");
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
