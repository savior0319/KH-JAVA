package com.java.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Memo extends JFrame implements ActionListener, Runnable {

	private Container ct = getContentPane();

	private JTabbedPane jTap = new JTabbedPane();

	private JPanel jp1 = new JPanel();
	private JPanel jp[] = new JPanel[5];

	private JButton jbtAddTab = new JButton("�� �߰�");
	private JButton jbtRemoveTab = new JButton("�� ����");

	private JTextArea jta[] = new JTextArea[5];
	private JScrollPane jsp[] = new JScrollPane[5];

	private JMenuBar jMenuBar;
	private JMenu jMenuFile;
	private JMenu jMenuInfo;
	private JMenu jMenuEdit;
	private JMenu jMenuSet;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemInfo;
	private JMenuItem menuItemNew;
	private JMenuItem menuItemAutoNewLine;
	private JMenuItem menuItemInputTime;
	private JMenuItem menuItemChangeFont;

	private boolean isAutoNewLineFlag = false;

	private SimpleDateFormat sdf;

	private String time;
	private int tabCount = 0;
	private int count = 0, space = 0;

	private JLabel jlbCounter = new JLabel("�������� ���� �� : " + count);
	private JLabel jlbNoneSpace = new JLabel("�������� ���� �� : " + count);

	private Thread thread;

	private JDialog jdlogSetFont = new JDialog();

	public void panel1() {
		JPanel jpCounter = new JPanel();
		JPanel jpTab = new JPanel();

		jpCounter.setLayout(new GridLayout(1, 2));
		jlbCounter.setFont(new Font("�������", Font.PLAIN, 15));
		jlbNoneSpace.setFont(new Font("�������", Font.PLAIN, 15));
		jpCounter.add(jlbCounter);
		jpCounter.add(jlbNoneSpace);

		jpTab.setLayout(new GridLayout(1, 2));

		jp1.setBackground(Color.WHITE);
		jp1.setLayout(new BorderLayout());

		jbtAddTab.setFont(new Font("�������", Font.BOLD, 15));
		jbtRemoveTab.setFont(new Font("�������", Font.BOLD, 15));
		jpTab.add(jbtAddTab);
		jpTab.add(jbtRemoveTab);

		jta[0] = new JTextArea();
		jta[0].setFont(new Font("�������", Font.PLAIN, 13));
		jp1.add(jsp[0] = new JScrollPane(jta[0], JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		jp1.add(jpTab, BorderLayout.NORTH);
		jp1.add(jpCounter, BorderLayout.SOUTH);

		jbtAddTab.addActionListener(e -> {
			if (e.getSource() == jbtAddTab) {
				try {
					addpanel();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "�ִ� �� ������� 5�� �Դϴ�", "���", JOptionPane.ERROR_MESSAGE);
					tabCount = 4;
				}
			}
		});
		jbtRemoveTab.addActionListener(e -> {
			if (e.getSource() == jbtRemoveTab) {
				if (tabCount > 0) {
					jTap.remove(tabCount);
					tabCount--;
				} else
					return;

			}
		});
		jTap.addTab("�޸�1", null, jp1, "Text");
		ct.add(jTap);
	}

	public void addpanel() {
		// JPanel jpCounter = new JPanel();
		// jpCounter.setLayout(new GridLayout(1, 2));
		// jlbCounter.setFont(new Font("����", Font.BOLD, 15));
		// jlbNoneSpace.setFont(new Font("����", Font.BOLD, 15));
		// jpCounter.add(jlbCounter);
		// jpCounter.add(jlbNoneSpace);

		tabCount++;
		jp[tabCount] = new JPanel();
		jp[tabCount].setBackground(Color.white);
		jp[tabCount].setLayout(new BorderLayout());
		// jp[tabCount].add(jpCounter, BorderLayout.SOUTH);
		jta[tabCount] = new JTextArea();

		try {
			jp[tabCount].add(jsp[tabCount] = new JScrollPane(jta[tabCount], JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
					JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "�ִ� ������ 5", "���", JOptionPane.ERROR_MESSAGE);
		}
		jTap.addTab("�޸�" + (tabCount + 1), null, jp[tabCount], "Text");

	}

	public Memo() {
		/* �⺻ ���̾ƿ� �۲� ���� */
		Font font1 = new Font("�������", Font.PLAIN, 13);
		Font font2 = new Font("�������", Font.PLAIN, 14);
		UIManager.put("Menu.font", font1);
		UIManager.put("MenuItem.font", font1);
		UIManager.put("OptionPane.messageFont", font2);
		UIManager.put("OptionPane.buttonFont", font2);

		/* �⺻ ������ ���� */
		setTitle("�޸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 800);
		setMinimumSize(new Dimension(350, 350));
		setLocationRelativeTo(null);

		/* �޴��� */
		jMenuBar = new JMenuBar();
		jMenuFile = new JMenu("����(F)");
		jMenuFile.setMnemonic(KeyEvent.VK_F);
		jMenuInfo = new JMenu("����(O)");
		jMenuInfo.setMnemonic(KeyEvent.VK_O);
		jMenuEdit = new JMenu("����(E)");
		jMenuEdit.setMnemonic(KeyEvent.VK_E);
		jMenuSet = new JMenu("����(S)");
		jMenuSet.setMnemonic(KeyEvent.VK_S);

		/* �޴��� - ���� */
		menuItemNew = new JMenuItem("�� �޸�");
		menuItemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		menuItemNew.addActionListener(this);
		jMenuFile.add(menuItemNew);

		jMenuFile.addSeparator();

		menuItemSave = new JMenuItem("����");
		menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		menuItemSave.addActionListener(this);
		jMenuFile.add(menuItemSave);

		menuItemLoad = new JMenuItem("�ҷ�����");
		menuItemLoad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		menuItemLoad.addActionListener(this);
		jMenuFile.add(menuItemLoad);

		jMenuFile.addSeparator();

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

		menuItemAutoNewLine = new JMenuItem("�ڵ� �� �ٲ�");
		menuItemAutoNewLine.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
		menuItemAutoNewLine.addActionListener(this);
		jMenuEdit.add(menuItemAutoNewLine);

		/* �޴��� - ���� */
		menuItemChangeFont = new JMenuItem("�۲�");
		menuItemChangeFont.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		menuItemChangeFont.addActionListener(this);
		jMenuSet.add(menuItemChangeFont);

		/* �޴��� ������ �߰� */
		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuEdit);
		jMenuBar.add(jMenuSet);
		jMenuBar.add(jMenuInfo);
		setJMenuBar(jMenuBar);

		/* �۲� ������ - JDialog */
		jdlogSetFont.setTitle("�۲� ������");
		jdlogSetFont.setSize(250, 150);
		jdlogSetFont.setModal(true);
		jdlogSetFont.setResizable(false);
		jdlogSetFont.setAlwaysOnTop(true);
		jdlogSetFont.setLocationRelativeTo(null);

		/* �⺻ �г� */
		panel1();

		/* ���� �� üũ & ����ð� Thread */
		thread = new Thread(this);
		thread.start();

	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int nowTab = jTap.getSelectedIndex();

		if (e.getActionCommand().equals("����")) {
			JFileChooser jc = new JFileChooser();
			setChooserFont(jc.getComponents());
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("�ؽ�Ʈ ����(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showSaveDialog(this);
			String getText = jta[nowTab].getText();

			if (result == 0) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(jc.getSelectedFile() + ".txt"))) {
					getText = getText.replace("\n", "\r\n");
					bw.write(getText);
				} catch (IOException e1) {
					System.out.print(e1.getMessage());
				}
			}

		} else if (e.getActionCommand().equals("�ҷ�����")) {
			JFileChooser jc = new JFileChooser();
			setChooserFont(jc.getComponents());
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("�ؽ�Ʈ ����(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showOpenDialog(this);
			String loadText = new String();
			String read = "";

			if (result == 0) {
				try (BufferedReader br = new BufferedReader(new FileReader(jc.getSelectedFile()))) {
					while ((read = br.readLine()) != null) {
						loadText += read + System.lineSeparator();
					}
					jta[nowTab].setText(loadText);
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			}

		} else if (e.getActionCommand().equals("����")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("�޸��� ����")) {
			JOptionPane.showMessageDialog(null, "AHJ");
		} else if (e.getActionCommand().equals("���� �ð� �Է�")) {
			jta[nowTab].append(time);
		} else if (e.getActionCommand().equals("�� �޸�")) {
			jta[nowTab].setText("");
		} else if (e.getActionCommand().equals("�ڵ� �� �ٲ�")) {
			autoNewLine();
		} else if (e.getActionCommand().equals("�۲�")) {
			jdlogSetFont.setVisible(true);
		}
	}

	public void setChooserFont(Component[] component) {
		Font fontChooser = new Font("�������", Font.PLAIN, 12);
		for (int x = 0; x < component.length; x++) {
			if (component[x] instanceof Container)
				setChooserFont(((Container) component[x]).getComponents());
			try {
				component[x].setFont(fontChooser);
			} catch (Exception e) {
			}
		}
	}

	public void autoNewLine() {
		int nowTab = jTap.getSelectedIndex();
		if (isAutoNewLineFlag == false) {
			isAutoNewLineFlag = true;
			jta[nowTab].setLineWrap(true);
		} else if (isAutoNewLineFlag == true) {
			isAutoNewLineFlag = false;
			jta[nowTab].setLineWrap(false);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1);

				sdf = new SimpleDateFormat("a hh:mm:ss YYYY-MM-dd");
				time = sdf.format(new Date());
				int nowTab = jTap.getSelectedIndex();
				String countText = jta[nowTab].getText();
				count = countText.length();

				for (int i = 0; i < count; i++) {
					if (countText.charAt(i) == '\u0020') {
						space++;
					}
				}

				int MaxEnter = Integer.MAX_VALUE;
				String nextline[] = countText.split("\n", MaxEnter);
				int nlc = nextline.length;

				jlbCounter.setText("�������� ���� �� : " + (count));
				jlbNoneSpace.setText("�������� ���ڼ� : " + (count - space - nlc + 1));
				space = 0;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}