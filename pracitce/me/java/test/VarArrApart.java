package me.java.test;
/*���� �迭 ����Ʈ*/
import java.util.Scanner;

public class VarArrApart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("----- ����Ʈ ���� �Է� -----");
		System.out.print("�ǹ� �� ���� �Է� : ");
		int floor = sc.nextInt();
		String[][] apart = new String[floor][];
		System.out.println(floor + "���� ���� �Ǿ����ϴ�");
		for (int i = 0; i < floor; i++) {
			System.out.print(i + 1 + "���� �� ȣ�� �Է� : ");
			int room = sc.nextInt();
			apart[i] = new String[room];

		}
		System.out.println();
		for (int i = 0; i < floor; i++) {
			System.out.println(i + 1 + "���� " + apart[i].length + "ȣ�� ���� �����Ǿ����ϴ�");
		}
		sc.nextLine();
		System.out.println("\n�ذ� ȣ�� ���� ������ �̸��� �Է��ϼ���");
		for (int i = 0; i < floor; i++) {
			System.out.println("\n-----" + (i + 1) + "�� �����Է�-----");
			for (int j = 0; j < apart[i].length; j++) {
				System.out.print((i + 1) + "�� " + (j + 1) + "ȣ ������ : ");
				apart[i][j] = sc.nextLine();
			}
		}

		System.out.println("\n-----���� ������ ���� ���-----");
		for (int i = 0; i < floor; i++) {
			System.out.print(i + 1 + "�� : ");
			for (int j = 0; j < apart[i].length; j++) {

				System.out.print(apart[i][j] + " ");
			}
			System.out.println();
		}

	}
}
