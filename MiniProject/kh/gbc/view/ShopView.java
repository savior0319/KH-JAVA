package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.ShopController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class ShopView {

	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	private ShopController shopController;
	private JPanel shopBgPanel;
	
	private JLabel shopBgLabel;
	private JLabel shopTitle;
	private JLabel btnLabel1;
	private JLabel btnLabel2;
	private JLabel btnLabel3;
	private JLabel btnLabel4;
	private JLabel btnLabel5;
	
	private JButton shopBack;
	private JButton shopBtn1;
	private JButton shopBtn2;
	private JButton shopBtn3;
	private JButton shopBtn4;
	private JButton shopBtn5;

	public ShopView() {
	}

	public ShopView(ShopController shopController) {
		this.shopController = shopController;
	}

	public void loadShopView() {

		shopTitle = new JLabel("»óÁ¡");
		shopTitle.setForeground(Color.WHITE);
		shopTitle.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 30));
		shopTitle.setBounds(195, 15, 100, 30);

		shopBack = new JButton();
		shopBack = vm.fitImageBtn(shopBack);
		shopBack.setIcon(new ImageIcon(resRoad.getXIconImg()));
		shopBack.setBounds(390, 18, 25, 25);
		shopBack.addActionListener(e -> {shopController.backToLobby();});

		shopBtn1 = new JButton();
		shopBtn1.setIcon(new ImageIcon(resRoad.getShopBtnImg()));
		shopBtn1.setBounds(15, 70, 420, 110);
		shopBtn1 = vm.fitImageBtn(shopBtn1);

		shopBtn2 = new JButton();
		shopBtn2.setIcon(new ImageIcon(resRoad.getShopBtnImg()));
		shopBtn2.setBounds(15, 200, 420, 110);
		shopBtn2 = vm.fitImageBtn(shopBtn2);

		shopBtn3 = new JButton();
		shopBtn3.setIcon(new ImageIcon(resRoad.getShopBtnImg()));
		shopBtn3.setBounds(15, 330, 420, 110);
		shopBtn3 = vm.fitImageBtn(shopBtn3);

		shopBtn4 = new JButton();
		shopBtn4.setIcon(new ImageIcon(resRoad.getShopBtnImg()));
		shopBtn4.setBounds(15, 460, 420, 110);
		shopBtn4 = vm.fitImageBtn(shopBtn4);

		shopBtn5 = new JButton();
		shopBtn5.setIcon(new ImageIcon(resRoad.getShopBtnImg()));
		shopBtn5.setBounds(15, 590, 420, 110);
		shopBtn5 = vm.fitImageBtn(shopBtn5);

		btnLabel1 = new JLabel(
				"<html><font color='white'><span style='font-size:24px'> 1500MP&emsp;&emsp;0.99$</span></font></html>");
		btnLabel1.setBounds(100, 70, 300, 100);

		btnLabel2 = new JLabel(
				"<html><font color='white'><span style='font-size:24px'> 5000MP&emsp;&emsp;2.75$</span></font></html>");
		btnLabel2.setBounds(100, 200, 300, 100);

		btnLabel3 = new JLabel(
				"<html><font color='white'><span style='font-size:24px'> 9000MP&emsp;&emsp;4.59$</span></font></html>");
		btnLabel3.setBounds(100, 330, 300, 100);

		btnLabel4 = new JLabel(
				"<html><font color='white'><span style='font-size:24px'> 20000MP&emsp;&emsp;9.19$</span></font></html>");
		btnLabel4.setBounds(100, 460, 300, 100);

		btnLabel5 = new JLabel(
				"<html><font color='white'><span style='font-size:24px'> 50000MP&emsp;&emsp;18.38$</span></font></html>");
		btnLabel5.setBounds(100, 590, 300, 100);

		shopBgLabel = new JLabel();
		shopBgLabel.setIcon(new ImageIcon(resRoad.getShopBgImg()));
		shopBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		shopBgLabel.add(shopTitle);
		shopBgLabel.add(shopBack);

		shopBgLabel.add(btnLabel1);
		shopBgLabel.add(shopBtn1);
		shopBgLabel.add(btnLabel2);
		shopBgLabel.add(shopBtn2);
		shopBgLabel.add(btnLabel3);
		shopBgLabel.add(shopBtn3);
		shopBgLabel.add(btnLabel4);
		shopBgLabel.add(shopBtn4);
		shopBgLabel.add(btnLabel5);
		shopBgLabel.add(shopBtn5);

		shopBgPanel = new JPanel();
		shopBgPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		shopBgPanel.add(shopBgLabel);
		vm.setPanel(vm.getShopName(), shopBgPanel);

		vm.getMainFrame().add(shopBgPanel);
	}
}
