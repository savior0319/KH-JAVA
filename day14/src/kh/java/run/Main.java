package kh.java.run;

import kh.java.control.Pntmgr;
import kh.java.model.vo.Gold;
import kh.java.model.vo.Silver;
import kh.java.model.vo.Vip;

public class Main {
	public static void main(String[] args) {
		Pntmgr mgr = new Pntmgr();
		mgr.insertData(new Silver("È«±æµ¿", "½Ç¹ö", 1000));
		mgr.insertData(new Silver("±è¸»¶Ë", "½Ç¹ö", 2000));
		mgr.insertData(new Silver("¶Ë¶ËÀÌ", "½Ç¹ö", 3000));
		mgr.insertData(new Gold("±èºÎÀå", "°ñµå", 3000));
		mgr.insertData(new Gold("¹ÚºÎÀå", "°ñµå", 3000));
		mgr.insertData(new Vip("ÃÖÈ¸Àå", "VIP", 3000));
		mgr.printData();
	}
}
