package com.kh.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		int age;
		double height, weight;
		char gender;
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("�ּ� : ");
		sc.nextLine();
		addr = sc.nextLine();
		
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.print("������ : ");
		weight = sc.nextDouble();
		
		System.out.print("���� : ");
		sc.nextLine();
		gender = sc.next().charAt(0);
		
		System.out.println("\n------���------\n");
		System.out.println(name + "\n" + age + "��\n" + addr + "\n" + height + "cm\n" + weight + "kg\n" + gender );
		
		
	}

}
