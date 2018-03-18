package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.PowerUpNewFeedController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class PowerUpNewFeedView {
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private JPanel powerUpFeedPanel;
	private JLabel powerUpFeedBgLabel;
	private JLabel powerUpTitle;
	private JLabel powerUpMp;
	private JLabel powerUpPt;
	private JLabel powerUpSubTitle;

	private JButton jellyFishBtn;
	private JButton myulChiBtn;
	private JButton ozingerBtn;
	private JButton shrimpBtn;
	private JButton powerUpBack;

	private JLabel jellyFishimg;
	private JLabel myulChiImg;
	private JLabel ozingerImg;
	private JLabel shrimpImg;

	private JLabel jellyFishMsg;
	private JLabel myulChiMsg;
	private JLabel ozingerMsg;
	private JLabel shrimpMsg;

	private PowerUpNewFeedController powerUpNewFeedCon;

	public PowerUpNewFeedView() {

	}

	public PowerUpNewFeedView(PowerUpNewFeedController powerUpNewFeedCon) {
		this.powerUpNewFeedCon = powerUpNewFeedCon;
	}

	public void loadPowerUpNewFeedView() {

		powerUpTitle = new JLabel("ÆÄ¿ö¾÷");
		powerUpTitle.setForeground(Color.WHITE);
		powerUpTitle.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 25));
		powerUpTitle.setBounds(160, 20, 100, 20);

		powerUpMp = new JLabel("MP");
		powerUpMp.setForeground(Color.WHITE);
		powerUpMp.setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 13));
		powerUpMp.setBounds(270, 22, 30, 20);

		powerUpPt = new JLabel("0 PT");
		powerUpPt.setForeground(Color.WHITE);
		powerUpPt.setFont(new Font("¸¼Àº°íµñ", Font.PLAIN, 13));
		powerUpPt.setBounds(300, 22, 30, 20);

		powerUpBack = new JButton();
		powerUpBack = vm.fitImageBtn(powerUpBack);
		powerUpBack.setIcon(new ImageIcon(resRoad.getXIconImg()));
		powerUpBack.setBounds(390, 18, 25, 25);
		powerUpBack.addActionListener(e -> {
			powerUpNewFeedCon.backToPowerUpView();
		});

		powerUpSubTitle = new JLabel();
		powerUpSubTitle
				.setIcon(new ImageIcon(resRoad.getPowerUpNewFeedImg().getScaledInstance(490, 120, Image.SCALE_SMOOTH)));
		powerUpSubTitle.setBounds(-25, 55, 490, 120);

		jellyFishimg = new JLabel();
		jellyFishimg.setIcon(new ImageIcon(resRoad.getJellyfish()));
		jellyFishimg.setBounds(30, 210, 70, 70);

		ozingerImg = new JLabel();
		ozingerImg.setIcon(new ImageIcon(resRoad.getOzinger()));
		ozingerImg.setBounds(30, 330, 70, 70);

		shrimpImg = new JLabel();
		shrimpImg.setIcon(new ImageIcon(resRoad.getShrimph()));
		shrimpImg.setBounds(30, 450, 70, 70);

		myulChiImg = new JLabel();
		myulChiImg.setIcon(new ImageIcon(resRoad.getMyulChi()));
		myulChiImg.setBounds(30, 570, 70, 70);

		jellyFishBtn = new JButton();
		jellyFishBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		jellyFishBtn.setBounds(10, 190, 420, 110);
		jellyFishBtn = vm.fitImageBtn(jellyFishBtn);

		ozingerBtn = new JButton();
		ozingerBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		ozingerBtn.setBounds(10, 310, 420, 110);
		ozingerBtn = vm.fitImageBtn(ozingerBtn);

		shrimpBtn = new JButton();
		shrimpBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		shrimpBtn.setBounds(10, 430, 420, 110);
		shrimpBtn = vm.fitImageBtn(shrimpBtn);

		myulChiBtn = new JButton();
		myulChiBtn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		myulChiBtn.setBounds(10, 550, 420, 110);
		myulChiBtn = vm.fitImageBtn(myulChiBtn);

		jellyFishMsg = new JLabel("<html><font color='white'><span style='font-size:24px'> ÇØÆÄ¸®     +0.2KG</span></font>"
				+ "<br>" + "<font color='white'><span style='font-size:12px'>\"ºñ¹ÐºÀÅõ¶óµµ ¸ÔÀ» ¼ö ÀÖ´Ù!\"</span></font>"
				+ "</html>");
		jellyFishMsg.setBounds(130, 188, 300, 100);

		ozingerMsg = new JLabel("<html><font color='white'><span style='font-size:24px'> ¿ÀÂ¡¾î   +0.4KG</span></font>"
				+ "<br>"
				+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;220MP</span></font>"
				+ "</html>");
		ozingerMsg.setBounds(130, 308, 300, 100);

		shrimpMsg = new JLabel("<html><font color='white'><span style='font-size:24px'> »õ¿ì     +0.7KG</span></font>"
				+ "<br>"
				+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;600MP</span></font>"
				+ "</html>");
		shrimpMsg.setBounds(130, 428, 300, 100);

		myulChiMsg = new JLabel("<html><font color='white'><span style='font-size:24px'> Á¤¾î¸®    +1.1KG</span></font>"
				+ "<br>"
				+ "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;1200MP</span></font>"
				+ "</html>");
		myulChiMsg.setBounds(130, 548, 300, 100);

		powerUpFeedBgLabel = new JLabel();
		powerUpFeedBgLabel.setIcon(new ImageIcon(resRoad.getPowerUpBgImg()));
		powerUpFeedBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpFeedBgLabel.add(powerUpTitle);
		powerUpFeedBgLabel.add(powerUpMp);
		powerUpFeedBgLabel.add(powerUpPt);
		powerUpFeedBgLabel.add(powerUpSubTitle);
		powerUpFeedBgLabel.add(powerUpBack);

		powerUpFeedBgLabel.add(jellyFishMsg);
		powerUpFeedBgLabel.add(jellyFishimg);
		powerUpFeedBgLabel.add(jellyFishBtn);

		powerUpFeedBgLabel.add(ozingerMsg);
		powerUpFeedBgLabel.add(ozingerImg);
		powerUpFeedBgLabel.add(ozingerBtn);

		powerUpFeedBgLabel.add(shrimpMsg);
		powerUpFeedBgLabel.add(shrimpImg);
		powerUpFeedBgLabel.add(shrimpBtn);

		powerUpFeedBgLabel.add(myulChiMsg);
		powerUpFeedBgLabel.add(myulChiImg);
		powerUpFeedBgLabel.add(myulChiBtn);

		powerUpFeedPanel = new JPanel();
		powerUpFeedPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpFeedPanel.add(powerUpFeedBgLabel);

		vm.setPanel(vm.getPowerNewFeedName(), powerUpFeedPanel);

		vm.getMainFrame().add(powerUpFeedPanel);
	}
}
