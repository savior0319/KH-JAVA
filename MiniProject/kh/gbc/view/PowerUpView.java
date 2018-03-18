package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.PowerUpController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class PowerUpView {
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private JPanel powerUpPanel;
	private JLabel powerUpBgLabel;
	private JButton powerUpNewAdventrueBtn;
	private JButton powerUpNewFeedBtn;
	private JButton powerUpFeedCountBtn;
	private JButton powerUpBack;
	private JLabel powerUpMsg;
	private JLabel powerUpTitle;
	private JLabel powerUpMp;
	private JLabel powerUpPt;

	private PowerUpController puC;

	public PowerUpView() {
	}

	public PowerUpView(PowerUpController puC) {
		this.puC = puC;
	}

	public void loadPowerUpView() {

		powerUpTitle = new JLabel("파워업");
		powerUpTitle.setForeground(Color.WHITE);
		powerUpTitle.setFont(new Font("맑은고딕", Font.BOLD, 25));
		powerUpTitle.setBounds(160, 20, 100, 20);

		powerUpMp = new JLabel("MP");
		powerUpMp.setForeground(Color.WHITE);
		powerUpMp.setFont(new Font("맑은고딕", Font.PLAIN, 13));
		powerUpMp.setBounds(270, 22, 30, 20);

		powerUpPt = new JLabel("0 PT");
		powerUpPt.setForeground(Color.WHITE);
		powerUpPt.setFont(new Font("맑은고딕", Font.PLAIN, 13));
		powerUpPt.setBounds(300, 22, 30, 20);

		powerUpBack = new JButton();
		powerUpBack.setIcon(new ImageIcon(resRoad.getXIconImg()));// 뒤로가기.
		powerUpBack.setBounds(390, 18, 25, 25);
		powerUpBack.addActionListener(e -> {
			puC.backToLobby();
		});
		powerUpBack = vm.fitImageBtn(powerUpBack);

		powerUpNewAdventrueBtn = new JButton();
		powerUpNewAdventrueBtn.setIcon(new ImageIcon(resRoad.getPowerUpNewAdImg()));
		powerUpNewAdventrueBtn.setBounds(10, 180, 420, 100);

		String msg = "<html>커지기 위해서,<br>살아남기 위해서, 파워업하여<br>한단계 위의 개복치를 노려라!</html>";
		powerUpMsg = new JLabel(msg);
		powerUpMsg.setForeground(Color.BLUE);
		powerUpMsg.setFont(new Font("맑은고딕", Font.BOLD, 18));
		powerUpMsg.setBounds(100, 65, 420, 100);

		// 새로운 모험.
		powerUpNewAdventrueBtn = new JButton();
		powerUpNewAdventrueBtn.setIcon(new ImageIcon(resRoad.getPowerUpNewAdImg()));
		powerUpNewAdventrueBtn.setBounds(30, 180, 400, 100);
		powerUpNewAdventrueBtn = vm.fitImageBtn(powerUpNewAdventrueBtn);
		powerUpNewAdventrueBtn.addActionListener(e -> {
			puC.startNewAdventure();
		});

		// 새로운 먹이
		powerUpNewFeedBtn = new JButton();
		powerUpNewFeedBtn.setIcon(new ImageIcon(resRoad.getPowerUpNewFeedImg()));
		powerUpNewFeedBtn.setBounds(30, 320, 400, 100);
		powerUpNewFeedBtn = vm.fitImageBtn(powerUpNewFeedBtn);
		powerUpNewFeedBtn.addActionListener(e -> {
			puC.startNewFeed();
		});

		// 먹이 갯수 올리기.
		powerUpFeedCountBtn = new JButton();
		powerUpFeedCountBtn.setIcon(new ImageIcon(resRoad.getPowerUpFeeCountImg()));
		powerUpFeedCountBtn.setBounds(30, 460, 400, 100);
		powerUpFeedCountBtn = vm.fitImageBtn(powerUpFeedCountBtn);
		powerUpFeedCountBtn.addActionListener(e -> {
			puC.startLvUp();
		});

		powerUpBgLabel = new JLabel();
		powerUpBgLabel.setIcon(new ImageIcon(resRoad.getPowerUpBgImg()));
		powerUpBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpBgLabel.add(powerUpNewAdventrueBtn);
		powerUpBgLabel.add(powerUpNewFeedBtn);
		powerUpBgLabel.add(powerUpFeedCountBtn);
		powerUpBgLabel.add(powerUpMsg);
		powerUpBgLabel.add(powerUpTitle);
		powerUpBgLabel.add(powerUpMp);
		powerUpBgLabel.add(powerUpPt);
		powerUpBgLabel.add(powerUpBack);

		powerUpPanel = new JPanel();
		powerUpPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpPanel.add(powerUpBgLabel);
		vm.setPanel(vm.getPowerUpName(), powerUpPanel);
		vm.getMainFrame().add(powerUpPanel);
	}
}
