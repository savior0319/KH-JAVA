package kh.java.gui;

import javax.swing.JOptionPane;

public class GuiController {
	private GuiTest gt = new GuiTest(this);
	public void actionPerformed(int index) {
		JOptionPane.showConfirmDialog(null, index + "�� �� �������ϴ�");
	}
}