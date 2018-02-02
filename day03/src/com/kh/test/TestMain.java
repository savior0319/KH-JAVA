package com.kh.test;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, addr;
		int age;
		double height, weight;
		char gender;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("주소 : ");
		sc.nextLine();
		addr = sc.nextLine();
		
		System.out.print("키 : ");
		height = sc.nextDouble();
		
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		System.out.print("성별 : ");
		sc.nextLine();
		gender = sc.next().charAt(0);
		
		System.out.println("\n------출력------\n");
		System.out.println(name + "\n" + age + "살\n" + addr + "\n" + height + "cm\n" + weight + "kg\n" + gender );
		
		
	}

}
