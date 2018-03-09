package kh.java.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Survey extends JFrame {

	private Container ct = new Container();
	private JLabel jlbTitle = new JLabel("20~30대를 대상으로 진행하는 설문입니다", JLabel.CENTER);
	private JPanel jp1 = new JPanel();
	private JPanel jp2 = new JPanel();
	private JLabel jlbName = new JLabel("이름: ");
	private JLabel jlbAge = new JLabel("나이: ");
	private JTextField jtfName = new JTextField();
	private JTextField jtfAge = new JTextField();
	private JPanel jp3 = new JPanel();
	private JPanel jp4 = new JPanel();
	private Border lineBorder = BorderFactory.createLineBorder(Color.black, 2);
	private Border emptyBorder = BorderFactory.createEmptyBorder(7, 7, 7, 7);
	private JTextArea jtaGender = new JTextArea();
	private JTextArea jtaLike = new JTextArea();
	private JLabel jlGender = new JLabel("1번 당신의 성별은 ? ");
	private ButtonGroup bg = new ButtonGroup();
	private JRadioButton jrbtnM = new JRadioButton("남성");
	private JRadioButton jrbtnF = new JRadioButton("여성");
	private JPanel jp5 = new JPanel();
	private JLabel jlLike = new JLabel("2번 당신의 관심사는 ? <다중선택 가능>");
	private JPanel jp6 = new JPanel();
	private JCheckBox foodBox = new JCheckBox();
	private JCheckBox musicBox = new JCheckBox();
	private JCheckBox tvBox = new JCheckBox();
	private JCheckBox sportBox = new JCheckBox();
	private JCheckBox etcBox = new JCheckBox();
	private JTextField jtfLike = new JTextField();
	private JLabel jlbEtc = new JLabel("기타사항");
	private JPanel jp7 = new JPanel();
	private JTextArea jtaEtc = new JTextArea("기타사항을 작성해주세요");
	private JButton jbnSend = new JButton("전송");
	private JButton jbnCancel = new JButton("취소");

	public Survey() {
		setTitle("설문조사");
		setSize(500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user1\\Desktop\\search.png"));
		ct.setLayout(new BorderLayout());

		jlbTitle.setBounds(5, 5, 485, 60);
		jlbTitle.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jlbTitle.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		jp1.setBackground(Color.gray);
		jp1.setBounds(0, 0, 500, 700);
		jp2.setBackground(Color.white);
		jp2.setBounds(5, 5, 485, 60);

		jlbName.setBounds(100, 70, 50, 30);
		jlbAge.setBounds(280, 70, 50, 30);
		jtfName.setBounds(140, 70, 70, 30);
		jtfAge.setBounds(320, 70, 70, 30);

		jp3.setBackground(Color.white);
		jp3.setBounds(5, 110, 485, 180);

		jtaGender.setBounds(10, 115, 475, 170);
		jtaGender.setEditable(false);
		jtaGender.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		jp4.setBackground(Color.WHITE);
		jp4.setBounds(15, 110, 123, 30);

		jlGender.setBounds(20, 70, 150, 100);
		bg.add(jrbtnM);
		bg.add(jrbtnF);

		jrbtnM.setBounds(30, 160, 60, 30);
		jrbtnF.setBounds(30, 200, 60, 30);
		jrbtnF.setOpaque(true);
		jrbtnF.setBackground(Color.WHITE);
		jrbtnM.setOpaque(true);
		jrbtnM.setBackground(Color.WHITE);

		jp5.setBounds(5, 300, 485, 90);
		jtaLike.setBounds(10, 305, 475, 80);
		jtaLike.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
		jtaLike.setEditable(false);
		jp6.setBackground(Color.WHITE);
		jp6.setBounds(15, 300, 233, 30);
		jlLike.setBounds(20, 260, 300, 100);

		foodBox.setText("음식");
		foodBox.setOpaque(true);
		foodBox.setBackground(Color.WHITE);
		musicBox.setText("음악");
		musicBox.setOpaque(true);
		musicBox.setBackground(Color.WHITE);
		tvBox.setText("TV");
		tvBox.setOpaque(true);
		tvBox.setBackground(Color.WHITE);
		sportBox.setText("운동");
		sportBox.setOpaque(true);
		sportBox.setBackground(Color.WHITE);
		etcBox.setText("기타");
		etcBox.setOpaque(true);
		etcBox.setBackground(Color.WHITE);

		foodBox.setBounds(20, 330, 60, 30);
		musicBox.setBounds(80, 330, 60, 30);
		tvBox.setBounds(140, 330, 60, 30);
		sportBox.setBounds(200, 330, 60, 30);
		etcBox.setBounds(260, 330, 60, 30);
		jtfLike.setBounds(320, 335, 80, 20);

		jlbEtc.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jlbEtc.setBounds(10, 395, 200, 40);

		jp7.setBounds(5, 430, 485, 190);
		jp7.setBackground(Color.WHITE);

		jtaEtc.setBounds(10, 435, 475, 180);
		jtaEtc.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));

		jbnSend.setBounds(100, 630, 80, 30);
		jbnCancel.setBounds(300, 630, 80, 30);

		this.add(jbnCancel);
		this.add(jbnSend);
		this.add(jtaEtc);
		this.add(jp7);
		this.add(jlbEtc);
		this.add(jtfLike);
		this.add(etcBox);
		this.add(sportBox);
		this.add(tvBox);
		this.add(musicBox);
		this.add(foodBox);
		this.add(jlLike);
		this.add(jp6);
		this.add(jtaLike);
		this.add(jrbtnF);
		this.add(jrbtnM);
		this.add(jlGender);
		this.add(jp4);
		this.add(jtaGender);
		this.add(jtfAge);
		this.add(jtfName);
		this.add(jlbName);
		this.add(jlbAge);
		this.add(jlbTitle);
		this.add(jp5);
		this.add(jp3);
		this.add(jp2);
		this.add(jp1);
	}

	public static void main(String[] args) {
		new Survey().setVisible(true);
	}
}
