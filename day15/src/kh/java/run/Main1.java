package kh.java.run;

import kh.java.controller.PointMgr;
import kh.java.model.vo.*;

public class Main1 {
	public static void main(String[] args) {
		PointMgr mgr = new PointMgr();
		mgr.insertData(new Bronze("����", "�����", 1000));
		mgr.insertData(new Silver1("ġŲ", "�ǹ�", 1000));
		mgr.insertData(new Silver1("�ܹ���", "�ǹ�", 2000));
		mgr.insertData(new Silver1("�Ұ��", "�ǹ�", 3000));
		mgr.insertData(new Gold1("����", "���", 2000));
		mgr.insertData(new Gold1("�����", "���", 3000));
		mgr.insertData(new VIP1("������", "VIP", 3000));
		mgr.insertData(new VVIP("����", "VVIP", 3000));
		mgr.printData();
//		Grade g1;
//		g1 = new Silver();
//		//g1.Interest();
//		((Silver)g1).Interest(); // �ٿ�ĳ����
	}
}
