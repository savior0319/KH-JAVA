package me.member;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class View extends JFrame {

	private Container ct = getContentPane();
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JPanel jp3 = new JPanel();
	private JTextField jtfId = new JTextField();
	private JPasswordField jpfPwd = new JPasswordField();
	private JLabel jlbId = new JLabel("아이디", JLabel.CENTER);
	private JLabel jlbPwd = new JLabel("패스워드", JLabel.CENTER);
	private JButton jbtnSignUp = new JButton("회원가입");
	private JButton jbtnSignIn = new JButton("로그인");

	private Ctrl ctl = new Ctrl();
	private Model md = new Model();

	public View() {
		setTitle("회원가입");
		setVisible(true);
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		login();

		jbtnSignUp.addActionListener(e -> {
			getContentPane().removeAll();
			signUp();
			repaint();
			revalidate();
		});
	}

	public void login() {
		jp2.setLayout(new GridLayout(2, 2, 15, 15));
		jp2.add(jlbId);
		jp2.add(jtfId);
		jp2.add(jlbPwd);
		jp2.add(jpfPwd);
		jp2.setBorder(BorderFactory.createEmptyBorder(110, 50, 70, 50));

		jp3.setLayout(new GridLayout(2, 1, 15, 15));

		jp3.add(jbtnSignIn);
		jp3.add(jbtnSignUp);
		jp3.setBorder(BorderFactory.createEmptyBorder(50, 50, 100, 50));

		jp1.setLayout(new BorderLayout());
		jp1.add(jp2, BorderLayout.NORTH);
		jp1.add(jp3, BorderLayout.CENTER);

		ct.add(jp1);

		jbtnSignIn.addActionListener(e -> {
			String id = jtfId.getText();
			
			if(ctl.chkId(id) == true) {
				System.out.println("있는 아이디");
			} else 
				System.out.println("없는 아이디");
		});
	}

	public void signUp() {
		JPanel jp1 = new JPanel();
		JLabel jl1 = new JLabel("아이디");
		JLabel jl2 = new JLabel("비밀번호");
		JLabel jl3 = new JLabel("비밀번호 확인");
		JTextField jtf = new JTextField("");
		JPasswordField jpf1 = new JPasswordField("");
		JPasswordField jpf2 = new JPasswordField("");
		JButton jbtn1 = new JButton("가입하기");
		JButton jbtn2 = new JButton("가입취소");
		JButton jbtn3 = new JButton("아이디 중복 체크");

		jp1.setLayout(null);
		jl1.setBounds(90, 90, 100, 30);
		jtf.setBounds(170, 90, 120, 30);
		jl2.setBounds(80, 140, 100, 30);
		jpf1.setBounds(170, 140, 120, 30);
		jl3.setBounds(60, 190, 100, 30);
		jpf2.setBounds(170, 190, 120, 30);
		jbtn3.setBounds(300, 90, 135, 30);
		jbtn1.setBounds(110, 280, 120, 45);
		jbtn2.setBounds(270, 280, 120, 45);

		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jl2);
		jp1.add(jpf1);
		jp1.add(jl3);
		jp1.add(jpf2);
		jp1.add(jbtn3);
		jp1.add(jbtn1);
		jp1.add(jbtn2);

		ct.add(jp1);

		jbtn2.addActionListener(e -> {
			getContentPane().removeAll();
			login();
			repaint();
			revalidate();
		});

		jbtn1.addActionListener(e -> {
			String id = jtf.getText();
			String pwd = new String(jpf1.getPassword());
			String pwdChk = new String(jpf2.getPassword());
			md.setId(id);
			md.setPwd(pwd);
			if (id.equals("") || pwd.equals("") || pwdChk.equals("")) {
				JOptionPane.showMessageDialog(null, "입력하지 않은 항목이 있습니다", "회원가입", JOptionPane.ERROR_MESSAGE);
			} else {
				if (!pwd.equals(pwdChk)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다", "회원가입", JOptionPane.ERROR_MESSAGE);
				} else {
					ctl.save(id, md);
					JOptionPane.showConfirmDialog(null, "가입이 완료 되었습니다", "회원가입", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
	}
}