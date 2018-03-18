package kh.gbc.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;

import kh.gbc.controller.StartController;
import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class StartView {
	private StartController startCtl;
	private ResourceRoad resRoad = new ResourceRoad();
	private ViewModel vm = new ViewModel();
	private JButton startBtn;
	private JPanel startViewPanel;
	
	public StartView() {}
	public StartView(StartController startCtl)
	{
		this.startCtl = startCtl;
	}
	
	public void loadStartView()
	{
		startBtn = new JButton(new ImageIcon(resRoad.getMainBgImg()));
		startBtn.setBounds(0,0,vm.getFrameWidth(),vm.getFrameHeight());
		startBtn.addActionListener(e->{startCtl.btnAction();});
		
		startViewPanel = new JPanel();
		startViewPanel.setLayout(new BorderLayout());
		startViewPanel.setBounds(0, 0, vm.getFrameWidth(), vm.getFrameHeight() );
		startViewPanel.add(startBtn,BorderLayout.CENTER);
		setStartPanelVisible(true);
		
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("°³º¹Ä¡");
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setSize(vm.getFrameWidth()+5,vm.getFrameHeight()+20);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
		mainFrame.setLayout(null);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.add(startViewPanel,BorderLayout.CENTER);
		
		vm.setMainFrame(mainFrame);		
	}
	
	public void setStartPanelVisible(boolean direc)
	{
		startViewPanel.setVisible(direc);
	}
}
