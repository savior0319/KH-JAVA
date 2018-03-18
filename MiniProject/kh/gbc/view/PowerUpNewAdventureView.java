package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.PowerUpNewAdventureController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class PowerUpNewAdventureView {
	private PowerUpNewAdventureController powerUpAdvCon;
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private JPanel powerUpFeedPanel;
	private JLabel powerUpFeedBgLabel;
	private JLabel powerUpTitle;
	private JLabel powerUpMp;
	private JLabel powerUpPt;
	private JLabel powerUpSubTitle;

	private JButton powerUpBack;
	private JButton ganZilBtn;
	private JButton deepBlueBtn;
	private JButton rockBtn;
	private JButton sanhoBtn;

	private JLabel ganZilImg;
	private JLabel deepBlueImg;
	private JLabel rockImg;
	private JLabel sanhoImg;

	private JLabel ganZilMsg;
	private JLabel deepBlueMsg;
	private JLabel rockMsg;
	private JLabel sanhoMsg;

	public PowerUpNewAdventureView() {
	}

	public PowerUpNewAdventureView(PowerUpNewAdventureController powerUpAdvCon) {
		this.powerUpAdvCon = powerUpAdvCon;
	}

	public void loadPowerUpNewAdventureView() {

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
		powerUpBack = vm.fitImageBtn(powerUpBack);
		powerUpBack.setIcon(new ImageIcon(resRoad.getXIconImg()));
		powerUpBack.setBounds(390, 18, 25, 25);
		powerUpBack.addActionListener(e -> {
			powerUpAdvCon.backToPowerUpView();
		});

		powerUpSubTitle = new JLabel();
		powerUpSubTitle
				.setIcon(new ImageIcon(resRoad.getPowerUpNewAdImg().getScaledInstance(490, 120, Image.SCALE_SMOOTH)));
		powerUpSubTitle.setBounds(-25, 55, 490, 120);

		ganZilImg = new JLabel();
		ganZilImg.setIcon(new ImageIcon(resRoad.gsetGanzil()));
		ganZilImg.setBounds(30, 210, 70, 70);

		deepBlueImg = new JLabel();
		deepBlueImg.setIcon(new ImageIcon(resRoad.getDeepBlue()));
		deepBlueImg.setBounds(30, 330, 70, 70);

		rockImg = new JLabel();
		rockImg.setIcon(new ImageIcon(resRoad.getRock()));
		rockImg.setBounds(30, 450, 70, 70);

		sanhoImg = new JLabel();
		sanhoImg.setIcon(new ImageIcon(resRoad.getSanho()));
		sanhoImg.setBounds(30, 570, 70, 70);

		ganZilBtn = new JButton();
		ganZilBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		ganZilBtn.setBounds(10, 190, 420, 110);
		ganZilBtn = vm.fitImageBtn(ganZilBtn);

		deepBlueBtn = new JButton();
		deepBlueBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		deepBlueBtn.setBounds(10, 310, 420, 110);
		deepBlueBtn = vm.fitImageBtn(deepBlueBtn);

		rockBtn = new JButton();
		rockBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		rockBtn.setBounds(10, 430, 420, 110);
		rockBtn = vm.fitImageBtn(rockBtn);

		sanhoBtn = new JButton();
		sanhoBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		sanhoBtn.setBounds(10, 550, 420, 110);
		sanhoBtn = vm.fitImageBtn(sanhoBtn);

		ganZilMsg = new JLabel("<html><font color='white'><span style='font-size:20px'> 몸이 가려워     +2.6KG</span></font>"
				+ "<br>" + "<font color='white'><span style='font-size:12px'>\"나는 어디까지라도 점프 할 수 있어!\"</span></font>"
				+ "</html>");
		ganZilMsg.setBounds(118, 188, 300, 100);

		deepBlueMsg = new JLabel(
				"<html><font color='white'><span style='font-size:16px'> 해저에는 진수성찬이     +3.9KG</span></font>" + "<br>"
						+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;100MP</span></font>"
						+ "</html>");
		deepBlueMsg.setBounds(118, 308, 300, 100);

		rockMsg = new JLabel(
				"<html><font color='white'><span style='font-size:14px'> 바위의 그림자에는 보물이     +5.0KG</span></font>"
						+ "<br>"
						+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;250MP</span></font>"
						+ "</html>");
		rockMsg.setBounds(118, 428, 300, 100);

		sanhoMsg = new JLabel("<html><font color='white'><span style='font-size:23px'> 햇볕 쬐기    +14.0KG</span></font>"
				+ "<br>"
				+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;720MP</span></font>"
				+ "</html>");
		sanhoMsg.setBounds(118, 548, 300, 100);

		powerUpFeedBgLabel = new JLabel();
		powerUpFeedBgLabel.setIcon(new ImageIcon(resRoad.getPowerUpBgImg()));
		powerUpFeedBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpFeedBgLabel.add(powerUpTitle);
		powerUpFeedBgLabel.add(powerUpMp);
		powerUpFeedBgLabel.add(powerUpPt);
		powerUpFeedBgLabel.add(powerUpBack);
		powerUpFeedBgLabel.add(powerUpSubTitle);

		powerUpFeedBgLabel.add(ganZilMsg);
		powerUpFeedBgLabel.add(ganZilImg);
		powerUpFeedBgLabel.add(ganZilBtn);

		powerUpFeedBgLabel.add(deepBlueMsg);
		powerUpFeedBgLabel.add(deepBlueImg);
		powerUpFeedBgLabel.add(deepBlueBtn);

		powerUpFeedBgLabel.add(rockMsg);
		powerUpFeedBgLabel.add(rockImg);
		powerUpFeedBgLabel.add(rockBtn);

		powerUpFeedBgLabel.add(sanhoMsg);
		powerUpFeedBgLabel.add(sanhoImg);
		powerUpFeedBgLabel.add(sanhoBtn);

		powerUpFeedPanel = new JPanel();
		powerUpFeedPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpFeedPanel.add(powerUpFeedBgLabel);

		vm.setPanel(vm.getPowerNewAdventureName(), powerUpFeedPanel);
		vm.getMainFrame().add(powerUpFeedPanel);
	}

}
