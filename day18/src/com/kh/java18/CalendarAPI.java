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
		System.out.print(year + "�� ");
		System.out.print(month + "�� ");
		System.out.print(day+ "�� ");
		System.out.println(day(dayW) +"����");
		if (cal.get(Calendar.AM_PM) == 0) { apm = "����"; } 
		else {apm = "����";}
		System.out.print(apm + " ");
		System.out.print(hour + "�� ");
		System.out.print(min + "�� ");
		System.out.print(sec +"��");
	}
	
	public static char day(int dayW) {
		switch (dayW) {
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
