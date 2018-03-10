package kh.java.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Iterator;

public class BaseballServer {
	public static void main(String[] args) {
		ServerSocket ssk = null;
		Socket csk = null;
		final int PORT = 9999;
		int strike = 0;
		int ball = 0;
		HashSet<Integer> hSet = new HashSet<Integer>();
		while (hSet.size() < 3) {
			hSet.add((int) (Math.random() * 9) + 1);
		}
		Iterator<Integer> it = hSet.iterator();
		int ranNum[] = new int[3];
		for (int i = 0; i < 3; i++) {
			ranNum[i] = it.next();
		}
		try {
			System.out.println("클라이언트 접속 대기 중...");
			System.out.println("서버 숫자 -> " + ranNum[0] + " " + ranNum[1] + " " + ranNum[2]);
			ssk = new ServerSocket(PORT);
			csk = ssk.accept();
			System.out.println(csk.getInetAddress() + "가 서버에 접속했습니다");
			System.out.println("야구 게임시작");
			InputStream in = csk.getInputStream();
			OutputStream out = csk.getOutputStream();
			DataInputStream dis = new DataInputStream(in);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("※ 서버에 접속했습니다\n 야구게임을 시작합니다");
			while (true) {
				String receive = dis.readUTF();
				String[] receiveSplit = receive.split("");
				int[] receiveInt = new int[3];
				for (int i = 0; i < receiveInt.length; i++) {
					receiveInt[i] = Integer.parseInt(receiveSplit[i]);
				}
				System.out.println("클라이언트가 입력한 수 -> " + receiveInt[0] + " " + receiveInt[1] + " " + receiveInt[2]);
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (i != j) {
							if (ranNum[i] == receiveInt[j]) {
								ball++;
							}
						} else if (ranNum[i] == receiveInt[j]) {
							strike++;
						}
					}
				}
				String send = strike + "" + ball;
				dos.writeUTF(send);
				System.out.print(strike + " 스트라이크 ");
				System.out.println(ball + " 볼");
				if (strike == 3) {
					System.out.println("※ 클라이언트가 정답을 맞췄습니다\n 종료합니다!");
					dos.close();
					dis.close();
					return;
				}
				ball = 0;
				strike = 0;
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				ssk.close();
				csk.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
