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
			System.out.println("\n1. �л� ���� �Է� ");
			System.out.println("2. �л� ���� ��� ");
			System.out.println("3. ���� ");
			System.out.println("4. �ҷ�����");
			System.out.print("���� >> ");
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
				System.out.println("\n�� �ε�Ϸ�\n");
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
			System.out.println("�� ����Ϸ�\n");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void print() {
		System.out.println("\n�̸� : " + sv.getName() + "\n���� : " + sv.getAge() + "\n�ּ� : " + sv.getAddr() + "\n");
	}

	public void insert() {
		sv = new SerializableVO("ȫ�浿", 20, "��⵵");
	}
}
