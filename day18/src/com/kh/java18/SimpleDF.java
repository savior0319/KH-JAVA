package com.kh.java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDF {

	public static void main(String[] args) {
		Date date= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd aa HH:mm:ss");
		System.out.println(sdf.format(date));
	}
}
