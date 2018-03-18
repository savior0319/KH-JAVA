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
			JOptionPane.showMessageDialog(null, "아이디 중복 체크를 해주세요", "회원가입", JOptionPane.ERROR_MESSAGE);
		} else {
			dataGroup.setMemberDataList(getId, m);
			dataGroup.saveData();
			loginView.signUpToLogin();
			JOptionPane.showMessageDialog(null, "가입이 완료 되었습니다 ", "회원가입", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	public void loginSuccess() {
		System.out.println("로그인 성공");
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
		System.out.println("불러오기.");

		if (dataGroup.chkValid(getId)) {
			if (dataGroup.getMember(getId).getPw().equals(getPw)) {
				JOptionPane.showMessageDialog(null, "로그인에 성공 했습니다", "로그인", JOptionPane.INFORMATION_MESSAGE);
				dataGroup.setMyMember(dataGroup.getMember(getId));
				loginSuccess();
			} else
				JOptionPane.showMessageDialog(null, "비밀번호를 잘못 입력했습니다", "로그인", JOptionPane.ERROR_MESSAGE);

		} else {
			JOptionPane.showMessageDialog(null, "아이디 정보가 없습니다", "로그인", JOptionPane.ERROR_MESSAGE);
		}
	}
}