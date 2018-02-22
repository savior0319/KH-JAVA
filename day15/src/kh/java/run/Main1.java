package kh.java.run;

import kh.java.controller.PointMgr;
import kh.java.model.vo.*;

public class Main1 {
	public static void main(String[] args) {
		PointMgr mgr = new PointMgr();
		mgr.insertData(new Bronze("1", "브론즈", 1000));
		mgr.insertData(new Silver1("2", "실버", 1000));
		mgr.insertData(new Silver1("3", "실버", 2000));
		mgr.insertData(new Silver1("4", "실버", 3000));
		mgr.insertData(new Gold1("5", "골드", 2000));
		mgr.insertData(new Gold1("6", "골드", 3000));
		mgr.insertData(new VIP1("7", "VIP", 3000));
		mgr.insertData(new VVIP("8", "VVIP", 3000));
		mgr.printData();
//		Grade g1;
//		g1 = new Silver();
//		//g1.Interest();
//		((Silver)g1).Interest(); // 다운캐스팅
	}
}
