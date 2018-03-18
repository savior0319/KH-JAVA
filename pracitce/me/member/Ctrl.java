package me.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("all")
public class Ctrl {

	private HashMap<String, Model> hMap = new HashMap<String, Model>();
	private String PATH = System.getProperty("user.home") + "/desktop/memberlist.txt";

	public Ctrl() {
		load();
	}

	public void save(String id, Model md) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))) {
			hMap.put(id, md);
			oos.writeObject(hMap);
			oos.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	public void load() {
		File f = new File(PATH);
		if (f.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH))) {
				hMap = (HashMap<String, Model>) ois.readObject();
				ois.close();
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}
	}

	public boolean chkId(String id) {
		if (hMap.containsKey(id) == true) {
			return true;
		} else
			return false;
	}
}
