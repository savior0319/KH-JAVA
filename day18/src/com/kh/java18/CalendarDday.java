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
		
		System.out.print("D-Day [�⵵]�Է� : ");
		dYear = sc.nextInt();
		System.out.print("D-Day [��]�Է� : ");
		dMonth = sc.nextInt();
		System.out.print("D-Day [��]�Է� : ");
		dDay = sc.nextInt();
		dD.set(dYear, dMonth - 1, dDay);
		System.out.println("���� ��¥ : " + nYear + "�� " + nMonth + "�� " + nDay + "��");
		System.out.println("D-Day ��¥ : " + dYear + "�� " + dMonth + "�� " + dDay + "��");

		long nTime = now.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long dTime = dD.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long differ = dTime - nTime;

		if (differ > 0) { System.out.println("�� " + differ + "�� ���ҽ��ϴ�"); } 
		else if (nTime == dTime) { System.out.println("�� D-Day �Դϴ�"); } 
		else { System.out.println("�� " + Math.abs(differ) + "�� �������ϴ�"); }
	}
}
