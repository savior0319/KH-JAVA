package kh.java.controller;

import kh.java.model.vo.*;

public class PointMgr {
	private Grade[] gd = new Grade[10];
	private int index = 0;
	public PointMgr() {}
	
	public void insertData(Grade gd) {
		this.gd[index++] = gd;
	}

	public void printData() {
		System.out.println("����������������������������������������������INFORMATION����������������������������������������������");
		System.out.println("�̸�\t\t���\t\t����Ʈ\t\t��������Ʈ");
		for(int i = 0; i < index; i++) {
			System.out.println(gd[i].getName() + "\t\t" + gd[i].getGrade() +"\t\t" 
							 + gd[i].getpoint() + "\t\t" + gd[i].getInterest());
		}	
		System.out.println("������������������������������������������������������������������������������������������������������������������");
		}
}
