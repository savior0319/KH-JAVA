package com.kh.java18;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		Calendar dD = Calendar.getInstance();
		int dYear, dMonth, dDay;
		int nDay = now.get(Calendar.DAY_OF_MONTH);
		int nMonth = now.get(Calendar.MONTH) + 1;
		int nYear = now.get(Calendar.YEAR);
		
		System.out.print("D-Day [년도]입력 : ");
		dYear = sc.nextInt();
		System.out.print("D-Day [월]입력 : ");
		dMonth = sc.nextInt();
		System.out.print("D-Day [일]입력 : ");
		dDay = sc.nextInt();
		dD.set(dYear, dMonth - 1, dDay);
		System.out.println("오늘 날짜 : " + nYear + "년 " + nMonth + "월 " + nDay + "일");
		System.out.println("D-Day 날짜 : " + dYear + "년 " + dMonth + "월 " + dDay + "일");

		long nTime = now.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long dTime = dD.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long differ = dTime - nTime;

		if (differ > 0) { System.out.println("※ " + differ + "일 남았습니다"); } 
		else if (nTime == dTime) { System.out.println("※ D-Day 입니다"); } 
		else { System.out.println("※ " + Math.abs(differ) + "일 지났습니다"); }
	}
}
