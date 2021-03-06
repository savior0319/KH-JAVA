/*
   1. ??? λ¬Όμ -> λͺ¨λ?°
   2. μΆμ? -> 
   ## ??± ##
       ?¬?΄μ¦?, ?΄??, λͺ¨λΈλͺ?, κ°?κ²?, ? μ‘°ν?¬
   ## κΈ°λ₯ ##
       μΆλ ₯, ? ?
*/
package com.kh.java_12;

import java.util.Scanner;

public class Monitor {
	Scanner sc = new Scanner(System.in);
	double inch; // ?¬?΄μ¦?
	int resolution, price; // ?΄?? κ°?κ²?
	String modelName, factory; // λͺ¨λΈλͺ? ? μ‘°ν?¬
	boolean power = false; // ? ?

	public void menu() {
		System.out.println("\n---------------λ©λ΄---------------");
		System.out.println("1. ? ? on/off");
		System.out.println("2. λͺ¨λ?° ? λ³? λ³΄κΈ°");
		System.out.println("3. λͺ¨λ?° ? λ³? ?? ₯");
		System.out.println("4. μΆλ ₯");
		System.out.print("? ? >> ");
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
		System.out.print("?¬?΄μ¦λ?? ?? ₯??Έ? (?¨? - inch) : ");
		inch = sc.nextDouble();
		System.out.print("?΄??λ₯? ?? ₯??Έ?  : ");
		resolution = sc.nextInt();
		sc.nextLine();
		System.out.print("λͺ¨λΈλͺμ ?? ₯??Έ? : ");
		modelName = sc.nextLine();
		System.out.print("κ°?κ²©μ ?? ₯??Έ? : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("? μ‘°ν?¬λ₯? ?? ₯??Έ? : ");
		factory = sc.nextLine();
	}

	public void print() {
		if (power == true) {
			System.out.print("?_?½ \r\n" + 
					"?? οΌΌοΌΌ  ?οΌΏ?? \r\n" + 
					"???? οΌ? ('?')  ?? μΉ? \r\n" + 
					"?????? >????½ \r\n" + 
					"??????/ ?? ?ΈοΌ? \r\n" + 
					"???? /????/??οΌΌοΌΌ \r\n" + 
					"????/???????  οΌ? _?€ \r\n" + 
					"????/??/ ?? μΉ? \r\n" + 
					"?? /??/| \r\n" + 
					"??(??(  \r\n" + 
					"??|??|?οΌΌ \r\n" + 
					"??| | οΌ? ?) \r\n" + 
					"??| |????) / \r\n" + 
					"(`? )????L/");
		} else
			System.out.println("??¬ λͺ¨λ?°κ°? off ?????€\nλͺ¨λ?° ? ?? on ?΄μ£Όμκ³? ?€??΄μ£ΌμΈ?\n\n");
	}

	public void monitorInfo() {
		if (power == true) {
			System.out.println("\n---------------------------------------------");
			System.out.println("? μ‘°ν?¬\tλͺ¨λΈλͺ?\t?¬?΄μ¦?\t?΄??\tκ°?κ²?\t");
			System.out.println(factory + "\t" + modelName + "\t" + inch + "\t" + resolution + "\t" + price);
			System.out.println("---------------------------------------------");
		} else
			System.out.println("??¬ λͺ¨λ?°κ°? off ?????€\nλͺ¨λ?° ? ?? on ?΄μ£Όμκ³? ?€??΄μ£ΌμΈ?\n\n");
	}

	public void onOffButton() {
		if (power == false) {
			power = true;
			System.out.println("? ??΄ on ???΅??€\n");
		} else {
			power = false;
			System.out.println("? ? off ???΅??€\n");
		}
	}
}
