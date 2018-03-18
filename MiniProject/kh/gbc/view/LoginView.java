package kh.gbc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.gbc.controller.LoginController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class LoginView implements KeyListener {
	private ResourceRoad resRoad = new ResourceRoad();
	private ViewModel vm = ViewModel.getInstance();
	private LoginController loginController;
	private JPanel loginViewPanel = new JPanel();
	private JPanel signUpViewPanel = new JPanel();
	private JTextField jtfId = new JTextField("");
	private JPasswordField jpfPwd = new JPasswordField("");
	private JLabel jlbId = new JLabel("아이디", JLabel.CENTER);
	private JLabel jlbPwd = new JLabel("비밀번호", JLabel.CENTER);
	private JLabel loginBgLabel = new JLabel();
	private JLabel signBgLabel = new JLabel();
	private JButton jBtnSignin = new JButton("로그인");
	private JButton jBtnSignup = new JButton("회원가입");
	private JButton jBtnExit = new JButton("종료하기");
	private boolean idChkFlag = false;
	private boolean loadView = false;
	private JTextField jtfIdSignUp = new JTextField("");
	private JPasswordField jpfPwdSignUp = new JPasswordField("");
	private JPasswordField jpfPwdChkSignUp = new JPasswordField("");
	private String tempId;

	public LoginView(LoginController loginController) {
		this.loginController = loginController;
		memberSigninPage();
	}

	public LoginView() {
	}

	public void memberSigninPage() {
		System.out.println("memberSigninPage");
		loginBgLabel.setIcon(new ImageIcon(resRoad.getLoginBgImg().getScaledInstance(450, 800, Image.SCALE_SMOOTH)));

		jlbId.setBounds(90, 120, 100, 100);
		jlbId.setFont(resRoad.getFontSize24());
		loginBgLabel.add(jlbId);

		jlbPwd.setBounds(85, 210, 100, 100);
		jlbPwd.setFont(resRoad.getFontSize24());
		loginBgLabel.add(jlbPwd);

		jtfId.setBounds(210, 147, 130, 50);
		loginBgLabel.add(jtfId);

		jpfPwd.setBounds(210, 237, 130, 50);
		loginBgLabel.add(jpfPwd);

		jBtnSignin.setBounds(160, 350, 130, 50);
		jBtnSignin.setForeground(Color.WHITE);
		jBtnSignin.setBackground(new Color(45, 89, 232));
		jBtnSignin.setFont(resRoad.getFontSize24());
		loginBgLabel.add(jBtnSignin);

		jBtnSignup.setBounds(160, 430, 130, 50);
		jBtnSignup.setForeground(Color.WHITE);
		jBtnSignup.setBackground(new Color(45, 89, 232));
		jBtnSignup.setFont(resRoad.getFontSize24());
		loginBgLabel.add(jBtnSignup);

		jBtnExit.setBounds(160, 510, 130, 50);
		jBtnExit.setForeground(Color.WHITE);
		jBtnExit.setBackground(new Color(45, 89, 232));
		jBtnExit.setFont(resRoad.getFontSize24());
		loginBgLabel.add(jBtnExit);

		jBtnSignup.addActionListener(e -> {
			if (!loadView)
				loginController.signUp();
			else
				loginToSignUp();
			loadView = true;
		});

		jpfPwd.addKeyListener(this);
		jtfId.addKeyListener(this);

		jBtnSignin.addActionListener(e -> {
			String getId = jtfId.getText();
			String getPw = new String(jpfPwd.getPassword());
			if (jtfId.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "아이디를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
			} else if (getPw.equals("")) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
			} else {
				loginController.loginValidCheck(getId, getPw);
			}
		});

		jBtnExit.addActionListener(e -> {
			System.exit(0);
		});

		loginViewPanel.setLayout(new BorderLayout());
		loginViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		loginViewPanel.add(loginBgLabel);
		vm.getMainFrame().add(loginViewPanel);

	}

	public void hideAll() {
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(false);
	}

	public void loginToSignUp() {
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(true);

		jtfIdSignUp.setText("");
		jpfPwdSignUp.setText("");
		jpfPwdChkSignUp.setText("");
	}

	public void signUpToLogin() {
		signUpViewPanel.setVisible(false);
		loginViewPanel.setVisible(true);

		jtfId.setText("");
		jpfPwd.setText("");
		loginViewPanel.repaint();
	}

	public void memberSignupPage() {
		JLabel jlbId = new JLabel("아이디", JLabel.CENTER);
		JLabel jlbPwd = new JLabel("비밀번호", JLabel.CENTER);
		JLabel jlbPwdChk = new JLabel("비밀번호 확인", JLabel.CENTER);
		JButton jBtnIdChk = new JButton("아이디 중복 확인");
		JButton jBtnSignup = new JButton("가입하기");
		JButton jBtnCancel = new JButton("취소하기");

		jlbId.setBounds(100, 110, 100, 100);
		jlbId.setFont(resRoad.getFontSize24());
		signBgLabel.add(jlbId);

		jlbPwd.setBounds(95, 250, 100, 100);
		jlbPwd.setFont(resRoad.getFontSize24());
		signBgLabel.add(jlbPwd);

		jlbPwdChk.setBounds(20, 315, 200, 100);
		jlbPwdChk.setFont(resRoad.getFontSize24());
		signBgLabel.add(jlbPwdChk);

		jtfIdSignUp.setBounds(220, 135, 130, 50);
		signBgLabel.add(jtfIdSignUp);

		jBtnIdChk.setBounds(130, 200, 200, 50);
		jBtnIdChk.setForeground(Color.WHITE);
		jBtnIdChk.setBackground(new Color(45, 89, 232));
		jBtnIdChk.setFont(resRoad.getFontSize21());
		signBgLabel.add(jBtnIdChk);

		jpfPwdSignUp.setBounds(220, 275, 130, 50);
		signBgLabel.add(jpfPwdSignUp);

		jpfPwdChkSignUp.setBounds(220, 340, 130, 50);
		signBgLabel.add(jpfPwdChkSignUp);

		jBtnSignup.setBounds(130, 410, 200, 50);
		jBtnSignup.setForeground(Color.WHITE);
		jBtnSignup.setBackground(new Color(45, 89, 232));
		jBtnSignup.setFont(resRoad.getFontSize24());
		signBgLabel.add(jBtnSignup);

		jBtnCancel.setBounds(130, 480, 200, 50);
		jBtnCancel.setForeground(Color.WHITE);
		jBtnCancel.setBackground(new Color(45, 89, 232));
		jBtnCancel.setFont(resRoad.getFontSize24());
		signBgLabel.add(jBtnCancel);

		jBtnCancel.addActionListener(e -> {
			idChkFlag = false;
			signUpToLogin();
		});

		jBtnIdChk.addActionListener(e -> {
			String id = jtfIdSignUp.getText();
			if (id.equals("")) {
				JOptionPane.showMessageDialog(null, "아이디를 입력 해주세요", "회원가입", JOptionPane.ERROR_MESSAGE);
			} else {
				tempId = id;
				idChkFlag = true;
				if (loginController.idValidCheck(jtfIdSignUp.getText()) == true) {
					JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다 ", "회원가입", JOptionPane.INFORMATION_MESSAGE);
				} else if (loginController.idValidCheck(jtfIdSignUp.getText()) == false) {
					JOptionPane.showMessageDialog(null, "사용 중인 아이디입니다", "회원가입", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		// 회원 가입 할때.
		jBtnSignup.addActionListener(e -> {
			String id = jtfIdSignUp.getText();
			String pwd = new String(jpfPwdSignUp.getPassword());
			String pwdChk = new String(jpfPwdChkSignUp.getPassword());
			if (id.equals("") || pwd.equals("") || pwdChk.equals("")) {
				JOptionPane.showMessageDialog(null, "입력하지 않은 항목이 있습니다", "회원가입", JOptionPane.ERROR_MESSAGE);
			} else {
				if (!tempId.equals(id)) {
					JOptionPane.showMessageDialog(null, "아이디 중복체크를 다시 해주세요", "회원가입", JOptionPane.ERROR_MESSAGE);
				} else if (!pwd.equals(pwdChk)) {
					JOptionPane.showMessageDialog(null, "비밀번호 확인이 일치하지 않습니다", "회원가입", JOptionPane.ERROR_MESSAGE);
				} else {
					loginController.join(idChkFlag, jtfIdSignUp.getText(), new String(jpfPwdSignUp.getPassword()));//
				}
			}
		});

		signUpViewPanel.setLayout(new BorderLayout());
		signUpViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		signBgLabel.setIcon(new ImageIcon(resRoad.getLoginBgImg().getScaledInstance(450, 800, Image.SCALE_SMOOTH)));
		loginViewPanel.setVisible(false);
		signUpViewPanel.add(signBgLabel);
		vm.getMainFrame().add(signUpViewPanel);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		String tempPwd = new String(jpfPwd.getPassword());
		if (e.getSource() == jpfPwd) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				if (jtfId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
				} else if (tempPwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
				} else {
					jBtnSignin.doClick();
				}
			}
		} else if (e.getSource() == jtfId) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				if (jtfId.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
				} else if (tempPwd.equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요", "로그인", JOptionPane.ERROR_MESSAGE);
				} else {
					jBtnSignin.doClick();
				}
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}