package kh.java.controller;

import java.util.Scanner;

import kh.java.model.Student;

public class StdMgr {
	Student[] s = new Student[3];

	Scanner sc = new Scanner(System.in);

	public StdMgr() {
		for (int i = 0; i < s.length; i++) {
			s[i] = new Student();
		}
	}

	public void start() {
		while (true) {
			System.out.println("----------메뉴----------");
			System.out.println("1. 학생정보 입력 (3명)");
			System.out.println("2. 학생정보 조회 (3명)");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			case 3:
				programEnd();
				return;
			default:
				System.out.println("\n메뉴를 잘못입력 했습니다!\n");
				break;
			}
		}
	}

	public void programEnd() {
		System.out.println("\n※ 프로그램을 종료합니다!");
	}

	public void insertData() {
		for (int i = 0; i < s.length; i++) {
			System.out.println("\n<" + (i + 1) + "번째 학생정보 입력 >");
			System.out.print("이름을 입력하세요 >> ");
			s[i].setName(sc.next());
			System.out.print("나이를 입력하세요 >> ");
			s[i].setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("성별을 입력하세요 >> ");
			s[i].setGender(sc.next().charAt(0));
			System.out.print("주소를 입력하세요 >> ");
			sc.nextLine();
			s[i].setAddr(sc.nextLine());
			System.out.print("학번을 입력하세요 >> ");
			s[i].setNumber(sc.nextInt());
			System.out.print("학점을 입력하세요 >> ");
			s[i].setGrade(sc.nextDouble());
			sc.nextLine();
			System.out.println("\n※ " + (i + 1) + "번째 학생정보가 입력되었습니다");
			
		}
		System.out.println("\n※ " + s.length + "명의 학생 정보가 입력되었습니다!\n");

	}

	public void printData() {
		System.out.println("\n-----------------------학생정보 출력-----------------------\n");
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		System.out.println("이름\t\t나이\t\t성별\t\t주소\t\t학번\t\t학점\t\t");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName() + "\t\t" + s[i].getAge() + "\t\t" + s[i].getGender() + "\t\t"
					+ s[i].getAddr() + "\t\t" + s[i].getNumber() + "\t\t" + s[i].getGrade());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
	}

}
