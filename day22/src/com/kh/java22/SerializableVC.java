package com.kh.java22;

import java.io.*;
import java.util.Scanner;

public class SerializableVC {

	private SerializableVO sv;
	private Scanner sc = new Scanner(System.in);
	private final String desktopPath = System.getProperty("user.home") + "/Desktop/StudentObject.txt";

	public SerializableVC() {
	}

	public void start() {
		while (true) {
			System.out.println("\n1. 학생 정보 입력 ");
			System.out.println("2. 학생 정보 출력 ");
			System.out.println("3. 저장 ");
			System.out.println("4. 불러오기");
			System.out.print("선택 >> ");
			switch (sc.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				print();
				break;
			case 3:
				save();
				break;
			case 4:
				load();
				break;
			case 0:
				return;
			}
		}
	}

	public void load() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(desktopPath))) {
			try {
				sv = (SerializableVO) (ois.readObject());
				System.out.println("\n※ 로드완료\n");
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void save() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(desktopPath))) {
			oos.writeObject(sv);
			System.out.println("※ 저장완료\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void print() {
		System.out.println("\n이름 : " + sv.getName() + "\n나이 : " + sv.getAge() + "\n주소 : " + sv.getAddr() + "\n");
	}

	public void insert() {
		sv = new SerializableVO("홍길동", 20, "경기도");
	}
}
