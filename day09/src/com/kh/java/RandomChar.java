package com.kh.java;
 
import java.util.Random;
import java.util.Scanner;
 
public class RandomChar {
    public static void main(String[] args) {
 
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
 
        int horizontal = 0, vertical = 0;
        boolean isFlag = true, isFlag1 = true;
        while (isFlag) {
            System.out.print("가로행의 개수를 입력하세요(1~10) ==> ");
            horizontal = sc.nextInt();
            if (1 <= horizontal && horizontal <= 10) {
                isFlag = false;
            } else {
                System.out.println("**1부터 10까지만 입력하세요**");
                continue;
            }
        while (isFlag1) {
                System.out.print("세로행의 개수를 입력하세요(1~10) ==> ");
                vertical = sc.nextInt();
                if (1 <= vertical && vertical <= 10) {
                    isFlag1 = false;
                } else {
                    System.out.println("**1부터 10까지만 입력하세요**");
                    continue;
                }
            }
        }
 
        char[][] ch = new char[horizontal][vertical];
 
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < vertical; j++) {
                ch[i][j] = (char) ('a' + rd.nextInt(26));
            }
        }
        for (int i = 0; i < horizontal; i++) {
            for (int j = 0; j < vertical; j++) {
                System.out.print(ch[i][j] + " ");
 
            }
            System.out.println();
        }
 
    }
}
 