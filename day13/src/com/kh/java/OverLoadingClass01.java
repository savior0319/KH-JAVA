package com.kh.java;

public class OverLoadingClass01 {
	public void overLoadMethod() {
		System.out.println("�ȳ��ϼ��� �׽�Ʈ �޼ҵ� �Դϴ�");
	}

	public void overLoadMethod(int a) {
		System.out.println("ȣ�� ���� " + a + "�Դϴ�");
	}

	public void overLoadMethod(int a, int b) {
		System.out.println("2���� ���� " + a + "��" + b + "�̸� ���� ���� " + (a + b) + "�Դϴ�");
	}
}
