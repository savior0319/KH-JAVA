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
			System.out.println("서버와의 연결이 되었습니다");
			InputStream in = csk.getInputStream();
			OutputStream out = csk.getOutputStream();
			while (true) {
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
				String time = sdf.format(date);
				DataInputStream dis = new DataInputStream(in);
				DataOutputStream dos = new DataOutputStream(out);
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
