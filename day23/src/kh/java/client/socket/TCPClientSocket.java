package kh.java.client.socket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCPClientSocket {
	public TCPClientSocket() {
		Scanner sc = new Scanner(System.in);
		final int PORT = 5606;
		final String SERVER_IP = "localhost";
		Socket csk = null;
		try {
			csk = new Socket(SERVER_IP, PORT);
			System.out.println("�� ä�� ������ ���ӵǾ����ϴ�!");
			InputStream in = csk.getInputStream();
			OutputStream out = csk.getOutputStream();
			while (true) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
				String nowTime = sdf.format(date);
				DataInputStream dis = new DataInputStream(in);
				DataOutputStream dos = new DataOutputStream(out);
				String receive = dis.readUTF();
				if(receive.equals("exit")) {
					System.out.println("�� �����մϴ�\n");
					dis.close();
				}
				System.out.println(nowTime + " ��� -> " + receive);
				System.out.print(nowTime + " �� -> ");
				String send = sc.nextLine();
				if(send.equals("exit")) {
					System.out.println("�� �����մϴ�\n");
					dis.close();
				}
				dos.writeUTF(send);
			}
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				csk.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
