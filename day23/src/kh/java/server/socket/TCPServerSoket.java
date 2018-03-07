package kh.java.server.socket;

import java.io.*;
import java.net.*;

public class TCPServerSoket {
	public TCPServerSoket() {
		ServerSocket ssk = null;
		Socket csk = null;
		final int PORT = 5606;
		try {
			ssk = new ServerSocket(PORT); // server sokcet
			System.out.println("PORT LISTEN!!");
			csk = ssk.accept(); // client socket
			System.out.println(csk.getInetAddress() + " 클라이어트가 접속했습니다");
			OutputStream out = csk.getOutputStream();// out
			DataOutputStream dos = new DataOutputStream(out); // slave stream
			dos.writeUTF("※ [알림]서버에 오신것을 환영합니다\n");// to client
			System.out.println("\n※ 메세지 전송 완료\n");
			dos.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				csk.close();
				ssk.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
