package com.kh.hashmapStudent;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

public class Controller {
	private Properties ppt = new Properties();
	private HashMap<Integer, Student> hMap = new HashMap<Integer, Student>();
	private Scanner sc = new Scanner(System.in);
	public Controller() { 
		
//		try {
//			ppt.load(new FileReader("resource/test.Properties"));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
	
	public void start() {
		
		
		while (true) {
			System.out.println("���������������������� �л����� ��������������������");
			System.out.println("1. �л� ���� �Է�");
			System.out.println("2. �л� ���� ���");
			System.out.println("3. �л� ���� �˻�");
			System.out.println("4. �л� ���� ����");
			System.out.println("5. ���α׷� ����");
			System.out.println("0. ���α׷� ����");
			System.out.println("������������������������������������������������������");
			System.out.print("�޴� ���� >> ");
			switch (sc.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				view();
				break;
			case 3:
				//search();
				break;
			case 4:
				//update();
				break;
			case 5:
				//delete();
				break;
			case 0:
				System.out.println("\n�� ���� �մϴ�");
				return;
			}
		}
	}

	private void view() {
		Iterator<Integer> it = hMap.keySet().iterator();
		System.out.println("\n������������������������ ��ü ��ȸ ����������������������");
		System.out.println("�й�\t\t�̸�\t����");
		while (it.hasNext()) {
			System.out.println(hMap.get(it.next()));
		}
		System.out.println("������������������������������������������������������������");

	}

	private void insert() {
		System.out.print("�л� �й� �Է� : ");
		int classNumber = sc.nextInt();
		if (hMap.containsKey(classNumber) == true) {
			System.out.println("\n�� �ش� �й��� �̹� �ֽ��ϴ�");
			return;
		}
		System.out.print("�л� �̸� �Է� : ");
		String name = sc.next();
		System.out.print("�л� ���� �Է� : ");
		int age = sc.nextInt();
		hMap.put(classNumber, new Student(classNumber, name, age));
		System.out.println("\n�� �Է��� �Ϸ� �Ǿ����ϴ�\n");
	}
}
