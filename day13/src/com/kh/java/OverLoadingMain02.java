package com.kh.java;

public class OverLoadingMain02 {
	public static void main(String[] args) {
		OverLoadingClass02 olc1 = new OverLoadingClass02("ȫ�浿", 20, "��⵵ ��õ", "�");
		OverLoadingClass02 olc2 = new OverLoadingClass02("�踻��", 30, "��⵵ ��õ");
		OverLoadingClass02 olc3 = new OverLoadingClass02("��浿");
		olc1.printData();
		olc2.printData();
		olc3.printData();
	}
}
