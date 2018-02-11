package study.java;

import java.util.Random;
import java.util.Scanner;

public class DiceGamble {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		final int MAXDICE = 3;
		char choice;
		int diceValue, sumDiceValue = 0, cSumDiceValue, winCount = 0, loseCount = 0, drawCount = 0;

		System.out.println("<<<Game Start>>>");

		while (true) {
			System.out.println("\n�ڡڡڡڡڸ޴��ڡڡڡڡ�");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡ�");
			System.out.print("�޴� ���� >> ");
			choice = sc.next().charAt(0);

			if (choice == '1') {
				System.out.print("\n�ֻ����� 3�� �����ϴ�");
				for (int i = 1; i <= MAXDICE;) {
					System.out.print("\n" + i + "��° (�������� q, Q) : ");
					choice = sc.next().charAt(0);
					if (!(choice == 'q' || choice == 'Q')) {
						System.out.println("q�� �Է°����մϴ�");
					} else if (choice == 'q' || choice == 'Q') {
						diceValue = rd.nextInt(6) + 1;
						System.out.println(i + "��° �� : " + diceValue);
						sumDiceValue += diceValue;
						i++;
					}
				}
				cSumDiceValue = rd.nextInt(15) + 3; // 3�� �ֻ��� �ּҰ� 3 ~ �ִ밪 18
				System.out.println("\n����" + MAXDICE + "�� ���� �ֻ����� �� : " + sumDiceValue);
				try {
					System.out.print("��ǻ�Ͱ� �ֻ��� ������ ��");
					for (int i = 0; i <= 4; i++) {
						Thread.sleep(250);
						System.out.print(".");
					}
					System.out.println();
				} catch (Exception e) {
					System.err.println("������ ����");
				}
				System.out.println("��ǻ�Ͱ�" + MAXDICE + "�� ���� �ֻ����� �� : " + cSumDiceValue + "\n");

				if (sumDiceValue > cSumDiceValue) {
					winCount++;
					System.out.print("---------------------------------");
					System.out.println("\n�� : " + sumDiceValue + ", ��ǻ�� : " + cSumDiceValue);
					System.out.println("�̰���ϴ�!");
					System.out.println(winCount + "�� " + drawCount + "�� " + loseCount + "�� ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				} else if (sumDiceValue == cSumDiceValue) {
					drawCount++;
					System.out.print("---------------------------------");
					System.out.println("\n�� : " + sumDiceValue + ", ��ǻ�� : " + cSumDiceValue);
					System.out.println("�����ϴ�!");
					System.out.println(winCount + "�� " + drawCount + "�� " + loseCount + "�� ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				} else {
					loseCount++;
					System.out.print("---------------------------------");
					System.out.println("\n�� : " + sumDiceValue + ", ��ǻ�� : " + cSumDiceValue);
					System.out.println("�����ϴ�!");
					System.out.println(winCount + "�� " + drawCount + "�� " + loseCount + "�� ");
					System.out.println("---------------------------------");
					sumDiceValue = 0;
				}

			} else if (choice == '2') {
				System.out.print("\n������ �����մϴ�");
				try {
					for (int i = 0; i <= 4; i++) {
						Thread.sleep(250);
						System.out.print(".");
					}
					System.exit(0);
				} catch (Exception e) {
					System.err.println("������ ����");
				}
				System.exit(0);
			} else
				System.out.println("\n***�޴��� �߸��Է��߽��ϴ�***");

		}
	}
}
