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
	private JButton jbnLogin = new JButton("�α����ϱ�");
	private JLabel jIdlb = new JLabel("���̵� : ");
	private JLabel jPwlb = new JLabel("��й�ȣ : ");
	private JTextField jtf = new JTextField(10);
	private JPasswordField jpwf = new JPasswordField(10);
	private JButton jbnLogin1 = new JButton("�α���");

	public SwingTest5() {
		setTitle("�����׽�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		jdlog.setSize(500, 70);
		jdlog.setTitle("�α���");
		jdlog.setLocationRelativeTo(null);
		jdlog.setAlwaysOnTop(false);
		jdlog.setLayout(new FlowLayout());
		jdlog.setResizable(false);
		jIdlb.setFont(new Font("�������", Font.BOLD, 15));
		jPwlb.setFont(new Font("�������", Font.BOLD, 15));
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
				JOptionPane.showMessageDialog(null, "�α��ο� �����߽��ϴ�");
			} else if(!(getId.equals("admin") || pwd.equals("admin"))){
				JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �߸��Է��߽��ϴ�");
			}
		}
	}
}
