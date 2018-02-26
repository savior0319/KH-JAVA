/*
   1. ???ƒ ë¬¼ìƒ‰ -> ëª¨ë‹ˆ?„°
   2. ì¶”ìƒ?™” -> 
   ## ?†?„± ##
       ?‚¬?´ì¦?, ?•´?ƒ?„, ëª¨ë¸ëª?, ê°?ê²?, ? œì¡°íšŒ?‚¬
   ## ê¸°ëŠ¥ ##
       ì¶œë ¥, ? „?›
*/
package com.kh.java_12;

import java.util.Scanner;

public class Monitor {
	Scanner sc = new Scanner(System.in);
	double inch; // ?‚¬?´ì¦?
	int resolution, price; // ?•´?ƒ?„ ê°?ê²?
	String modelName, factory; // ëª¨ë¸ëª? ? œì¡°íšŒ?‚¬
	boolean power = false; // ? „?›

	public void menu() {
		System.out.println("\n---------------ë©”ë‰´---------------");
		System.out.println("1. ? „?› on/off");
		System.out.println("2. ëª¨ë‹ˆ?„° ? •ë³? ë³´ê¸°");
		System.out.println("3. ëª¨ë‹ˆ?„° ? •ë³? ?…? ¥");
		System.out.println("4. ì¶œë ¥");
		System.out.print("?„ ?ƒ >> ");
	}

	public void start() {
		monitorInfoIn();
		while (true) {
			menu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				onOffButton();
				break;
			case 2:
				monitorInfo();
				break;
			case 3:
				monitorInfoIn();
				break;
			case 4:
				print();
				break;
			}
		}
	}

	public void monitorInfoIn() {
		System.out.print("?‚¬?´ì¦ˆë?? ?…? ¥?•˜?„¸?š” (?‹¨?œ„ - inch) : ");
		inch = sc.nextDouble();
		System.out.print("?•´?ƒ?„ë¥? ?…? ¥?•˜?„¸?š”  : ");
		resolution = sc.nextInt();
		sc.nextLine();
		System.out.print("ëª¨ë¸ëª…ì„ ?…? ¥?•˜?„¸?š” : ");
		modelName = sc.nextLine();
		System.out.print("ê°?ê²©ì„ ?…? ¥?•˜?„¸?š” : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("? œì¡°íšŒ?‚¬ë¥? ?…? ¥?•˜?„¸?š” : ");
		factory = sc.nextLine();
	}

	public void print() {
		if (power == true) {
			System.out.print("?Š‚_?ƒ½ \r\n" + 
					"?? ï¼¼ï¼¼  ?›ï¼¿?? \r\n" + 
					"???? ï¼? ('?……')  ?‘?‘ ì¹? \r\n" + 
					"?????? >???Œ’?ƒ½ \r\n" + 
					"??????/ ?? ?¸ï¼? \r\n" + 
					"???? /????/??ï¼¼ï¼¼ \r\n" + 
					"????/???ƒ????  ï¼? _?¤ \r\n" + 
					"????/??/ ?‘?‘ ì¹? \r\n" + 
					"?? /??/| \r\n" + 
					"??(??(  \r\n" + 
					"??|??|?ï¼¼ \r\n" + 
					"??| | ï¼? ?Œ’) \r\n" + 
					"??| |????) / \r\n" + 
					"(`?ƒ )????L/");
		} else
			System.out.println("?˜„?¬ ëª¨ë‹ˆ?„°ê°? off ?ƒ?ƒœ?…?‹ˆ?‹¤\nëª¨ë‹ˆ?„° ? „?›?„ on ?•´ì£¼ì‹œê³? ?‹¤?–‰?•´ì£¼ì„¸?š”\n\n");
	}

	public void monitorInfo() {
		if (power == true) {
			System.out.println("\n---------------------------------------------");
			System.out.println("? œì¡°íšŒ?‚¬\tëª¨ë¸ëª?\t?‚¬?´ì¦?\t?•´?ƒ?„\tê°?ê²?\t");
			System.out.println(factory + "\t" + modelName + "\t" + inch + "\t" + resolution + "\t" + price);
			System.out.println("---------------------------------------------");
		} else
			System.out.println("?˜„?¬ ëª¨ë‹ˆ?„°ê°? off ?ƒ?ƒœ?…?‹ˆ?‹¤\nëª¨ë‹ˆ?„° ? „?›?„ on ?•´ì£¼ì‹œê³? ?‹¤?–‰?•´ì£¼ì„¸?š”\n\n");
	}

	public void onOffButton() {
		if (power == false) {
			power = true;
			System.out.println("? „?›?´ on ?˜?—ˆ?Šµ?‹ˆ?‹¤\n");
		} else {
			power = false;
			System.out.println("? „?› off ?˜?—ˆ?Šµ?‹ˆ?‹¤\n");
		}
	}
}
