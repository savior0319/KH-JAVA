package com.java.hw;

import java.util.Random;

public class Ex7 {

	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("0~45 까지 랜덤 : " + (rd.nextInt(46)));
		System.out.println("1~55 까지 랜덤 : " + (rd.nextInt(55) + 1));
		System.out.println("23~45 까지 랜덤 : " + (rd.nextInt(23) + 23));
		System.out.println("55~80 까지 랜덤 : " + (rd.nextInt(26) + 55));
		System.out.println("17~50 까지 랜덤 : " + (rd.nextInt(34) + 17));
		System.out.println("34~40 까지 랜덤 : " + (rd.nextInt(7) + 34));
		System.out.println("80~120 까지 랜덤 : " + (rd.nextInt(41) + 80));
	}

}
