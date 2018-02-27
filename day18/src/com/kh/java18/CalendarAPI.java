package com.kh.java18;

import java.util.Calendar;

public class CalendarAPI {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String apm = new String();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayW = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day+ "일 ");
		System.out.println(day(dayW) +"요일");
		if (cal.get(Calendar.AM_PM) == 0) { apm = "오전"; } 
		else {apm = "오후";}
		System.out.print(apm + " ");
		System.out.print(hour + "시 ");
		System.out.print(min + "분 ");
		System.out.print(sec +"초");
	}
	
	public static char day(int dayW) {
		switch (dayW) {
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
