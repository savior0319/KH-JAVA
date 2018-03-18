package kh.gbc.view;

import java.awt.*;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.omg.CORBA.CTX_RESTRICT_SCOPE;

import kh.gbc.controller.LoginController;
import kh.gbc.controller.RankingController;
import kh.gbc.model.vo.ViewModel;

public class LoginView {
	private ViewModel vm = ViewModel.getInstance();
	private LoginController loginController;
	private JPanel loginViewPanel = new JPanel();
	private JPanel signUpViewPanel = new JPanel();
	private JTextField jtfId = new JTextField();
	private JPasswordField jpfPwd = new JPasswordField();
	private JLabel jlbId = new JLabel("아이디", JLabel.CENTER);
	private JLabel jlbPwd = new JLabel("패스워드", JLabel.CENTER);
	private JButton jBtnSignin = new JButton("로그인");
	private JButton jBtnSignup = new JButton("회원가입");
	private boolean idChkFlag = false;
	private boolean loadView = false;
	public LoginView() {}
	public LoginView(LoginController loginController)
	{
		this.loginController = loginController;
		memberSigninPage();
	}

	public void memberSigninPage() {
		System.out.println("memberSigninPage");
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		jp1.setOpaque(true);
		jp1.setBackground(Color.MAGENTA);
		
		jp2.setOpaque(true);
		jp2.setBackground(Color.MAGENTA);
		
		jp1.setLayout(new GridLayout(2, 2, 15, 15));
		jp1.setBorder(BorderFactory.createEmptyBorder(160, 50, 110, 100));

		jp1.add(jlbId);
		jp1.add(jtfId);
		jp1.add(jlbPwd);
		jp1.add(jpfPwd);

		jp2.setLayout(new GridLayout(2, 1, 15, 15));
		jp2.setBorder(BorderFactory.createEmptyBorder(10, 100, 330, 100));

		jp2.add(jBtnSignin);
		jp2.add(jBtnSignup);

		jBtnSignup.addActionListener(e -> { 
			 if(!loadView)loginController.signUp(); 
			 else loginToSignUp();
			loadView = true;
			});

		jBtnSignin.addActionListener(e -> {
			String getId = jtfId.getText();
			String getPw = new String(jpfPwd.getPassword());
			loginController.loginValidCheck(getId,getPw);
		});
		
		loginViewPanel.setLayout(new BorderLayout());
		loginViewPanel.setBounds(0,0,vm.getFrameWidth(),vm.getFrameHeight());
		loginViewPanel.add(jp1, BorderLayout.CENTER);
		loginViewPanel.add(jp2, BorderLayout.SOUTH);
		vm.getMainFrame().add(loginViewPanel);
	}
	public void hideAll()
	{
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(false);
	}
	
	public void loginToSignUp()
	{
		loginViewPanel.setVisible(false);
		signUpViewPanel.setVisible(true);
		
		jtfIdSignUp.setText("");
		jpfPwdSignUp.setText("");
		jpfPwdChkSignUp.setText("");
	}
	
	public void signUpToLogin()
	{
		signUpViewPanel.setVisible(false);
		loginViewPanel.setVisible(true);
		
		jtfId.setText("");
		jpfPwd.setText("");
		loginViewPanel.repaint();
	}

	JTextField jtfIdSignUp = new JTextField();
	JPasswordField jpfPwdSignUp = new JPasswordField();
	JPasswordField jpfPwdChkSignUp = new JPasswordField();
	public void memberSignupPage() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JLabel jlbId = new JLabel("아이디", JLabel.CENTER);
		JLabel jlbPwd = new JLabel("비밀번호", JLabel.CENTER);
		JLabel jlbPwdChk = new JLabel("비밀번호 확인", JLabel.CENTER);
		jtfIdSignUp = new JTextField();
		jpfPwdSignUp = new JPasswordField();
		jpfPwdChkSignUp = new JPasswordField();
		JButton jBtnIdChk = new JButton("중복 확인");
		JButton jBtnSignup = new JButton("가입하기");
		JButton jBtnCancel = new JButton("취소하기");

		jp1.setLayout(new GridLayout(1, 3, 15, 15));
		jp1.add(jlbId);
		jp1.add(jtfIdSignUp);
		jp1.add(jBtnIdChk);
		jp1.setBorder(BorderFactory.createEmptyBorder(160, 60, 30, 100));

		jp2.setLayout(new GridLayout(2, 2, 15, 15));
		jp2.add(jlbPwd);
		jp2.add(jpfPwdSignUp);
		jp2.add(jlbPwdChk);
		jp2.add(jpfPwdChkSignUp);
		jp2.setBorder(BorderFactory.createEmptyBorder(10, 35, 110, 100));

		jp3.setLayout(new GridLayout(2, 1, 15, 15));
		jp3.add(jBtnSignup);
		jp3.add(jBtnCancel);
		jp3.setBorder(BorderFactory.createEmptyBorder(10, 100, 270, 100));

		jBtnCancel.addActionListener(e -> {    
			idChkFlag = false; 
			signUpToLogin();
		});

		jBtnIdChk.addActionListener(e -> {
			idChkFlag = true;
			loginController.idValidCheck(jtfIdSignUp.getText());
		});
		
		// 회원 가입 할때.
		jBtnSignup.addActionListener(e -> {
			loginController.join(idChkFlag, jtfIdSignUp.getText(), new String(jpfPwdSignUp.getPassword()));//
		});
		
		signUpViewPanel.setLayout(new BorderLayout());
		signUpViewPanel.setBounds(0,0,vm.getFrameWidth(),vm.getFrameHeight());
		signUpViewPanel.add(jp1, BorderLayout.NORTH);
		signUpViewPanel.add(jp2, BorderLayout.CENTER);
		signUpViewPanel.add(jp3, BorderLayout.SOUTH);
		loginViewPanel.setVisible(false);
		vm.getMainFrame().add(signUpViewPanel);
		
	}

}