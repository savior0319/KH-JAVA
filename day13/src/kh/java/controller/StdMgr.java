package kh.java.controller;

import java.util.Scanner;
import kh.java.model.Student;

public class StdMgr {
	Student s = new Student();
	Scanner sc = new Scanner(System.in);

	public void start() {
		while (true) {
			System.out.println("======<메뉴>======");
			System.out.println("1. 학생 정보 입력 ");
			System.out.println("2. 학생 정보 출력 ");
			System.out.println("3. 프로그램 종료");
			System.out.print("선택 >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				insertData();
				break;
			case 2:
				printData();
				break;
			case 3:
				programEnd();
				return;
			}
		}
	}
	
	public void programEnd() {
		System.out.println("\n※프로그램을 종료합니다!");
	}

	public void insertData() {
		System.out.print("\n이름을 입력하세요 -> ");
		s.setName(sc.next());
		System.out.print("나이를 입력하세요 -> ");
		s.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("성별을 입력하세요 -> ");
		s.setGender(sc.next().charAt(0));
		sc.nextLine();
		System.out.print("주소를 입력하세요 -> ");
		s.setAddr(sc.nextLine());
		System.out.print("학번을 입력하세요 -> ");
		s.setNumber(sc.nextInt());
		sc.nextLine();
		System.out.print("학점을 입력하세요 -> ");
		s.setGrade(sc.nextDouble());
		System.out.println();
	}

	public void printData() {
		System.out.println("\n-------------------------------------"
				+ "----------------------------------------------------------");
		System.out.println("이름\t\t나이\t\t성별\t\t주소\t\t학번\t\t학점\t\t");
		System.out.println(s.getName() + "\t\t" + s.getAge() + "살\t\t" + s.getGender() + "\t\t" + s.getAddr() + "\t\t"
				+ s.getNumber() + "\t\t" + s.getGrade() + "점\t\t");
		System.out.println("-------------------------------------"
				+ "----------------------------------------------------------\n");
	}
}
