package kh.java.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingTest5 extends JFrame implements ActionListener {

	private Container ct = getContentPane();
	private JDialog jdlog = new JDialog();
	private JButton jbnLogin = new JButton("로그인하기");
	private JLabel jIdlb = new JLabel("아이디 : ");
	private JLabel jPwlb = new JLabel("비밀번호 : ");
	private JTextField jtf = new JTextField(10);
	private JPasswordField jpwf = new JPasswordField(10);
	private JButton jbnLogin1 = new JButton("로그인");

	public SwingTest5() {
		setTitle("스윙테스트");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		jdlog.setSize(500, 70);
		jdlog.setTitle("로그인");
		jdlog.setLocationRelativeTo(null);
		jdlog.setAlwaysOnTop(false);
		jdlog.setLayout(new FlowLayout());
		jdlog.setResizable(false);
		jIdlb.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jPwlb.setFont(new Font("맑은고딕", Font.BOLD, 15));
		jdlog.setModal(true);
		jdlog.add(jIdlb);
		jdlog.add(jtf);
		jdlog.add(jPwlb);
		jdlog.add(jpwf);
		jdlog.add(jbnLogin1);

		jbnLogin.addActionListener(this);
		jbnLogin1.addActionListener(this);

		jbnLogin.setBounds(150, 160, 200, 100);
		ct.add(jbnLogin);
	}

	public static void main(String[] args) {
		new SwingTest5().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbnLogin) {
			jdlog.setVisible(true);
		} else if (e.getSource() == jbnLogin1) {
			String getId = jtf.getText();
			char[] getPwd = jpwf.getPassword();
			String pwd = new String(getPwd);
			if(getId.equals("admin")&& pwd.equals("admin")) {
				JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");
			} else if(!(getId.equals("admin") || pwd.equals("admin"))){
				JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 잘못입력했습니다");
			}
		}
	}
}
