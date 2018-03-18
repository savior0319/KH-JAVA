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
	private JLabel jlbId = new JLabel("���̵�", JLabel.CENTER);
	private JLabel jlbPwd = new JLabel("�н�����", JLabel.CENTER);
	private JButton jbtnSignUp = new JButton("ȸ������");
	private JButton jbtnSignIn = new JButton("�α���");

	private Ctrl ctl = new Ctrl();
	private Model md = new Model();

	public View() {
		setTitle("ȸ������");
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
				System.out.println("�ִ� ���̵�");
			} else 
				System.out.println("���� ���̵�");
		});
	}

	public void signUp() {
		JPanel jp1 = new JPanel();
		JLabel jl1 = new JLabel("���̵�");
		JLabel jl2 = new JLabel("��й�ȣ");
		JLabel jl3 = new JLabel("��й�ȣ Ȯ��");
		JTextField jtf = new JTextField("");
		JPasswordField jpf1 = new JPasswordField("");
		JPasswordField jpf2 = new JPasswordField("");
		JButton jbtn1 = new JButton("�����ϱ�");
		JButton jbtn2 = new JButton("�������");
		JButton jbtn3 = new JButton("���̵� �ߺ� üũ");

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
				JOptionPane.showMessageDialog(null, "�Է����� ���� �׸��� �ֽ��ϴ�", "ȸ������", JOptionPane.ERROR_MESSAGE);
			} else {
				if (!pwd.equals(pwdChk)) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�", "ȸ������", JOptionPane.ERROR_MESSAGE);
				} else {
					ctl.save(id, md);
					JOptionPane.showConfirmDialog(null, "������ �Ϸ� �Ǿ����ϴ�", "ȸ������", JOptionPane.DEFAULT_OPTION);
				}
			}
		});
	}
}