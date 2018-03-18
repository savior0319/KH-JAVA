package kh.gbc.controller;

import javax.swing.JOptionPane;

import kh.gbc.model.player.DataGroup;
import kh.gbc.model.player.Member;
import kh.gbc.view.LoginView;

public class LoginController {
	private LoginView loginView;
	private DataGroup dataGroup = null;
	private Member m; 

	String id;
	String pw;

	public void startLogin() {
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
			JOptionPane.showMessageDialog(null, "���̵� �ߺ� üũ�� ���ּ���", "ȸ������", JOptionPane.ERROR_MESSAGE);
		} else {
			dataGroup.setMemberDataList(getId, m);
			dataGroup.saveData();
			loginView.signUpToLogin();
			JOptionPane.showMessageDialog(null, "������ �Ϸ� �Ǿ����ϴ� ", "ȸ������", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void loginSuccess() {
		System.out.println("�α��� ����");
		loginView.hideAll();
		new LobbyController().startLobby();
	}

	public boolean idValidCheck(String id) {
		if (!(dataGroup.chkValid(id)) == true) {
			return true;
		} else {
			return false;
		}
	}

	public void loginValidCheck(String getId, String getPw) {
		System.out.println("�ҷ�����.");

		if (dataGroup.chkValid(getId)) {
			if (dataGroup.getMember(getId).getPw().equals(getPw)) {
				JOptionPane.showMessageDialog(null, "�α��ο� ���� �߽��ϴ�", "�α���", JOptionPane.INFORMATION_MESSAGE);
				dataGroup.setMyMember(dataGroup.getMember(getId));
				loginSuccess();
			} else
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �߸� �Է��߽��ϴ�", "�α���", JOptionPane.ERROR_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "���̵� ������ �����ϴ�", "�α���", JOptionPane.ERROR_MESSAGE);
		}
	}
}