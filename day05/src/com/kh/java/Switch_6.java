package com.kh.java;

import java.util.Scanner;

public class Switch_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("장학금 지불 시스템입니다\n");
		System.out.print("학생 학점을 입력해주세요 : ");
		
		char grade = sc.next().charAt(0);
		
		switch(grade) {
		case 'A' :
			System.out.println("수고하셨습니다. 장학금을 100% 지급해드리겠습니다");
			break;
		case 'B' :
			System.out.println("약간 아쉽네요. 장학금 50% 지원입니다");
			break;
		case 'C' :
			System.out.println("이번 학기 장학금은 없네요... 힘내세요");
			break;
		case 'D' :
			System.out.println("학고는 면하셨네요... 노력하세요");
			break;
		case 'F' :
			System.out.println("이번학기는 학고를 맞으셨습니다");
		}
	}
}
