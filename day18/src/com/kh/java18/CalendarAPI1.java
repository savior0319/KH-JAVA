package com.kh.java18;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarAPI1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar cal = new GregorianCalendar(2017, 1, 20);
		long nowL = now.getTimeInMillis() / (60 * 60 * 24 * 1000);
		long calL = cal.getTimeInMillis() / (60 * 60 * 24 * 1000);

		System.out.println(nowL - calL + "¿œ¡ˆ≥≤");
	}
}
