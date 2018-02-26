/*
   1. ???�� 물색 -> 모니?��
   2. 추상?�� -> 
   ## ?��?�� ##
       ?��?���?, ?��?��?��, 모델�?, �?�?, ?��조회?��
   ## 기능 ##
       출력, ?��?��
*/
package com.kh.java_12;

import java.util.Scanner;

public class Monitor {
	Scanner sc = new Scanner(System.in);
	double inch; // ?��?���?
	int resolution, price; // ?��?��?�� �?�?
	String modelName, factory; // 모델�? ?��조회?��
	boolean power = false; // ?��?��

	public void menu() {
		System.out.println("\n---------------메뉴---------------");
		System.out.println("1. ?��?�� on/off");
		System.out.println("2. 모니?�� ?���? 보기");
		System.out.println("3. 모니?�� ?���? ?��?��");
		System.out.println("4. 출력");
		System.out.print("?��?�� >> ");
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
		System.out.print("?��?��즈�?? ?��?��?��?��?�� (?��?�� - inch) : ");
		inch = sc.nextDouble();
		System.out.print("?��?��?���? ?��?��?��?��?��  : ");
		resolution = sc.nextInt();
		sc.nextLine();
		System.out.print("모델명을 ?��?��?��?��?�� : ");
		modelName = sc.nextLine();
		System.out.print("�?격을 ?��?��?��?��?�� : ");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("?��조회?���? ?��?��?��?��?�� : ");
		factory = sc.nextLine();
	}

	public void print() {
		if (power == true) {
			System.out.print("?��_?�� \r\n" + 
					"?? ＼＼  ?�＿?? \r\n" + 
					"???? �? ('?��')  ?��?���? \r\n" + 
					"?????? >???��?�� \r\n" + 
					"??????/ ?? ?���? \r\n" + 
					"???? /????/??＼＼ \r\n" + 
					"????/???��????  �? _?�� \r\n" + 
					"????/??/ ?��?���? \r\n" + 
					"?? /??/| \r\n" + 
					"??(??(  \r\n" + 
					"??|??|?�＼ \r\n" + 
					"??| | �? ?��) \r\n" + 
					"??| |????) / \r\n" + 
					"(`?�� )????L/");
		} else
			System.out.println("?��?�� 모니?���? off ?��?��?��?��?��\n모니?�� ?��?��?�� on ?��주시�? ?��?��?��주세?��\n\n");
	}

	public void monitorInfo() {
		if (power == true) {
			System.out.println("\n---------------------------------------------");
			System.out.println("?��조회?��\t모델�?\t?��?���?\t?��?��?��\t�?�?\t");
			System.out.println(factory + "\t" + modelName + "\t" + inch + "\t" + resolution + "\t" + price);
			System.out.println("---------------------------------------------");
		} else
			System.out.println("?��?�� 모니?���? off ?��?��?��?��?��\n모니?�� ?��?��?�� on ?��주시�? ?��?��?��주세?��\n\n");
	}

	public void onOffButton() {
		if (power == false) {
			power = true;
			System.out.println("?��?��?�� on ?��?��?��?��?��\n");
		} else {
			power = false;
			System.out.println("?��?�� off ?��?��?��?��?��\n");
		}
	}
}
