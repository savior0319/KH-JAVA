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

		System.out.print("D-Day [�⵵]�Է� : ");
		year = sc.nextInt();
		System.out.print("D-Day [��]�Է� : ");
		month = sc.nextInt();
		System.out.print("D-Day [��]�Է� : ");
		day = sc.nextInt();
		cl.set(year, (month - 1), day);

		System.out.println("���� ��¥ : " + nowYear + "�� " + nowMonth + "�� " + nowDay + "��");
		System.out.println("D-Day ��¥ : " + year + "�� " + month + "�� " + day + "��");

		long nowGetDay = nowCl.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long getDay = cl.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long differ = getDay - nowGetDay;
		if(differ < 0) { System.out.println(Math.abs(differ) + "�� �������ϴ�"); } 
		else if (getDay == nowGetDay) { System.out.println("D-Day�Դϴ�"); } 
		else { System.out.println(differ + "�� ���ҽ��ϴ�"); }
	}
}
