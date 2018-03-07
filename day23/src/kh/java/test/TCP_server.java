package kh.java.test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_server {
	public static void main(String[] args) {
		ServerSocket ssk = null;
		Socket csk = null;
		System.out.print("Ŭ���̾�Ʈ �����");
		final int PORT = 9999;
		try {
			ssk = new ServerSocket(PORT);
			csk = ssk.accept();
			OutputStream out = csk.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);
			InputStream in = csk.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			dos.writeUTF("�� �������忡 �����ϼ̽��ϴ�!");
			System.out.println(csk.getInetAddress() + "���� �����߾��");
			String receive = dis.readUTF();
			System.out.print(receive);
			dos.close();
			dis.close();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} finally {
			try {
				csk.close();
				ssk.close();
			} catch (IOException e) {
				System.out.print(e.getMessage());
			}
		}
	}
}
