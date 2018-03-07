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
			System.out.println(csk.getInetAddress() + " Ŭ���̾�Ʈ�� �����߽��ϴ�");
			OutputStream out = csk.getOutputStream();// out
			DataOutputStream dos = new DataOutputStream(out); // slave stream
			dos.writeUTF("�� [�˸�]������ ���Ű��� ȯ���մϴ�\n");// to client
			System.out.println("\n�� �޼��� ���� �Ϸ�\n");
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
