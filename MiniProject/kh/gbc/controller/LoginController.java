package kh.gbc.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import kh.gbc.model.player.*;
import kh.gbc.view.*;
import kh.gbc.view.LoginView;

public class LoginController {
	private LoginView loginView;
	private DataGroup dataGroup = null;
	// private HashMap<String, Member> map = new HashMap<String, Member>(); //
	private Member m; //
	// private final String PATH = System.getProperty("user.home") +
	// "/desktop/member.txt";

	String id;
	String pw;

	public void startLogin() {
		// loadData();
		dataGroup = new DataGroup();
		loginView = new LoginView(this);
	}

	public void signUp() {
		loginView.memberSignupPage();
	}

	public void join(boolean idChkFlag, String getId, String getPw) {
		m = new Member(getId, getPw);
		dataGroup.setMyMember(m);
		if (idChkFlag == false) {
			JOptionPane.showMessageDialog(null, "���̵� �ߺ� üũ�� ���ּ���!", "ȸ������", JOptionPane.ERROR_MESSAGE);
		} else {
			if (!idValidCheck(getId)) {
				// map.put(getId, m);
				dataGroup.setMemberDataList(getId, m);
				dataGroup.saveData();
				// saveData();
				loginView.signUpToLogin();
			}
		}
	}

	public void loginSuccess() {
		System.out.println("�α��� ����!");
		loginView.hideAll();
		new LobbyController().startLobby();
	}

	// public boolean validCheck(String getId) {
	// int flag = 0; // false
	// if (map.containsKey(getId)) {
	// flag = 1;
	// }
	// if(flag == 1) return true;
	// else return false;
	// }

	public boolean idValidCheck(String id) {
		// ���� �ڵ�
		// if (!.containsKey(id)) {
		if (!(dataGroup.chkValid(id))) {
			JOptionPane.showMessageDialog(null, "��밡���� ���̵��Դϴ�(Test)", "ȸ������", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "�̹� �ִ� ���̵� �Դϴ�.", "Ȯ��", JOptionPane.INFORMATION_MESSAGE);
		}
		return dataGroup.chkValid(id);
	}

	public void loginValidCheck(String getId, String getPw) {
		System.out.println("�ҷ�����.");

		if (dataGroup.chkValid(getId)) {
			if (dataGroup.getMember(getId).getPw().equals(getPw)) {
				JOptionPane.showMessageDialog(null, "�α��ο� ���� �߽��ϴ�!", "�α���", JOptionPane.INFORMATION_MESSAGE);
				dataGroup.setMyMember(dataGroup.getMember(getId));
				loginSuccess();
			} else
				JOptionPane.showMessageDialog(null, "��й�ȣ�� Ʋ�Ƚ��ϴ�.", "�α���", JOptionPane.ERROR_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "���̵� ������ �����ϴ�.", "�α���", JOptionPane.ERROR_MESSAGE);
		}
	}

	//
	// public void saveData()
	// {
	// FileOutputStream fos = null;
	// ObjectOutputStream oos = null;
	// try {
	// fos = new FileOutputStream(PATH);
	// oos = new ObjectOutputStream(fos);
	// oos.writeObject(map);
	//
	// } catch(Exception e) {
	// e.printStackTrace();
	// } finally {
	// try {
	// oos.close();
	// fos.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	//
	// public void loadData()
	// {
	// System.out.println("���� �ҷ�����.");
	// File file = new File(PATH);
	// FileInputStream fis = null;
	// ObjectInputStream ois = null;
	// if(file.exists())
	// {
	// try {
	// fis = new FileInputStream(PATH);
	// ois = new ObjectInputStream(fis);
	// map = (HashMap<String, Member>) ois.readObject();
	//
	// } catch(Exception e){
	// e.printStackTrace();
	// }finally{
	// try {
	// ois.close();
	// fis.close();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	// }
}