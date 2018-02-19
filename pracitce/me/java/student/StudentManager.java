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
			System.out.println("----------<메뉴>----------");
			System.out.println("1. 학생정보 입력(추가) ");
			System.out.println("2. 학생정보 삭제(제거)");
			System.out.println("3. 학생 정보 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.print("선택 >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("※메뉴는 숫자만 입력가능합니다!");
				System.out.print("선택  >> ");
			}
			menuSel = sc.nextInt();
			switch (menuSel) {
			case 1:
				stdInfoIn();
				break;
			case 2:
				System.out.println("\n-> 학생정보 삭제 메뉴를 선택했습니다\n");
				stdInfoDel();
				break;
			case 3:
				System.out.println("\n-> 학생 정보 조회 메뉴를 선택했습니다\n");
				stdInfoView();
				break;
			case 4:
				System.out.println("\n-> 프로그램을 종료합니다\n");
				exit();
				break;
			default:
				System.out.println("\n메뉴를 잘못입력했습니다(1~4까지만 입력하세요!)\n");
			}
		}

	}

	private void exit() {
		System.exit(0);
	}

	private void stdInfoIn() {
		StudentData sData = new StudentData();
		System.out.print("이름을 입력하세요 : ");
		sData.setName(sc.next());
		System.out.print("나이를 입력하세요 : ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("※나이는 숫자만 입력가능합니다!");
			System.out.print("나이를 입력하세요 : ");
		}
		sData.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("주소를 입력하세요 : ");
		sData.setAddr(sc.nextLine());
		System.out.print("성별를 입력하세요 (남/여) : ");
		sData.setGender(sc.next().charAt(0));
		System.out.print("국어 점수를 입력하세요 : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("※국어 점수는 숫자만 입력가능합니다!");
			System.out.print("국어 점수를 입력하세요 : ");
		}
		sData.setKor(sc.nextDouble());
		System.out.print("영어 점수를 입력하세요 : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("※영어 점수는 숫자만 입력가능합니다!");
			System.out.print("영어 점수를 입력하세요 : ");
		}
		sData.setEng(sc.nextDouble());
		System.out.print("수학 점수를 입력하세요 : ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("※수학 점수는 숫자만 입력가능합니다!");
			System.out.print("수학 점수를 입력하세요 : ");
		}
		sData.setMath(sc.nextDouble());
		sData.setSum(sData.getMath() + sData.getKor() + sData.getEng());
		sData.setAvg(sData.getSum() / 3);

		aList1.add(sData);
		aList2.add(sData.getAvg());
		count++;
		System.out.println("\n정보가 모두 입력되었습니다!\n");
	}

	private void stdInfoView() {
		int stdCount = 1;
		if (count == 0) {
			System.out.println("※조회할 학생이 없습니다!\n");
		} else {
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			System.out.println("번호\t\t이름\t\t나이\t\t주소\t\t성별\t\t국어\t\t수학\t\t영어\t\t합계\t\t평균");
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "살\t\t" + i.getAddr()
						+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "점\t\t"
						+ String.format("%.0f", i.getMath()) + "점\t\t" + String.format("%.0f", i.getEng()) + "점\t\t"
						+ String.format("%.0f", i.getSum()) + "점\t\t" + String.format("%.2f", i.getAvg()) + "점");
				stdCount++;
			}
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
		}
/*
		System.out.println("******************************************");
		System.out.println("1. 평균 오름차순정렬\t2. 평균 내림차순정렬");
		System.out.println("******************************************");
		System.out.print("선택 >> ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("※메뉴 숫자만 입력가능합니다!");
			System.out.print("선택 >> ");
		}
		int selSort = sc.nextInt();
		switch (selSort) {
		case 1:
			Collections.sort(aList2);
				System.out.println("-----------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------"
						+ "------------------------------------------------");
				System.out.println("번호\t\t이름\t\t나이\t\t주소\t\t성별\t\t국어\t\t수학\t\t영어\t\t합계\t\t평균");
				System.out.println("-----------------------------------------------------------------------------"
						+ "---------------------------------------------------------------------------"
						+ "------------------------------------------------");
				for (StudentData i : aList1) {
					System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "살\t\t" + i.getAddr()
							+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "점\t\t"
							+ String.format("%.0f", i.getMath()) + "점\t\t" + String.format("%.0f", i.getEng()) + "점\t\t"
							+ String.format("%.0f", i.getSum()) + "점\t\t" + String.format("%.2f", i.getAvg()) + "점");
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
			System.out.println("번호\t\t이름\t\t나이\t\t주소\t\t성별\t\t국어\t\t수학\t\t영어\t\t합계\t\t평균");
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "\t\t" + i.getName() + "\t\t" + i.getAge() + "살\t\t" + i.getAddr()
						+ "\t\t" + i.getGender() + "\t\t" + String.format("%.0f", i.getKor()) + "점\t\t"
						+ String.format("%.0f", i.getMath()) + "점\t\t" + String.format("%.0f", i.getEng()) + "점\t\t"
						+ String.format("%.0f", i.getSum()) + "점\t\t" + String.format("%.2f", i.getAvg()) + "점");
				stdCount++;
			}
			System.out.println("-----------------------------------------------------------------------------"
					+ "---------------------------------------------------------------------------"
					+ "------------------------------------------------");
			break;
		default:
			System.out.println("※잘못입력했습니다!\n");
			break;
		}
		System.out.print("***********");*/
	}

	private void stdInfoDel() {
		int stdCount = 1;
		if (count == 0) {
			System.out.println("※삭제할 학생이 없습니다!\n");
		} else {
			System.out.println("-----------------------------");
			System.out.println("현재 " + aList1.size() + "명의 학생이 있습니다");
			System.out.println("-----------------------------\n");
			for (StudentData i : aList1) {
				System.out.println(stdCount + "번 학생 -> " + i.getName());
				stdCount++;
			}
			System.out.print("\n삭제할 학생 번호 (뒤로가기 : 0입력) >> ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("※숫자만 입력가능합니다!");
				System.out.print("삭제할 학생 번호 >> ");
			}
			int stdNum = sc.nextInt();
			if (stdNum > aList1.size() || stdNum <= 0) {
				System.out.println("\n※학생번호를 잘못 입력했습니다!\n");
			} else {
				aList1.remove(stdNum - 1);
				count--;
				System.out.println("\n※" + stdNum + "번째 학생이 삭제되었습니다!\n");
			}
		}
	}

}
