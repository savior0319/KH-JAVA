package kh.java.run;

import kh.java.controller.PointMgr;
import kh.java.model.vo.*;

public class Main1 {
	public static void main(String[] args) {
		PointMgr mgr = new PointMgr();
		mgr.insertData(new Bronze("피자", "브론즈", 1000));
		mgr.insertData(new Silver1("치킨", "실버", 1000));
		mgr.insertData(new Silver1("햄버거", "실버", 2000));
		mgr.insertData(new Silver1("소고기", "실버", 3000));
		mgr.insertData(new Gold1("족발", "골드", 2000));
		mgr.insertData(new Gold1("갈비살", "골드", 3000));
		mgr.insertData(new VIP1("항정살", "VIP", 3000));
		mgr.insertData(new VVIP("삼겹살", "VVIP", 3000));
		mgr.printData();
//		Grade g1;
//		g1 = new Silver();
//		//g1.Interest();
//		((Silver)g1).Interest(); // 다운캐스팅
	}
}
