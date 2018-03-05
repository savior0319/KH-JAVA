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
			System.out.println("─────────── 학생관리 ──────────");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 변경");
			System.out.println("5. 프로그램 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.println("───────────────────────────");
			System.out.print("메뉴 선택 >> ");
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
				System.out.println("\n※ 종료 합니다");
				return;
			}
		}
	}

	private void view() {
		Iterator<Integer> it = hMap.keySet().iterator();
		System.out.println("\n──────────── 전체 조회 ───────────");
		System.out.println("학번\t\t이름\t나이");
		while (it.hasNext()) {
			System.out.println(hMap.get(it.next()));
		}
		System.out.println("──────────────────────────────");

	}

	private void insert() {
		System.out.print("학생 학번 입력 : ");
		int classNumber = sc.nextInt();
		if (hMap.containsKey(classNumber) == true) {
			System.out.println("\n※ 해당 학번은 이미 있습니다");
			return;
		}
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		hMap.put(classNumber, new Student(classNumber, name, age));
		System.out.println("\n※ 입력이 완료 되었습니다\n");
	}
}
