package kh.gbc.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Image;

import javax.annotation.processing.Completions;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;

import kh.gbc.controller.AdventureController;
import kh.gbc.controller.UtilClass;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class AdventureView {
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private UtilClass uc = new UtilClass();
	private AdventureController advCon;
	private JPanel adventureViewPanel;
	private JLabel eventTypeLabel;
	private JLabel adventureBgLabel;
	private JLabel eventTitleLabel;
	private JLabel centerBgLabel;
	private JLabel eventImgLabel;
	private JLabel eventExplainLabel;
	private JLabel survivorRateLabel;
	private JLabel adventrueStartLabel;
	private JButton giveUpBtn;
	private JButton progreesBtn;

	private JLabel closeLabel; // ���� �ڷΰ��� ��
	private JLabel startLabel; // ���� �����ϱ� ��

	JDialog adStartAns;

	private int select;

	public AdventureView() {
	}

	public AdventureView(AdventureController advCon) {
		this.advCon = advCon;
	}

	public void adventureConfirm() {
		JDialog advDialog = new JDialog();
		advDialog.setTitle("����");
		advDialog.setSize(450, 550);

		advDialog.setLocationRelativeTo(null);
		advDialog.setAlwaysOnTop(true);
		advDialog.setModal(true);
		advDialog.setResizable(false);

		JLabel eventImage = new JLabel();
		eventImage.setSize(360, 200);
		eventImage.setLocation(40, 40);
		eventImage.setIcon(new ImageIcon(resRoad.getEventImg01().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));

		switch (this.select) { // ���� �߰�
		case 1:
			eventImage.setIcon(new ImageIcon(resRoad.getEventImg01().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));
			break;
		case 2:
			eventImage.setIcon(new ImageIcon(resRoad.getEventImg02().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));
			break;
		case 3:
			eventImage.setIcon(new ImageIcon(resRoad.getEventImg03().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));
			break;
		case 4:
			eventImage.setIcon(new ImageIcon(resRoad.getEventImg04().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));
			break;
		}

		String msg = null; // ���� �߰�

		switch (this.select) { // ���� �߰�
		case 1:
			msg = "<html>���, ���̷�.. ������ �����ݾ� �̰�<br>" + "����... ��, ��, ��ƾƾ�<br>" + "�ƾƾƾƾƾƾƾƾƾƾƾ�</html>";
			break;
		case 2:
			msg = "<html>...���� ����Ͽ� �����<br>" + "���� ����-...ſ<br>" + "���� ����Ѵ�-..�̷� ������</html>";
			break;
		case 3:
			msg = "<html>�ٴ� ������ ����⸦<br>" + "..�� ���� ����-... ſ!<br>" + "..�̷�.. ���� �ʹ� �´�...</html>";
			break;
		case 4:
			msg = "<html>...�ϱ������� �������<br>" + "���� ����-! Ǫ��!<br>" + "..��� �ٹ��Ÿ��� ����...</html>";
			break;
		}

		JLabel messageLabel = new JLabel(msg);
		// uc.message(messageLabel,msg);
		messageLabel.setSize(360, 200);
		messageLabel.setLocation(60, 270);
		messageLabel.setFont(new Font("�������", Font.BOLD, 18));

		JLabel messageImage = new JLabel();
		messageImage.setSize(360, 200);
		messageImage.setLocation(40, 270);
		messageImage
				.setIcon(new ImageIcon(resRoad.getWhiteTextboxImg().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));

		// adventrueBackBtn = new JButton();
		// adventrueBackBtn.setSize(450,550);

		JButton adventrueBackBtn = new JButton();

		adventrueBackBtn.setIcon(new ImageIcon(resRoad.getBlackBgImg()));
		adventrueBackBtn.setBounds(0, 0, 370, 200);
		adventrueBackBtn.setLayout(null);
		adventrueBackBtn.add(messageLabel);
		adventrueBackBtn.add(eventImage);
		adventrueBackBtn.add(messageImage);
		adventrueBackBtn = vm.fitImageBtn(adventrueBackBtn);
		adventrueBackBtn.addActionListener(e -> {
			advDialog.setVisible(false);
		});

		advDialog.add(adventrueBackBtn);
		advDialog.setUndecorated(true);
		advDialog.setVisible(true);
	}

	public void answerAdventureQuest() {
		String message = "<html>���� ���ΰ� ������<br>���ΰ�<br>�����Ϸ�<br>�����ðڽ��ϱ�?<br>(�ܿ� 3ȸ)</html>";

		JLabel adventrueMsg = new JLabel(message, JLabel.CENTER);
		adventrueMsg.setForeground(Color.BLUE);
		adventrueMsg.setFont(new Font("�������", Font.BOLD, 18));
		adventrueMsg.setBounds(40, 60, 190, 150);

		JLabel adventureTitle = new JLabel("�����Ϸ� ����?");
		adventureTitle.setForeground(Color.RED);
		adventureTitle.setFont(new Font("�������", Font.BOLD, 26));
		adventureTitle.setBounds(40, 15, 190, 50);

		JButton adventureStartBtn = new JButton("����");
		JButton adventureCancelBtn = new JButton("���");
		adventureStartBtn.setFont(new Font("�������", Font.PLAIN, 16));
		adventureStartBtn.setBackground(new Color(242, 39, 39));
		adventureStartBtn.setForeground(new Color(255, 255, 255));
		adventureCancelBtn.setFont(new Font("�������", Font.PLAIN, 16));
		adventureCancelBtn.setBackground(new Color(242, 39, 39));
		adventureCancelBtn.setForeground(new Color(255, 255, 255));
		adventureStartBtn.setBounds(25, 225, 90, 30);
		adventureCancelBtn.setBounds(145, 225, 90, 30);

		adventrueStartLabel = new JLabel("");
		adventrueStartLabel
				.setIcon(new ImageIcon(resRoad.getAdventrueStart().getScaledInstance(260, 300, Image.SCALE_SMOOTH)));

		adStartAns = new JDialog();
		adStartAns.setLayout(new BorderLayout());
		adStartAns.add(adventrueStartLabel, BorderLayout.CENTER);
		adventrueStartLabel.add(adventrueMsg);
		adventrueStartLabel.add(adventureStartBtn);
		adventrueStartLabel.add(adventureTitle);
		// ��ư ok ��������.
		adventureStartBtn.addActionListener(e -> {
			advCon.AdventreGoStop(0);// Ȯ�ι�ư ��������.
			adStartAns.setVisible(false);
		});

		adventrueStartLabel.add(adventureCancelBtn);
		adventureCancelBtn.addActionListener(e -> {
			adStartAns.setVisible(false);
		});

		adStartAns.setResizable(false);
		adStartAns.setSize(260, 300);
		adStartAns.setUndecorated(true);
		adStartAns.setAlwaysOnTop(true);
		adStartAns.setLocationRelativeTo(null);
		adStartAns.setModal(true);
		adStartAns.getRootPane().setOpaque(false);
		adStartAns.setOpacity(0.75f);
		adStartAns.setVisible(true);

	}
	// public void answerAdventureQuest()
	// {
	// // 0 ��,1 �ƴϿ�, 2 ���, -1 �˾�â �ݱ�.
	// int answer = JOptionPane.showConfirmDialog(vm.getMainFrame(), "���� ���ΰ�\n������
	// ���ΰ�\n�����Ϸ�\n�����ðڽ��ϱ�?\n(�ܿ�" + "ȸ)",
	// "�����Ϸ� ����?",JOptionPane.YES_NO_OPTION);
	//
	// advCon.AdventreGoStop(answer);
	// }

	public void loadAdventureView() {
		// ���� �ϱ� ��
		startLabel = new JLabel("����!");
		startLabel.setBounds(280, 545, 80, 80);
		startLabel.setForeground(Color.white);
		startLabel.setFont(new Font("@����", Font.BOLD, 18));

		// ���� �ڷΰ��� ��
		closeLabel = new JLabel("... �׸��д�");
		closeLabel.setBounds(104, 545, 170, 80);
		closeLabel.setForeground(Color.white);
		closeLabel.setFont(new Font("@����", Font.BOLD, 18));

		// �ֻ�ܿ� �̺�Ʈ ��ȣ.
		eventTypeLabel = new JLabel("Event 01");
		eventTypeLabel.setSize(200, 80);
		eventTypeLabel.setFont(new Font("@����", Font.PLAIN, 20));
		eventTypeLabel.setLocation(180, 40);

		// �̺�Ʈ ����
		eventTitleLabel = new JLabel("���� ������");
		eventTitleLabel.setSize(300, 100);
		eventTitleLabel.setFont(new Font("@����", Font.PLAIN, 25));
		eventTitleLabel.setLocation(155, 60);

		// ��� ������ ���.
		centerBgLabel = new JLabel();
		centerBgLabel.setIcon(new ImageIcon(resRoad.getPopupBgImg()));
		centerBgLabel.setBackground(new Color(90, 178, 222));
		centerBgLabel.setBounds(15, 120, 420, 500);

		// ���� �̹���
		eventImgLabel = new JLabel();
		eventImgLabel.setIcon(new ImageIcon(resRoad.getEventImg01()));
		eventImgLabel.setSize(400, 250);
		eventImgLabel.setLocation(10, 10);

		// ���� �˾� ��� ����.
		adventureBgLabel = new JLabel();
		adventureBgLabel.setBackground(new Color(16, 142, 247));
		adventureBgLabel.setIcon(new ImageIcon(resRoad.getAdventureBgImg()));
		adventureBgLabel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());

		// ���� �������ֱ�.
		eventExplainLabel = new JLabel("", SwingConstants.CENTER);
		eventExplainLabel.setFont(new Font("����", Font.BOLD, 20));
		eventExplainLabel.setText("<html>���� ���ƴ�.<br>" + "�ƹ��� �����ص� ����� ����.<br>" + "���鿡 �����ϸ�<br>"
				+ "������� ����߸� �� ���� �� ����.<br>" + "���� ������ ����� ���� ��������.<br>" + "��� ����?");
		eventExplainLabel.setBounds(20, 210, 400, 250);

		// ����Ȯ��.
		survivorRateLabel = new JLabel("", SwingConstants.CENTER);
		survivorRateLabel.setFont(new Font("����", Font.BOLD, 18));
		survivorRateLabel.setText("����Ȯ�� : " + advCon.getSurvivorRate(1) + "%");
		survivorRateLabel.setForeground(Color.RED);
		survivorRateLabel.setBounds(20, 325, 400, 200);

		// �Ʒ��� ��ư ����.
		giveUpBtn = new JButton(new ImageIcon(resRoad.getRedBtn()));
		giveUpBtn = vm.fitImageBtn(giveUpBtn);
		giveUpBtn.setBounds(70, 440, 130, 50);
		giveUpBtn.addActionListener(e -> {
			advCon.backtoLobby();
		});

		progreesBtn = new JButton(new ImageIcon(resRoad.getRedBtn()));
		progreesBtn = vm.fitImageBtn(progreesBtn);
		progreesBtn.setBounds(220, 440, 130, 50);
		progreesBtn.addActionListener(e -> {
			advCon.goAdventure();
		});

		adventureBgLabel.add(closeLabel); // �׸��д� ��
		adventureBgLabel.add(startLabel); // ���� ��

		centerBgLabel.add(progreesBtn);
		centerBgLabel.add(giveUpBtn);
		centerBgLabel.add(survivorRateLabel);
		centerBgLabel.add(eventExplainLabel);
		centerBgLabel.add(eventImgLabel);
		adventureBgLabel.add(eventTypeLabel);
		adventureBgLabel.add(eventTitleLabel);
		adventureBgLabel.add(centerBgLabel);

		adventureViewPanel = new JPanel();
		adventureViewPanel.setBackground(Color.BLACK);// new Color(16, 142, 247));
		adventureViewPanel.setLayout(new BorderLayout());
		adventureViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		adventureViewPanel.add(adventureBgLabel);
		vm.setPanel(vm.getAdventureName(), adventureViewPanel);// 1��°.

		vm.getMainFrame().add(adventureViewPanel);

	}

	public void loadAdventureView(int select) {

		// ���� �ϱ� ��
		startLabel = new JLabel("����!");
		startLabel.setBounds(280, 545, 80, 80);
		startLabel.setForeground(Color.white);
		startLabel.setFont(new Font("@����", Font.BOLD, 18));

		// ���� �ڷΰ��� ��
		closeLabel = new JLabel("... �׸��д�");
		closeLabel.setBounds(104, 545, 170, 80);
		closeLabel.setForeground(Color.white);
		closeLabel.setFont(new Font("@����", Font.BOLD, 18));

		this.select = select;

		// �ֻ�ܿ� �̺�Ʈ ��ȣ.
		String event = null;
		switch (select) {
		case 1:
			event = "Event 01";
			break;
		case 2:
			event = "Event 02";
			break;
		case 3:
			event = "Event 03";
			break;
		case 4:
			event = "Event 04";
			break;
		}
		eventTypeLabel = new JLabel(event);
		eventTypeLabel.setSize(200, 80);
		eventTypeLabel.setFont(new Font("@����", Font.PLAIN, 20));
		eventTypeLabel.setLocation(180, 40);

		// ��� ������ ���.
		centerBgLabel = new JLabel();
		centerBgLabel.setIcon(new ImageIcon(resRoad.getPopupBgImg()));
		centerBgLabel.setBackground(new Color(90, 178, 222));
		centerBgLabel.setBounds(15, 120, 420, 500);

		// ���� �̹���
		eventImgLabel = new JLabel();

		switch (select) {
		case 1:
			eventImgLabel.setIcon(new ImageIcon(resRoad.getAdventureMomGaryupImg()));
			break;
		case 2:
			eventImgLabel.setIcon(new ImageIcon(resRoad.getAdventureDeepBlueImg()));
			break;
		case 3:
			eventImgLabel.setIcon(new ImageIcon(resRoad.getAdventureRockImg()));
			break;
		case 4:
			eventImgLabel.setIcon(new ImageIcon(resRoad.getAdventureLightImg()));
			break;
		}

		eventImgLabel.setSize(400, 250);
		eventImgLabel.setLocation(10, 10);

		// ���� �˾� ��� ����.
		adventureBgLabel = new JLabel();
		adventureBgLabel.setBackground(new Color(16, 142, 247));
		adventureBgLabel.setIcon(new ImageIcon(resRoad.getAdventureBgImg()));
		adventureBgLabel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());

		// ���� �������ֱ�.
		eventExplainLabel = new JLabel("", SwingConstants.CENTER);
		eventExplainLabel.setFont(new Font("����", Font.BOLD, 20));

		String htmlText = null;
		switch (select) {
		case 1:
			htmlText = "<html>���� ���ƴ�.<br>" + "�ƹ��� �����ص� ����� ����.<br>" + "���鿡 �����ϸ�<br>" + "������� ����߸� �� ���� �� ����.<br>"
					+ "���� ������ ����� ���� ��������.<br>" + "��� ����?";
			break;
		case 2:
			htmlText = "<html>���� ������ ����� �Խ��ϴ�.<br>" + "�̴�� �����ϸ� ���ִ� ���̰� ��������.<br>" + "���� �� �̻� �����ϸ� ���������� ����.<br>"
					+ "��� ����?";
			break;
		case 3:
			htmlText = "<html>�� �տ� ū ������.<br>" + "�� ������ ������ ���� ���̰� ���� �� ����.<br>" + "���� ���� ���̱��� �뽬!<br>"
					+ "���� ���� ���� ����� ���...<br>" + "��� ����?";
			break;
		case 4:
			htmlText = "<html>�̷�, ��ħ�ش�. �����ϰ�<br>" + "���̵� ���� ���� �� ����.<br>" + "��ħ�ظ� ���� ���ߺ���? �װ͵� ������ �ʾ�<br>" + "��� ����?";
			break;
		}
		eventExplainLabel.setText(htmlText);
		eventExplainLabel.setBounds(20, 210, 400, 250);

		// ����Ȯ��.
		survivorRateLabel = new JLabel("", SwingConstants.CENTER);
		survivorRateLabel.setFont(new Font("����", Font.BOLD, 18));
		survivorRateLabel.setText("����Ȯ�� : " + advCon.getSurvivorRate(1) + "%");
		survivorRateLabel.setForeground(Color.RED);
		survivorRateLabel.setBounds(20, 325, 400, 200);

		// �Ʒ��� ��ư ����.
		giveUpBtn = new JButton(new ImageIcon(resRoad.getRedBtn()));
		giveUpBtn = vm.fitImageBtn(giveUpBtn);
		giveUpBtn.setBounds(70, 440, 130, 50);
		giveUpBtn.addActionListener(e -> {
			advCon.backtoLobby();
		});

		progreesBtn = new JButton(new ImageIcon(resRoad.getRedBtn()));
		progreesBtn = vm.fitImageBtn(progreesBtn);
		progreesBtn.setBounds(220, 440, 130, 50);
		progreesBtn.addActionListener(e -> {
			advCon.goAdventure();
		});

		adventureBgLabel.add(startLabel);
		adventureBgLabel.add(closeLabel);

		centerBgLabel.add(progreesBtn);
		centerBgLabel.add(giveUpBtn);
		centerBgLabel.add(survivorRateLabel);
		centerBgLabel.add(eventExplainLabel);
		centerBgLabel.add(eventImgLabel);
		adventureBgLabel.add(eventTypeLabel);
		// adventureBgLabel.add(eventTitleLabel);
		adventureBgLabel.add(centerBgLabel);

		adventureViewPanel = new JPanel();
		adventureViewPanel.setBackground(Color.BLACK);// new Color(16, 142, 247));
		adventureViewPanel.setLayout(new BorderLayout());
		adventureViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());
		adventureViewPanel.add(adventureBgLabel);
		vm.setPanel(vm.getAdventureName(), adventureViewPanel);// 1��°.

		vm.getMainFrame().add(adventureViewPanel);

	}

}
