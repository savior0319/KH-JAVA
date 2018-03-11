package com.java.swing;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class Memo extends JFrame implements ActionListener, Runnable {

	private Container ct = getContentPane();
	private int count = 0, space = 0;
	private JLabel jlbCounter = new JLabel("�������� ���� �� : " + count);
	private JLabel jlbNoneSpace = new JLabel("�������� ���� �� : " + count);
	private JMenuBar jMenuBar;
	private JMenu jMenuFile;
	private JMenu jMenuInfo;
	private JMenuItem menuItemSave;
	private JMenuItem menuItemLoad;
	private JMenuItem menuItemExit;
	private JMenuItem menuItemInfo;
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	private JPanel jpn = new JPanel();
	private JPanel jpnLinePanel = new JPanel();
	private Thread thread;

	public Memo() {
		setTitle("�޸���");
		setSize(500, 600);
		setMinimumSize(new Dimension(350, 350));
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jMenuBar = new JMenuBar();
		jMenuFile = new JMenu("����");
		jMenuInfo = new JMenu("����");

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

		jMenuBar.add(jMenuFile);
		jMenuBar.add(jMenuInfo);
		setJMenuBar(jMenuBar);

		ct.setLayout(new BorderLayout());
		jpn.setLayout(new GridLayout(1, 3));

		jta.setLineWrap(true);

		jlbCounter.setFont(new Font("����", Font.PLAIN, 15));
		jlbNoneSpace.setFont(new Font("����", Font.PLAIN, 15));

		jpnLinePanel.setLayout(new GridLayout(1, 2));
		jpnLinePanel.add(jlbCounter);
		jpnLinePanel.add(jlbNoneSpace);

		ct.add(jsp, BorderLayout.CENTER);
		ct.add(jpn, BorderLayout.SOUTH);
		ct.add(jpnLinePanel, BorderLayout.SOUTH);

		thread = new Thread(this);
		thread.start();
	}

	public static void main(String[] args) {
		new Memo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("����")) {
			JFileChooser jc = new JFileChooser();
			jc.setCurrentDirectory(new File(System.getProperty("user.home") + "/Desktop"));
			jc.removeChoosableFileFilter((jc.getFileFilter()));
			FileNameExtensionFilter filter = new FileNameExtensionFilter("�ؽ�Ʈ ����(.txt)", "txt");
			jc.addChoosableFileFilter(filter);
			int result = jc.showSaveDialog(this);
			String getText = jta.getText();
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
					jta.setText(loadText);
				} catch (Exception e1) {
					System.out.print(e1.getMessage());
				}
			}
		} else if (e.getActionCommand().equals("����")) {
			System.exit(0);
		} else if (e.getActionCommand().equals("�޸��� ����")) {
			JOptionPane.showMessageDialog(null, "������\nAHJ");
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(1);
				String countText = jta.getText();
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
