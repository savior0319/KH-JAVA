package kh.java.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sck = null;
		final String IP = "localhost";
		final int PORT = 9999;
		int num1, num2, num3;
//		HashSet<Integer> hSet = new HashSet<Integer>();

		try {
			sck = new Socket(IP, PORT);
			InputStream in = sck.getInputStream();
			OutputStream out = sck.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			String receive = dis.readUTF();
			System.out.println(receive);
			while (true) {

				System.out.println("세 수를 입력 해주세요<ex: 1 2 3>");
				
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				num3 = sc.nextInt();

//				while (hSet.size() < 3) {
//					int temp = sc.nextInt();
//					if (hSet.add(temp) == true) {
//						hSet.add(temp);
//					} else {
//						System.out.println("※ 중복된 숫자 입니다");
//						hSet.clear();
//					}
//				}
//
//				Iterator<Integer> it = hSet.iterator();
//				num1 = it.next();
//				num2 = it.next();
//				num3 = it.next();

				String num1Str = String.valueOf(num1);
				String num2Str = String.valueOf(num2);
				String num3Str = String.valueOf(num3);
				dos.writeUTF(num1Str + num2Str + num3Str);
				String receiveChk = dis.readUTF();
				String[] sbStr = new String[2];
				sbStr = receiveChk.split("");
				int[] sbInt = new int[2];
				
				for (int i = 0; i < sbInt.length; i++) {
					sbInt[i] = Integer.parseInt(sbStr[i]);
				}

				if (sbInt[0] != 3) {
					System.out.println(sbInt[0] + " 스트라이크 " + sbInt[1] + " 볼");
				} else if (sbInt[0] == 3) {
					System.out.println("※ 정답입니다 종료합니다!");
					dis.close();
					dos.close();
					return;
				}
			}
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sck.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
