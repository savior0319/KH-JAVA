package me.java.student;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class StudentManager {

	Scanner sc = new Scanner(System.in);
	ArrayList<StudentData> aList1 = new ArrayList<StudentData>();
	ArrayList<Double> aList2 = new ArrayList<Double>();
	private int count = 0;

	public void start() {
		menu();
	}

	private void menu() {
		while (true) {
			int menuSel;
			System.out.println("----------<�޴�>----------");
			System.out.println("1. �л����� �Է�(�߰�) ");
			System.out.println("2. �л����� ����(����)");
			System.out.println("3. �л� ���� ��ȸ");
			System.out.println("4. ���α׷� ����");
			System.out.println("-------------------------");
			System.out.print("���� >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("�ظ޴��� ���ڸ� �Է°����մϴ�!");
				System.out.print("����  >> ");
			}
			menuSel = sc.nextInt();
			switch (menuSel) {
			case 1:
				stdInfoIn();
				break;
			case 2:
				System.out.println("\n-> �л����� ���� �޴��� �����߽��ϴ�\n");
				stdInfoDel();
				break;
			case 3:
				System.out.println("\n-> �л� ���� ��ȸ �޴��� �����߽��ϴ�\n");
				stdInfoView();
				break;
			case 4:
				System.out.println("\n-> ���α׷��� �����մϴ�\n");
				exit();
				break;
			default:
				System.out.println("\n�޴��� �߸��Է��߽��ϴ�(1~4������ �Է��ϼ���!)\n");
			}
		}

	}

	private void exit() {
		System.exit(0);
	}

	private void stdInfoIn() {
		StudentData sData = new StudentData();
		System.out.print("�̸��� �Է��ϼ��� : ");
		sData.setName(sc.next());
		System.out.print("���̸� �Է��ϼ��� : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("�س��̴� ���ڸ� �Է°����մϴ�!");
			System.out.print("���̸� �Է��ϼ��� : ");
		}
		sData.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		sData.setAddr(sc.nextLine());
		System.out.print("������ �Է��ϼ��� (��/��) : ");
		sData.setGender(sc.next().charAt(0));
		System.out.print("���� ������ �Է��ϼ��� : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("�ر��� ������ ���ڸ� �Է°����մϴ�!");
			System.out.print("���� ������ �Է��ϼ��� : ");
		}
		sData.setKor(sc.nextDouble());
		System.out.print("���� ������ �Է��ϼ��� : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("�ؿ��� ������ ���ڸ� �Է°����մϴ�!");
			System.out.print("���� ������ �Է��ϼ��� : ");
		}
		sData.setEng(sc.nextDouble());
		System.out.print("���� ������ �Է��ϼ��� : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("�ؼ��� ������ ���ڸ� �Է°����մϴ�!");
			System.out.print("���� ������ �Է��ϼ��� : ");
		}
		sData.setMath(sc.nextDouble());
		sData.setSum(sData.getMath() + sData.getKor() + sData.getEng());
		sData.setAvg(sData.getSum() / 3);

		aList1.add(sData);
		aList2.add(sData.getAvg());
		count++;
		System.out.println("\n������ ��� �ԷµǾ����ϴ�!\n");
	}

	private void stdInfoView() {
		int stdCount = 1;
		if (count == 0) {
			System.out.println("����ȸ�� �л��� �����ϴ�!\n");
		} else {
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			System.out.println("��ȣ\t\t�̸�\t\t����\t\t�ּ�\t\t����\t\t����\t\t����\t\t����\t\t�հ�\t\t���");
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "��\t\t" + i.getAddr()
						+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "��\t\t"
						+ String.format("%.0f", i.getMath()) + "��\t\t" + String.format("%.0f", i.getEng()) + "��\t\t"
						+ String.format("%.0f", i.getSum()) + "��\t\t" + String.format("%.2f", i.getAvg()) + "��");
				stdCount++;
			}
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
		}
/*
		System.out.println("******************************************");
		System.out.println("1. ��� ������������\t2. ��� ������������");
		System.out.println("******************************************");
		System.out.print("���� >> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("�ظ޴� ���ڸ� �Է°����մϴ�!");
			System.out.print("���� >> ");
		}
		int selSort = sc.nextInt();
		switch (selSort) {
		case 1:
			Collections.sort(aList2);
				System.out.println("-----------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------"
						+ "------------------------------------------------");
				System.out.println("��ȣ\t\t�̸�\t\t����\t\t�ּ�\t\t����\t\t����\t\t����\t\t����\t\t�հ�\t\t���");
				System.out.println("-----------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------"
						+ "------------------------------------------------");
				for (StudentData i : aList1) {
					System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "��\t\t" + i.getAddr()
							+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "��\t\t"
							+ String.format("%.0f", i.getMath()) + "��\t\t" + String.format("%.0f", i.getEng()) + "��\t\t"
							+ String.format("%.0f", i.getSum()) + "��\t\t" + String.format("%.2f", i.getAvg()) + "��");
					stdCount++;
				}
				System.out.println("-----------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------"
						+ "------------------------------------------------");
			break;
		case 2:
			Collections.sort(aList2);
			Collections.reverse(aList2);
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			System.out.println("��ȣ\t\t�̸�\t\t����\t\t�ּ�\t\t����\t\t����\t\t����\t\t����\t\t�հ�\t\t���");
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "��\t\t" + i.getAddr()
						+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "��\t\t"
						+ String.format("%.0f", i.getMath()) + "��\t\t" + String.format("%.0f", i.getEng()) + "��\t\t"
						+ String.format("%.0f", i.getSum()) + "��\t\t" + String.format("%.2f", i.getAvg()) + "��");
				stdCount++;
			}
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			break;
		default:
			System.out.println("���߸��Է��߽��ϴ�!\n");
			break;
		}
		System.out.print("***********");*/
	}

	private void stdInfoDel() {
		int stdCount = 1;
		if (count == 0) {
			System.out.println("�ػ����� �л��� �����ϴ�!\n");
		} else {
			System.out.println("-----------------------------");
			System.out.println("���� " + aList1.size() + "���� �л��� �ֽ��ϴ�");
			System.out.println("-----------------------------\n");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "�� �л� -> " + i.getName());
				stdCount++;
			}
			System.out.print("\n������ �л� ��ȣ (�ڷΰ��� : 0�Է�) >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("�ؼ��ڸ� �Է°����մϴ�!");
				System.out.print("������ �л� ��ȣ >> ");
			}
			int stdNum = sc.nextInt();
			if (stdNum > aList1.size() || stdNum <= 0) {
				System.out.println("\n���л���ȣ�� �߸� �Է��߽��ϴ�!\n");
			} else {
				aList1.remove(stdNum - 1);
				count--;
				System.out.println("\n��" + stdNum + "��° �л��� �����Ǿ����ϴ�!\n");
			}
		}
	}

}
