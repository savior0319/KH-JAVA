package kh.java.run;

import kh.java.controller.PointMgr;
import kh.java.model.vo.*;

public class Main1 {
	public static void main(String[] args) {
		PointMgr mgr = new PointMgr();
		mgr.insertData(new Bronze("1", "�����", 1000));
		mgr.insertData(new Silver1("2", "�ǹ�", 1000));
		mgr.insertData(new Silver1("3", "�ǹ�", 2000));
		mgr.insertData(new Silver1("4", "�ǹ�", 3000));
		mgr.insertData(new Gold1("5", "���", 2000));
		mgr.insertData(new Gold1("6", "���", 3000));
		mgr.insertData(new VIP1("7", "VIP", 3000));
		mgr.insertData(new VVIP("8", "VVIP", 3000));
		mgr.printData();
//		Grade g1;
//		g1 = new Silver();
//		//g1.Interest();
//		((Silver)g1).Interest(); // �ٿ�ĳ����
	}
}
