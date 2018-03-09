package kh.java.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SwingTest extends JFrame {

	private Container ct = getContentPane();
	private JLabel jl1 = new JLabel("아이디", JLabel.CENTER);
	private JLabel jl2 = new JLabel("비밀번호", JLabel.CENTER);
	private JTextField jtf = new JTextField();
	private JPasswordField jpwd = new JPasswordField();
	private JPanel jp1 = new JPanel();
	private JButton jbtn = new JButton("로그인");
	private JTextArea jta = new JTextArea();
	private JPanel jp2 = new JPanel();
	private JCheckBox jcb1 = new JCheckBox("box1");
	private JCheckBox jcb2 = new JCheckBox("box2", true);
	private JCheckBox jcb3 = new JCheckBox("box3");
	private JScrollPane jsp = new JScrollPane(jta);
	private Border lineBorder = BorderFactory.createLineBorder(Color.black, 2);
	private Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);

	public SwingTest() {
		setTitle("스윙테스트");
		setSize(800, 800);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		ct.setLayout(new BorderLayout());

		jp1.setLayout(new GridLayout(1, 4));
		jp1.add(jl1);
		jp1.add(jtf);
		jp1.add(jl2);
		jp1.add(jpwd);
		jp1.add(jbtn);
		jp2.setLayout(new GridLayout(1, 3));
		jp2.add(jcb1);
		jp2.add(jcb2);
		jp2.add(jcb3);
		jta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		ct.add(jp1, BorderLayout.NORTH);
		ct.add(jsp, BorderLayout.CENTER);
		ct.add(jp2, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new SwingTest().setVisible(true);
	}
}
