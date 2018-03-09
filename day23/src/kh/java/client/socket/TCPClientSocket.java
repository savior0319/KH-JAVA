package kh.java.client.socket;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TCPClientSocket implements Runnable {
	Thread t;

	public TCPClientSocket() {
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try {
				Scanner sc = new Scanner(System.in);
				final int PORT = 49318;
				final String SERVER_IP = "192.168.10.43";
				Socket csk = null;
				try {
					csk = new Socket(SERVER_IP, PORT);
					System.out.println("※ 채팅 서버에 접속되었습니다!");
					InputStream in = csk.getInputStream();
					OutputStream out = csk.getOutputStream();
					while (true) {
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");
						String nowTime = sdf.format(date);
						DataInputStream dis = new DataInputStream(in);
						DataOutputStream dos = new DataOutputStream(out);
						String receive = dis.readUTF();
						if (receive.equals("exit")) {
							System.out.println("※ 종료합니다\n");
							dis.close();
						}
						System.out.println(nowTime + " 상대 -> " + receive);
						System.out.print(nowTime + " 나 -> ");
						String send = sc.nextLine();
						if (send.equals("exit")) {
							System.out.println("※ 종료합니다\n");
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
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
