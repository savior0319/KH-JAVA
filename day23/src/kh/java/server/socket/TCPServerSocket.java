package kh.java.server.socket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCPServerSocket {
	public TCPServerSocket() {
		Scanner sc = new Scanner(System.in);
		ServerSocket ssk = null;
		Socket csk = null;
		final int PORT = 5606;
		Date serverStartDate = new Date();
		SimpleDateFormat serverStartSdf = new SimpleDateFormat("[HH:mm:ss]");
		String serverStartTime = serverStartSdf.format(serverStartDate);
		try {
			System.out.print(serverStartTime + " Ŭ���̾�Ʈ ���� �����");
			try {
				for (int i = 0; i < 5; i++) {
					System.out.print(".");
					Thread.sleep(300);
				}
			} catch (InterruptedException e) {
				System.out.print(e.getMessage());
			}
			ssk = new ServerSocket(PORT);
			csk = ssk.accept();
			Date clientJoinDate = new Date();
			SimpleDateFormat clientJoinSdf = new SimpleDateFormat("[HH:mm:ss]");
			String clientJoinTime = clientJoinSdf.format(clientJoinDate);
			System.out.println("\n" + clientJoinTime + " " + csk.getInetAddress() + " Ŭ���̾�Ʈ�� ä�ü����� �����߽��ϴ�");
			OutputStream out = csk.getOutputStream();
			InputStream in = csk.getInputStream();
			DataOutputStream dos = new DataOutputStream(out);
			DataInputStream dis = new DataInputStream(in);
			dos.writeUTF("�� [�˸�]ä�� ������ �����߽��ϴ�!");
			while (true) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
				String nowTime = sdf.format(date);
				String receive = dis.readUTF();
				if (receive.equals("exit")) {
					System.out.println("�� �����մϴ�\n");
					dis.close();
				}
				System.out.println(nowTime + " ��� -> " + receive);
				System.out.print(nowTime + " �� -> ");
				String send = sc.nextLine();
				if (send.equals("exit")) {
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
				ssk.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
