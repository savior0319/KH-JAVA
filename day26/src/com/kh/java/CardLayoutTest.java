package com.kh.java;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("all")
public class CardLayoutTest extends JFrame implements ActionListener {
	private JPanel firstPanel = null;
	/* << < > >> 버튼 */
	private JButton ls;
	private JButton lts;
	private JButton rts;
	private JButton rs;
	/* 종료 버튼 */
	private JButton exit;
	private JPanel cardBox = null;
	// 1: white / 2:orange / 3:yellow / 4. green / 5. blue / 6. red / 7. black
	private JPanel[] CARD = new JPanel[7];
	private int cardNumber = 1;

	public void firstPanel() {
		firstPanel = new JPanel(new GridLayout(1, 5, 10, 0));
		firstPanel.setPreferredSize(new Dimension(400, 30)); // 사이즈
		ls = new JButton("<<");
		lts = new JButton("<");
		rts = new JButton(">");
		rs = new JButton(">>");
		exit = new JButton("종료");
		firstPanel.add(ls);
		firstPanel.add(lts);
		firstPanel.add(rts);
		firstPanel.add(rs);
		firstPanel.add(exit);

		ls.addActionListener(this);
		lts.addActionListener(this);
		rts.addActionListener(this);
		rs.addActionListener(this);
		exit.addActionListener(this);
		

	}

	public void cards() {
		cardBox = new JPanel(new CardLayout());
		for (int i = 0; i < CARD.length; i++)
			cardBox.add(Integer.toString(i + 1), CARD[i] = new JPanel());

		CARD[0].setBackground(Color.white);
		CARD[1].setBackground(Color.orange);
		CARD[2].setBackground(Color.yellow);
		CARD[3].setBackground(Color.green);
		CARD[4].setBackground(Color.blue);
		CARD[5].setBackground(Color.red);
		CARD[6].setBackground(Color.black);
	}

	public void compInit() {
		this.firstPanel();
		this.cards();
		this.add(firstPanel, BorderLayout.NORTH);
		this.add(cardBox, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("<")) {
			if (cardNumber > 1)
				cardNumber--;
		} else if (e.getActionCommand().equals("<<")) {
			cardNumber = 1;
		} else if (e.getActionCommand().equals(">")) {
			if (cardNumber < 7)
				cardNumber++;
		} else if (e.getActionCommand().equals(">>")) {
			cardNumber = 7;
		} else if (e.getActionCommand().equals("종료")) {
			System.exit(0);
		}
		((CardLayout) cardBox.getLayout()).show(cardBox, String.valueOf(cardNumber));
	}

	public CardLayoutTest() {
		super("CardLayout Test");
		this.setLayout(new BorderLayout(15, 15));
		this.setSize(450, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.compInit();
		this.setVisible(true);
	}
}
