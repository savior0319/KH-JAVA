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

	private JLabel closeLabel; // 모험 뒤로가기 라벨
	private JLabel startLabel; // 모험 시작하기 라벨

	JDialog adStartAns;

	private int select;

	public AdventureView() {
	}

	public AdventureView(AdventureController advCon) {
		this.advCon = advCon;
	}

	public void adventureConfirm() {
		JDialog advDialog = new JDialog();
		advDialog.setTitle("모험");
		advDialog.setSize(450, 550);

		advDialog.setLocationRelativeTo(null);
		advDialog.setAlwaysOnTop(true);
		advDialog.setModal(true);
		advDialog.setResizable(false);

		JLabel eventImage = new JLabel();
		eventImage.setSize(360, 200);
		eventImage.setLocation(40, 40);
		eventImage.setIcon(new ImageIcon(resRoad.getEventImg01().getScaledInstance(360, 200, Image.SCALE_SMOOTH)));

		switch (this.select) { // 여기 추가
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

		String msg = null; // 여기 추가

		switch (this.select) { // 여기 추가
		case 1:
			msg = "<html>잠깐, 이이런.. 수면이 아프잖아 이거<br>" + "절대... 우, 우, 우아아아<br>" + "아아아아아아아아아아아아</html>";
			break;
		case 2:
			msg = "<html>...깊이 잠수하여 물고기<br>" + "많이 먹자-...탓<br>" + "쭉쭉 잠수한다-..이런 차가워</html>";
			break;
		case 3:
			msg = "<html>바다 뒷편의 물고기를<br>" + "..한 번에 먹자-... 탓!<br>" + "..이런.. 힘을 너무 냈다...</html>";
			break;
		case 4:
			msg = "<html>...일광욕으로 기생충을<br>" + "많이 잡자-! 푸하!<br>" + "..어어 꾸벅거리기 시작...</html>";
			break;
		}

		JLabel messageLabel = new JLabel(msg);
		// uc.message(messageLabel,msg);
		messageLabel.setSize(360, 200);
		messageLabel.setLocation(60, 270);
		messageLabel.setFont(new Font("맑은고딕", Font.BOLD, 18));

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
		String message = "<html>죽을 것인가 성장할<br>것인가<br>모험하러<br>나가시겠습니까?<br>(잔여 3회)</html>";

		JLabel adventrueMsg = new JLabel(message, JLabel.CENTER);
		adventrueMsg.setForeground(Color.BLUE);
		adventrueMsg.setFont(new Font("맑은고딕", Font.BOLD, 18));
		adventrueMsg.setBounds(40, 60, 190, 150);

		JLabel adventureTitle = new JLabel("모험하러 갈까?");
		adventureTitle.setForeground(Color.RED);
		adventureTitle.setFont(new Font("맑은고딕", Font.BOLD, 26));
		adventureTitle.setBounds(40, 15, 190, 50);

		JButton adventureStartBtn = new JButton("진행");
		JButton adventureCancelBtn = new JButton("취소");
		adventureStartBtn.setFont(new Font("맑은고딕", Font.PLAIN, 16));
		adventureStartBtn.setBackground(new Color(242, 39, 39));
		adventureStartBtn.setForeground(new Color(255, 255, 255));
		adventureCancelBtn.setFont(new Font("맑은고딕", Font.PLAIN, 16));
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
		// 버튼 ok 눌렀을때.
		adventureStartBtn.addActionListener(e -> {
			advCon.AdventreGoStop(0);// 확인버튼 눌렀을때.
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
	// // 0 예,1 아니요, 2 취소, -1 팝업창 닫기.
	// int answer = JOptionPane.showConfirmDialog(vm.getMainFrame(), "죽을 것인가\n성장할
	// 것인가\n모험하러\n나가시겠습니까?\n(잔여" + "회)",
	// "모험하러 갈까?",JOptionPane.YES_NO_OPTION);
	//
	// advCon.AdventreGoStop(answer);
	// }

	public void loadAdventureView() {
		// 모험 하기 라벨
		startLabel = new JLabel("진행!");
		startLabel.setBounds(280, 545, 80, 80);
		startLabel.setForeground(Color.white);
		startLabel.setFont(new Font("@바탕", Font.BOLD, 18));

		// 모험 뒤로가기 라벨
		closeLabel = new JLabel("... 그만둔다");
		closeLabel.setBounds(104, 545, 170, 80);
		closeLabel.setForeground(Color.white);
		closeLabel.setFont(new Font("@바탕", Font.BOLD, 18));

		// 최상단에 이벤트 번호.
		eventTypeLabel = new JLabel("Event 01");
		eventTypeLabel.setSize(200, 80);
		eventTypeLabel.setFont(new Font("@바탕", Font.PLAIN, 20));
		eventTypeLabel.setLocation(180, 40);

		// 이벤트 제목
		eventTitleLabel = new JLabel("몸이 가려워");
		eventTitleLabel.setSize(300, 100);
		eventTitleLabel.setFont(new Font("@바탕", Font.PLAIN, 25));
		eventTitleLabel.setLocation(155, 60);

		// 가운데 윈도우 배경.
		centerBgLabel = new JLabel();
		centerBgLabel.setIcon(new ImageIcon(resRoad.getPopupBgImg()));
		centerBgLabel.setBackground(new Color(90, 178, 222));
		centerBgLabel.setBounds(15, 120, 420, 500);

		// 모험 이미지
		eventImgLabel = new JLabel();
		eventImgLabel.setIcon(new ImageIcon(resRoad.getEventImg01()));
		eventImgLabel.setSize(400, 250);
		eventImgLabel.setLocation(10, 10);

		// 뒤의 팝업 배경 띄우기.
		adventureBgLabel = new JLabel();
		adventureBgLabel.setBackground(new Color(16, 142, 247));
		adventureBgLabel.setIcon(new ImageIcon(resRoad.getAdventureBgImg()));
		adventureBgLabel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());

		// 모험 설명해주기.
		eventExplainLabel = new JLabel("", SwingConstants.CENTER);
		eventExplainLabel.setFont(new Font("돋움", Font.BOLD, 20));
		eventExplainLabel.setText("<html>몸이 가렵다.<br>" + "아무리 생각해도 기생충 같다.<br>" + "수면에 점프하면<br>"
				+ "기생충을 떨어뜨릴 수 있을 것 같다.<br>" + "단지 점프의 충격은 제법 아플지도.<br>" + "어떻게 하지?");
		eventExplainLabel.setBounds(20, 210, 400, 250);

		// 생존확률.
		survivorRateLabel = new JLabel("", SwingConstants.CENTER);
		survivorRateLabel.setFont(new Font("돋움", Font.BOLD, 18));
		survivorRateLabel.setText("생존확률 : " + advCon.getSurvivorRate(1) + "%");
		survivorRateLabel.setForeground(Color.RED);
		survivorRateLabel.setBounds(20, 325, 400, 200);

		// 아래쪽 버튼 모음.
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

		adventureBgLabel.add(closeLabel); // 그만둔다 라벨
		adventureBgLabel.add(startLabel); // 진행 라벨

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
		vm.setPanel(vm.getAdventureName(), adventureViewPanel);// 1번째.

		vm.getMainFrame().add(adventureViewPanel);

	}

	public void loadAdventureView(int select) {

		// 모험 하기 라벨
		startLabel = new JLabel("진행!");
		startLabel.setBounds(280, 545, 80, 80);
		startLabel.setForeground(Color.white);
		startLabel.setFont(new Font("@바탕", Font.BOLD, 18));

		// 모험 뒤로가기 라벨
		closeLabel = new JLabel("... 그만둔다");
		closeLabel.setBounds(104, 545, 170, 80);
		closeLabel.setForeground(Color.white);
		closeLabel.setFont(new Font("@바탕", Font.BOLD, 18));

		this.select = select;

		// 최상단에 이벤트 번호.
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
		eventTypeLabel.setFont(new Font("@바탕", Font.PLAIN, 20));
		eventTypeLabel.setLocation(180, 40);

		// 가운데 윈도우 배경.
		centerBgLabel = new JLabel();
		centerBgLabel.setIcon(new ImageIcon(resRoad.getPopupBgImg()));
		centerBgLabel.setBackground(new Color(90, 178, 222));
		centerBgLabel.setBounds(15, 120, 420, 500);

		// 모험 이미지
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

		// 뒤의 팝업 배경 띄우기.
		adventureBgLabel = new JLabel();
		adventureBgLabel.setBackground(new Color(16, 142, 247));
		adventureBgLabel.setIcon(new ImageIcon(resRoad.getAdventureBgImg()));
		adventureBgLabel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight());

		// 모험 설명해주기.
		eventExplainLabel = new JLabel("", SwingConstants.CENTER);
		eventExplainLabel.setFont(new Font("돋움", Font.BOLD, 20));

		String htmlText = null;
		switch (select) {
		case 1:
			htmlText = "<html>몸이 가렵다.<br>" + "아무리 생각해도 기생충 같다.<br>" + "수면에 점프하면<br>" + "기생충을 떨어뜨릴 수 있을 것 같다.<br>"
					+ "단지 점프의 충격은 제법 아플지도.<br>" + "어떻게 하지?";
			break;
		case 2:
			htmlText = "<html>깊은 곳까지 헤엄쳐 왔습니다.<br>" + "이대로 진행하면 맛있는 먹이가 보일지도.<br>" + "단지 이 이상 진행하면 위험할지도 몰라.<br>"
					+ "어떻게 하지?";
			break;
		case 3:
			htmlText = "<html>눈 앞에 큰 바위가.<br>" + "저 바위의 뒷편에는 많은 먹이가 있을 것 같다.<br>" + "힘을 내서 먹이까지 대쉬!<br>"
					+ "단지 뭔가 싫은 기분이 든다...<br>" + "어떻게 하지?";
			break;
		case 4:
			htmlText = "<html>이런, 아침해다. 따뜻하고<br>" + "먹이도 정말 많을 것 같아.<br>" + "아침해를 향해 버텨볼까? 그것도 나쁘지 않아<br>" + "어떻게 하지?";
			break;
		}
		eventExplainLabel.setText(htmlText);
		eventExplainLabel.setBounds(20, 210, 400, 250);

		// 생존확률.
		survivorRateLabel = new JLabel("", SwingConstants.CENTER);
		survivorRateLabel.setFont(new Font("돋움", Font.BOLD, 18));
		survivorRateLabel.setText("생존확률 : " + advCon.getSurvivorRate(1) + "%");
		survivorRateLabel.setForeground(Color.RED);
		survivorRateLabel.setBounds(20, 325, 400, 200);

		// 아래쪽 버튼 모음.
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
		vm.setPanel(vm.getAdventureName(), adventureViewPanel);// 1번째.

		vm.getMainFrame().add(adventureViewPanel);

	}

}
