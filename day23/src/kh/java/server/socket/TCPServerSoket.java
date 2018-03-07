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
			ssk = new ServerSocket(PORT);
			System.out.println("Ŭ���̾�Ʈ �����...");
			csk = ssk.accept(); 
			System.out.println(csk.getInetAddress() + " Ŭ���̾�Ʈ�� �����߽��ϴ�");
			OutputStream out = csk.getOutputStream();//
			InputStream in = csk.getInputStream();
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("�� [�˸�]ä�� ������ �����߽��ϴ�!\n");
			while (true) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
				String time = sdf.format(date);
				DataInputStream dis = new DataInputStream(in);
				String data = dis.readUTF();
				System.out.println(time + " ��� -> " + data);
				System.out.print(time + " �� -> ");
				String send = sc.nextLine();
				if(send.equals("exit")) {
					System.out.println("�� �����մϴ�\n");
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
