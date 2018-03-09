package kh.java.gui;

import java.awt.*;
import javax.swing.*;

public class GuiTest extends JFrame {

	private String imgPath = "C:\\Users\\user1\\Desktop\\calc.png";
	private Container ct = getContentPane();
	private JButton[] jbtn = new JButton[9];
	private GuiController gc;
	private JComboBox<String> jcombo = new JComboBox<String>();

	public GuiTest(GuiController gc) {
		ct.setLayout(new GridLayout(3, 3));

		for (int i = 1; i < jbtn.length + 1; i++) {
			jbtn[i - 1] = new JButton(i + "");
			jbtn[i - 1].setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 20));
			ct.add(jbtn[i - 1]);
			int j = i;
			jbtn[i - 1].addActionListener(e -> {
				gc.actionPerformed(j);
			});
		}

		ct.add(jcombo);

		setIconImage(Toolkit.getDefaultToolkit().getImage(imgPath));
		setVisible(true);
		setResizable(false);
		setTitle("GuiTest");
		setResizable(false);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.gc = gc;
	}
}
