package me.java.test;

import java.util.Scanner;

public class CodeUpTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String strYear = str.substring(0, 2);
		String strMonth = str.substring(2, 4);
		String strDay = str.substring(4, 6);

		int intGenCheck = Integer.parseInt(str.substring(7, 8));

		if (intGenCheck == 1) {
			System.out.print("19" + strYear + "/" + strMonth + "/" + strDay + " M");
		} else if (intGenCheck == 2) {
			System.out.print("19" + strYear + "/" + strMonth + "/" + strDay + " F");
		} else if (intGenCheck == 3) {
			System.out.print("20" + strYear + "/" + strMonth + "/" + strDay + " M");
		} else if (intGenCheck == 4) {
			System.out.print("20" + strYear + "/" + strMonth + "/" + strDay + " F");
		}

	}
}
