package com.kh.java;

import java.util.Scanner;

public class Student {
	String name, addr;
	int age;
	public void stdInsert() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 이름 입력 : ");
		name = sc.next();
		System.out.print("학생 나이 입력 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("학생 주소 입력 : ");
		addr = sc.nextLine();
	}

	public void stdPrint() {
		System.out.println();
		System.out.println("----------정보출력----------");
		System.out.println("이름\t나이\t주소");
		System.out.print(name + "\t" + age + "\t" + addr);
		System.out.println("-------------------------");
	}
}
