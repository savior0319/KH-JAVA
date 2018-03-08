package kh.java.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Socket sck = null;
		final String IP = "localhost";
		final int PORT = 9999;
		int num1, num2, num3;

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
				System.out.println(sbInt[0] + " 스트라이크 " + sbInt[1] + " 볼");
				if (sbInt[0] == 3) {
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
