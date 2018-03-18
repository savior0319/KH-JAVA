package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.PowerUpLvUpController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class PowerUpLvUpView {

	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private JPanel powerUpPanel;
	private JLabel powerUpBgLabel;
	private JLabel powerUpTitle;
	private JLabel powerUpMp;
	private JLabel powerUpPt;
	private JLabel powerUpSubTitle;

	private JButton lev2Btn;
	private JButton lev3Btn;
	private JButton lev4Btn;
	private JButton lev5Btn;
	private JButton powerUpBack;

	private JLabel lev2Img;
	private JLabel lev3Img;
	private JLabel lev4Img;
	private JLabel lev5Img;
	
	private JLabel lev2Msg;
	private JLabel lev3Msg;
	private JLabel lev4Msg;
	private JLabel lev5Msg;

	private PowerUpLvUpController powerlvController;

	public PowerUpLvUpView() {
	}

	public PowerUpLvUpView(PowerUpLvUpController powerlvController) {
		this.powerlvController = powerlvController;
	}

	public void loadPowerUpLvUpView() {

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
		powerUpBack.addActionListener(e->{powerlvController.backToPowerUpView();});
		
		lev2Img = new JLabel();
		lev2Img.setIcon(new ImageIcon(resRoad.getLv2()));
		lev2Img.setBounds(30, 210, 70, 70);
		
		lev3Img = new JLabel();
		lev3Img.setIcon(new ImageIcon(resRoad.getLv3()));
		lev3Img.setBounds(30, 330, 70, 70);

		lev4Img = new JLabel();
		lev4Img.setIcon(new ImageIcon(resRoad.getLv4()));
		lev4Img.setBounds(30, 450, 70, 70);

		lev5Img = new JLabel();
		lev5Img.setIcon(new ImageIcon(resRoad.getLv5()));
		lev5Img.setBounds(30, 570, 70, 70);

		lev2Btn = new JButton();
		lev2Btn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		lev2Btn.setBounds(10, 190, 420, 110);
		lev2Btn = vm.fitImageBtn(lev2Btn);

		lev3Btn = new JButton();
		lev3Btn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		lev3Btn.setBounds(10, 310, 420, 110);
		lev3Btn = vm.fitImageBtn(lev3Btn);

		lev4Btn = new JButton();
		lev4Btn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		lev4Btn.setBounds(10, 430, 420, 110);
		lev4Btn = vm.fitImageBtn(lev4Btn);

		lev5Btn = new JButton();
		lev5Btn.setIcon(new ImageIcon(resRoad.getBlueBtnImg()));
		lev5Btn.setBounds(10, 550, 420, 110);
		lev5Btn = vm.fitImageBtn(lev5Btn);
		
		lev2Msg = new JLabel("<html><font color='white'><span style='font-size:20px'> 먹이의 수가 8개가 된다 </span></font>"
				+ "<br>" + "<font color='yellow'><span style='font-size:14px'>&emsp;&emsp;&emsp;&emsp;&emsp;24MP</span></font>" + "</html>");
		lev2Msg.setBounds(120, 190, 300, 100);
		
		lev3Msg = new JLabel("<html><font color='white'><span style='font-size:20px'> 레벨 2 구입으로 해방</span></font></html>");
			
		lev3Msg.setBounds(120, 310, 300, 100);
		
		lev4Msg = new JLabel("<html><font color='white'><span style='font-size:20px'> 레벨 3 구입으로 해방</span></font></html>");
		lev4Msg.setBounds(120, 430, 300, 100);
		
		lev5Msg = new JLabel("<html><font color='white'><span style='font-size:20px'> 레벨 4 구입으로 해방</span></font></html>");
		lev5Msg.setBounds(120, 550, 300, 100);
		

		powerUpSubTitle = new JLabel();
		powerUpSubTitle.setIcon(
				new ImageIcon(resRoad.getPowerUpFeeCountImg().getScaledInstance(490, 120, Image.SCALE_SMOOTH)));
		powerUpSubTitle.setBounds(-25, 55, 490, 120);

		powerUpBgLabel = new JLabel();
		powerUpBgLabel.setIcon(new ImageIcon(resRoad.getPowerUpBgImg()));
		powerUpBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpBgLabel.add(powerUpTitle);
		powerUpBgLabel.add(powerUpMp);
		powerUpBgLabel.add(powerUpPt);
		powerUpBgLabel.add(powerUpSubTitle);
		powerUpBgLabel.add(powerUpBack);
		
		powerUpBgLabel.add(lev2Msg);
		powerUpBgLabel.add(lev2Img);
		powerUpBgLabel.add(lev2Btn);
		
		powerUpBgLabel.add(lev3Msg);
		powerUpBgLabel.add(lev3Img);
		powerUpBgLabel.add(lev3Btn);
		
		powerUpBgLabel.add(lev4Msg);
		powerUpBgLabel.add(lev4Img);
		powerUpBgLabel.add(lev4Btn);
		
		powerUpBgLabel.add(lev5Msg);
		powerUpBgLabel.add(lev5Img);
		powerUpBgLabel.add(lev5Btn);

		powerUpPanel = new JPanel();
		powerUpPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		powerUpPanel.add(powerUpBgLabel);
		vm.setPanel(vm.getPowerLvUpName(), powerUpPanel);

		vm.getMainFrame().add(powerUpPanel);
	}

}
