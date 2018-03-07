package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCPServerSoket {
	public TCPServerSoket() {

		Scanner sc = new Scanner(System.in);
		ServerSocket ssk = null;
		Socket csk = null;
		final int PORT = 5606;
		try {
			ssk = new ServerSocket(PORT); // server sokcet
			System.out.println("클라이언트 대기중...");
			csk = ssk.accept(); // client socket
			System.out.println(csk.getInetAddress() + " 클라이어트가 접속했습니다");
			OutputStream out = csk.getOutputStream();// out - main stream
			InputStream in = csk.getInputStream();
			DataOutputStream dos = new DataOutputStream(out); // slave stream
			dos.writeUTF("※ [알림]서버에 오신것을 환영합니다\n");// to client
			while (true) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
				String time = sdf.format(date);
				DataInputStream dis = new DataInputStream(in);
				String data = dis.readUTF();
				System.out.println(time + " 상대 -> " + data);
				System.out.print(time + " 나 -> ");
				String send = sc.nextLine();
				if(send.equals("exit")) {
					System.out.println("※ 종료합니다\n");
					dis.close();
				}
				dos.writeUTF(send);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				csk.close();
				ssk.close(); // client socket, server socket close
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
