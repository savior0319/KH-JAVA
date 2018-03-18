package kh.gbc.model.vo.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import kh.gbc.model.vo.ResourceRoad;
import kh.gbc.model.vo.ViewModel;

public class UIBtnClass extends JButton implements ActionListener{
	private ResourceRoad resRoad = ResourceRoad.getInstance();
	private ViewModel vm = ViewModel.getInstance();
	public UIBtnClass()
	{
		new JButton(new ImageIcon(resRoad.getBlueBtnImg()));
		setBounds(300, 300, 99, 73);
		vm.fitImageBtn(this);
//		addActionListener(e ->{lobbyCtl.feedMove(this); });
//		setRolloverIcon(new ImageIcon(resRoad.getBluePresImg()));	
	}

	public void addEvent(ActionListener l)
	{
		addActionListener(l);
	}
@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
