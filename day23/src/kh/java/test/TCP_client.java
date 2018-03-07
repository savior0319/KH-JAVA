package kh.java.test;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_client {
	public static void main(String[] args) {
		Socket sck = null;
		final String IP = "localhost";
		final int port = 9999;
		try {
			sck = new Socket(IP, port);
			OutputStream out = sck.getOutputStream();
			InputStream in = sck.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			String receive = dis.readUTF();
			System.out.println(receive);
			DataOutputStream dos = new DataOutputStream(out);
			dos.writeUTF("나접속함");
			dis.close();
			dos.close();
		} catch (UnknownHostException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sck.close();
			} catch (IOException e) {
				System.out.print(e.getMessage());
			}
		}
	}
}
