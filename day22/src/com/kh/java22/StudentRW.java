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
			System.out.println("���������������� �޴� ����������������");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ��������(save)");
			System.out.println("4. �����ҷ�����(load)");
			System.out.println("0. ����");
			System.out.println("����������������������������������������");
			System.out.print("�޴����� >> ");
			switch (sc.nextInt()) {
			case 1:insert();break;
			case 2:print();break;
			case 3:save();break;
			case 4:load();break;
			case 0:System.out.println("\n�� �����մϴ�");return;
			default:System.out.println("\n�� �޴��� �߸��Է��߽��ϴ�\n");break;
			}
		}
	}

	public void load() {
		try {
			br = new BufferedReader(new FileReader(stvo.getDesktopPath()));
			System.out.println("\n�� ������ �ҷ��Խ��ϴ�\n");
		} catch (FileNotFoundException e) {
			System.out.println("\n�� �ҷ��� ������ �����ϴ�\n");
		} 
	}

	public void save() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(stvo.getDesktopPath()));
			String str = stvo.getName() + "/" + stvo.getAge() + "/" + stvo.getAddress();
			bw.write(str);
			bw.close();
			System.out.println("\n�� ����Ǿ����ϴ�\n");
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
					System.out.println("\n�̸� : " + str[0]);
					System.out.println("���� : " + str[1]);
					System.out.println("�ּ� : " + str[2] + "\n");
				}
			}
		} else if (br == null && stvo.getName() != null) {
			System.out.println("\n�̸� : " + stvo.getName());
			System.out.println("���� : " + stvo.getAge());
			System.out.println("�ּ� : " + stvo.getAddress() + "\n");
		} else if (stvo.getName() == null) {
			System.out.println("\n�� ����� ������ �����ϴ�\n");
		}
		try {br.close();} 
		catch (IOException e) {}
	}

	public void insert() {
		System.out.print("�̸��� �Է��ϼ��� -> ");
		stvo.setName(sc.next());
		System.out.print("������ �Է��ϼ��� -> ");
		stvo.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("�ּ��� �Է��ϼ��� -> ");
		stvo.setAddress(sc.nextLine());
		System.out.println("\n�� �ԷµǾ����ϴ�\n");
	}
}
