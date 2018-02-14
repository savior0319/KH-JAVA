package com.kh.java;

import java.util.Random;
import java.lang.*;

public class StringRSP {
	public static void main(String[] args) {
		Random rd = new Random();
		String comStr = null;
		int rspInt = 0, comChoice = 0;

		if (args[0].equals("����")) {
			rspInt = 1;
		} else if (args[0].equals("����")) {
			rspInt = 2;
		} else if (args[0].equals("��")) {
			rspInt = 3;
		}
		comChoice = rd.nextInt(3) + 1;

		if (comChoice == 1) {
			comStr = "����";
		} else if (comChoice == 2) {
			comStr = "����";
		} else if (comChoice == 3) {
			comStr = "��";
		}

		System.out.println("===============");
		System.out.println("+ Your's \"" + args[0] + "\"");
		System.out.println("+ Com' s \"" + comStr + "\"");
		System.out.println("===============");

		if (comChoice == rspInt) {
			System.out.println("Draw");
		} else if ((rspInt == 1 && comChoice == 3) || (rspInt == 2 && comChoice == 1) || (rspInt == 3 && comChoice == 2)) {
			System.out.println("Win!");
		} else {
			System.out.println("Lose!");
		}

	}
}
