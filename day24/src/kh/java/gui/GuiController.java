package kh.java.gui;

import javax.swing.JOptionPane;

public class GuiController {
	private GuiTest gt = new GuiTest(this);
	public void actionPerformed(int index) {
		JOptionPane.showConfirmDialog(null, index + "번 을 눌렀습니다");
	}
}