package com.kh.java;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random rd = new Random();

		//System.out.println((int)(Math.random()*10));
		System.out.println("0~9까지의 수  :" + rd.nextInt(10));
		System.out.println("1~10까지의 수  :" + rd.nextInt(10)+1);
		System.out.println("20~35까지의 수  :" + (rd.nextInt(16)+20) );
		System.out.println("0 또는 1 : " + rd.nextInt(2));
		}
}
