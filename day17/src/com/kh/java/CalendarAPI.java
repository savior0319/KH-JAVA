package com.kh.java;

import java.util.*;

public class CalendarAPI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar nowCl = Calendar.getInstance();
		Calendar cl = Calendar.getInstance();

		int nowYear = nowCl.get(Calendar.YEAR);
		int nowMonth = nowCl.get(Calendar.MONTH) + 1;
		int nowDay = nowCl.get(Calendar.DAY_OF_MONTH);
		int year, month, day;

		System.out.print("D-Day [년도]입력 : ");
		year = sc.nextInt();
		System.out.print("D-Day [월]입력 : ");
		month = sc.nextInt();
		System.out.print("D-Day [일]입력 : ");
		day = sc.nextInt();
		cl.set(year, (month - 1), day);

		System.out.println("오늘 날짜 : " + nowYear + "년 " + nowMonth + "월 " + nowDay + "일");
		System.out.println("D-Day 날짜 : " + year + "년 " + month + "월 " + day + "일");

		long nowGetDay = nowCl.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long getDay = cl.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long differ = getDay - nowGetDay;
		if(differ < 0) { System.out.println(Math.abs(differ) + "일 지났습니다"); } 
		else if (getDay == nowGetDay) { System.out.println("D-Day입니다"); } 
		else { System.out.println(differ + "일 남았습니다"); }
	}
}
