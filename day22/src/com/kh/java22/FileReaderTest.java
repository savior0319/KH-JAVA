package com.kh.java22;

import java.io.*;

public class FileReaderTest {

	private BufferedReader br;

	public FileReaderTest() {
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\user1\\Desktop\\1.txt"));
		} catch (FileNotFoundException e) {
		}
		String line = null;
		while (true) {
			try {
				line = br.readLine();
			} catch (IOException e) {
			}
			if (line == null)
				break;
			else
				System.out.println(line);
		}
	}
}
