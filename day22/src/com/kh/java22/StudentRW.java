package com.kh.java22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentRW {

	private Scanner sc = new Scanner(System.in);
	private studentVO stvo = new studentVO();
	private BufferedReader br = null;
	
	public StudentRW() {
		while (true) {
			System.out.println("──────── 메뉴 ────────");
			System.out.println("1. 정보입력");
			System.out.println("2. 정보출력");
			System.out.println("3. 정보저장(save)");
			System.out.println("4. 정보불러오기(load)");
			System.out.println("0. 종료");
			System.out.println("────────────────────");
			System.out.print("메뉴선택 >> ");
			switch (sc.nextInt()) {
			case 1:insert();break;
			case 2:print();break;
			case 3:save();break;
			case 4:load();break;
			case 0:System.out.println("\n※ 종료합니다");return;
			default:System.out.println("\n※ 메뉴를 잘못입력했습니다\n");break;
			}
		}
	}

	public void load() {
		try {
			br = new BufferedReader(new FileReader(stvo.getDesktopPath()));
			System.out.println("\n※ 정보를 불러왔습니다\n");
		} catch (FileNotFoundException e) {
			System.out.println("\n※ 불러올 파일이 없습니다\n");
		} 
	}

	public void save() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(stvo.getDesktopPath()));
			String str = stvo.getName() + "/" + stvo.getAge() + "/" + stvo.getAddress();
			bw.write(str);
			bw.close();
			System.out.println("\n※ 저장되었습니다\n");
		} catch (IOException e) {}
	}

	public void print() {
		if (br != null) {
			String strRead = null;
			while (true) {
				try {
					strRead = br.readLine();
				} catch (IOException e) {}
				if (strRead == null)
					break;
				else {
					String str[] = strRead.split("/");
					System.out.println("\n이름 : " + str[0]);
					System.out.println("나이 : " + str[1]);
					System.out.println("주소 : " + str[2] + "\n");
				}
			}
		} else if (br == null && stvo.getName() != null) {
			System.out.println("\n이름 : " + stvo.getName());
			System.out.println("나이 : " + stvo.getAge());
			System.out.println("주소 : " + stvo.getAddress() + "\n");
		} else if (stvo.getName() == null) {
			System.out.println("\n※ 저장된 정보가 없습니다\n");
		}
		try {br.close();} 
		catch (IOException e) {}
	}

	public void insert() {
		System.out.print("이름을 입력하세요 -> ");
		stvo.setName(sc.next());
		System.out.print("나이을 입력하세요 -> ");
		stvo.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("주소을 입력하세요 -> ");
		stvo.setAddress(sc.nextLine());
		System.out.println("\n※ 입력되었습니다\n");
	}
}
