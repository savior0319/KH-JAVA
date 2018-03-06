package com.kh.java22;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GifStream {
	
	public void fileLoad() {
		try(BufferedReader br = new BufferedReader(new FileReader("day22\\src\\quiz.txt"))){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			ArrayList<Byte> al = new ArrayList<Byte>();
			while(st.hasMoreTokens()) {
				al.add((byte)Integer.parseInt(st.nextToken(), 16));
			}
			FileOutputStream fout = new FileOutputStream("day22\\src\\quiz.gif");
			for(Byte i : al) {
				fout.write(i);
			}
			br.close();
			fout.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
			
		
		
	}
}
