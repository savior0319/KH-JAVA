package com.java.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class TabTest extends JFrame implements ActionListener{

	private Container ct = getContentPane();
	private JTabbedPane jTap = new JTabbedPane();
	private JPanel jp1 = new JPanel();
	private JPanel jp[] = new JPanel[5];
	private JButton jbt = new JButton("�� �߰��ϱ�");
	private JButton jbt2 = new JButton("�� �����ϱ�");
	private JTextArea jta[] = new JTextArea[5];
	private int tabCount = 0;

	private JMenuBar jMenuBar;
	private JMenu jMenuFile;
	private JMenu jMenuInfo;
	private JMenu jMenuEdit;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemInfo;
	private JMenuItem menuItemInputTime;
	
	
	public void panel1() {
		JPanel jpMain = new JPanel();
		jpMain.setLayout(new GridLayout(1, 2));
		jp1.setBackground(Color.WHITE);
		jp1.setLayout(new BorderLayout());
		jpMain.add(jbt);
		jp1.add(jta[0] = new JTextArea(), BorderLayout.CENTER);
		jpMain.add(jbt2);
		jp1.add(jpMain, BorderLayout.SOUTH);
		jbt.addActionListener(e -> {
			if (e.getSource() == jbt) {
				try {
					addpanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "�ִ� ������ 5", "���", JOptionPane.ERROR_MESSAGE);
					tabCount = 4;
				}
			}
		});
		jbt2.addActionListener(e -> {
			if (e.getSource() == jbt2) {
				if(tabCount > 0) {
				jTap.remove(tabCount);
				tabCount--;
				} else return;
		
			}
		});
		jTap.addTab("�޸�1", null, jp1, "�ؽ�Ʈ1");
		ct.add(jTap);
	}

	public void addpanel() {
		tabCount++;
		jp[tabCount] = new JPanel();
		jp[tabCount].setBackground(Color.white);
		jp[tabCount].setLayout(new BorderLayout());
		try {
			jp[tabCount].add(jta[tabCount + 0] = new JTextArea(), BorderLayout.CENTER);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�ִ� ������ 5", "���", JOptionPane.ERROR_MESSAGE);
		}
		jTap.addTab("�޸�" + (tabCount + 1), null, jp[tabCount], "test");

	}

	public TabTest() {
		setTitle("�޸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setMinimumSize(new Dimension(300, 300));
		setLocationRelativeTo(null);
		
		jMenuBar = new JMenuBar();
		jMenuFile = new JMenu("����");
		jMenuInfo = new JMenu("����");
		jMenuEdit = new JMenu("����");

		/* �޴��� - ���� */
		menuItemSave = new JMenuItem("����");
		menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemSave.addActionListener(this);
		jMenuFile.add(menuItemSave);

		menuItemLoad = new JMenuItem("�ҷ�����");
		menuItemLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItemLoad.addActionListener(this);
		jMenuFile.add(menuItemLoad);

		menuItemExit = new JMenuItem("����");
		menuItemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuItemExit.addActionListener(this);
		jMenuFile.add(menuItemExit);

		/* �޴��� - ���� */
		menuItemInfo = new JMenuItem("�޸��� ����");
		menuItemInfo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
		menuItemInfo.addActionListener(this);
		jMenuInfo.add(menuItemInfo);

		/* �޴��� - ���� */
		menuItemInputTime = new JMenuItem("���� �ð� �Է�");
		menuItemInputTime.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		menuItemInputTime.addActionListener(this);
		jMenuEdit.add(menuItemInputTime);

		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		jMenuBar.add(jMenuInfo);
		setJMenuBar(jMenuBar);
		
		
		panel1();

	}

	public static void main(String[] args) {
		new TabTest().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
