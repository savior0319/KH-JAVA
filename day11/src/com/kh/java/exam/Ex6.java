package com.kh.java.exam;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int selelct = 0;

		while (true) {
			System.out.println("<<<�޴�>>>");
			System.out.println("1. �Է�");
			System.out.println("2. ��ȸ");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ����");
			System.out.print("���� : ");
			selelct = sc.nextInt();

			if (!(1 <= selelct && selelct <= 5)) {
				System.out.println("�޴��� �߸������߽��ϴ�\n");
				continue;
			} else
				break;
		}

		switch (selelct) {
		case 1:
			System.out.println("*** �Է��� ���������� �Ǿ����ϴ� ***");
			break;
		case 2:
			System.out.println("*** ��ȸ�� ���������� �Ǿ����ϴ� ***");
			break;
		case 3:
			System.out.println("*** ������ ���������� �Ǿ����ϴ� ***");
			break;
		case 4:
			System.out.println("*** ������ ���������� �Ǿ����ϴ� ***");
			break;
		case 5:
			System.out.println("***���� ���������� �Ǿ����ϴ� ***");
			break;
		}
	}
}
