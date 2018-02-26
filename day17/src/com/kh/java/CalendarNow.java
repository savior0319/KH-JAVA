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
		
		String strOut = year + "년 " + month + "월 " + day + "일 " 
						+ week(week) +"요일\n" +hour + "시 " + min 
						+ "분 " + sec + "초";
		System.out.println(strOut);
	}

	public static char week(int week) {
		switch (week) {
		case 1: return '일';
		case 2: return '월';
		case 3: return '화';
		case 4: return '수';
		case 5: return '목';
		case 6: return '금';
		case 7: return '토';
		} return 0;
	}
}
