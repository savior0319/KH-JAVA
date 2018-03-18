package kh.gbc.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.gbc.controller.OptionController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class OptionView {
	private OptionController optionController;
	private ViewModel vm =  ViewModel.getInstance();
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private JPanel optionPanel;
	private JButton optionUpBack;
	private JButton optionCreditBtn;
	private JButton saveBtn;
	private JButton loadBtn;
	private JLabel optionBgLabel;
	private JLabel saveLabel;
	private JLabel loadLabel;
	private JLabel creditLabel;
	
	private Font font = new Font("맑은고딕", Font.BOLD,25);
	public OptionView() {}
	public OptionView(OptionController optionController)
	{
		this.optionController = optionController;
	}
	
	public void loadOptionView()
	{
	
		optionUpBack = new JButton();
		optionUpBack = vm.fitImageBtn(optionUpBack);
		optionUpBack.setIcon(new ImageIcon(resRoad.getXIconImg()));
		optionUpBack.setBounds(390, 18, 25, 25);
		optionUpBack.addActionListener(e->{optionController.backToLobby();});

		optionCreditBtn = new JButton();
		optionCreditBtn.setIcon(new ImageIcon(resRoad.getMenuBgImg()));
		optionCreditBtn.setBounds(100, 63, 300, 70);
		optionCreditBtn = vm.fitImageBtn(optionCreditBtn);
		
		creditLabel = new JLabel("Credit - HwangVengers");
		creditLabel.setFont(font);
		optionCreditBtn.add(creditLabel);
		
		saveBtn = new JButton();
		saveBtn.setIcon(new ImageIcon(resRoad.getMenuBgImg()));
		saveBtn.setBounds(100, 153, 300, 70);
		saveBtn = vm.fitImageBtn(saveBtn);
		
		saveLabel = new JLabel("저장하기");
		saveLabel.setFont(font);
		saveBtn.add(saveLabel);
		
		loadBtn = new JButton();
		loadBtn.setIcon(new ImageIcon(resRoad.getMenuBgImg()));
		loadBtn.setBounds(100, 243, 300, 70);
		loadBtn = vm.fitImageBtn(loadBtn);
		
		loadLabel = new JLabel("불러오기");
		loadLabel.setFont(font);
		loadBtn.add(loadLabel);

		optionBgLabel = new JLabel();
		optionBgLabel.setIcon(new ImageIcon(resRoad.getPowerUpBgImg()));
		optionBgLabel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		
		optionBgLabel.add(loadBtn);
		optionBgLabel.add(saveBtn);
		optionBgLabel.add(optionCreditBtn);
		optionBgLabel.add(optionUpBack);
		

		optionPanel = new JPanel();
		optionPanel.setBounds(0, -5, vm.getFrameWidth(), vm.getFrameHeight());
		optionPanel.add(optionBgLabel);
		
		vm.setPanel(vm.getOptionName(), optionPanel);

		vm.getMainFrame().add(optionPanel);
	}
}
