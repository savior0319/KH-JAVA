package com.kh.java;

import java.util.Scanner;

public class Switch_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���б� ���� �ý����Դϴ�\n");
		System.out.print("�л� ������ �Է����ּ��� : ");
		
		char grade = sc.next().charAt(0); // grade ������ ���� �Է�
		
		switch(grade) {
		case 'A' : // A�� ��
			System.out.println("�����ϼ̽��ϴ�. ���б��� 100% �����ص帮�ڽ��ϴ�");
			break;
		case 'B' : // B�� ��
			System.out.println("�ణ �ƽ��׿�. ���б� 50% �����Դϴ�");
			break;
		case 'C' : // C�� ��
			System.out.println("�̹� �б� ���б��� ���׿�... ��������");
			break;
		case 'D' : // D�� ��
			System.out.println("�а�� ���ϼ̳׿�... ����ϼ���");
			break;
		case 'F' : // F�� ��
			System.out.println("�̹��б�� �а� �����̽��ϴ�");
		}
	}
}
