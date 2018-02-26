package com.kh.java;

import java.util.Calendar;

public class CalendarNow {

	public static void main(String[] args) {
		Calendar cld = Calendar.getInstance();
		int year = cld.get(Calendar.YEAR);
		int month = cld.get(Calendar.MONTH);
		int day = cld.get(Calendar.DAY_OF_MONTH);
		int week = cld.get(Calendar.DAY_OF_WEEK);
		int hour = cld.get(Calendar.HOUR_OF_DAY);
		int min = cld.get(Calendar.MINUTE);
		int sec = cld.get(Calendar.SECOND);
		
		String strOut = year + "�� " + month + "�� " + day + "�� " 
						+ week(week) +"����\n" +hour + "�� " + min 
						+ "�� " + sec + "��";
		System.out.println(strOut);
	}

	public static char week(int week) {
		switch (week) {
		case 1: return '��';
		case 2: return '��';
		case 3: return 'ȭ';
		case 4: return '��';
		case 5: return '��';
		case 6: return '��';
		case 7: return '��';
		} return 0;
	}
}
