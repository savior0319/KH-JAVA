package kh.java.hw;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int grade, stCl, stNum;
		char gen;
		double result;
		
		System.out.print("학생이름 : ");
		name = sc.nextLine();
		System.out.print("반 입력 : ");
		stCl = sc.nextInt();
		System.out.print("번호 입력 : ");
		stNum = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 입력 : ");
		gen = sc.nextLine().charAt(0);
		System.out.print("성적 입력 : ");
		result = sc.nextDouble();
	
		System.out.println("이름 : " + name);
		System.out.println("반 : " + stCl);
		System.out.println("번호 : " + stNum);
	
		if(gen == 'M') {
		System.out.println("성별 : 남자");
		} else {
		System.out.println("성별  : 여자");
		}
		System.out.println("성적  : " + result);
		
	}
}
