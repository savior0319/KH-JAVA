package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.OptionView;

public class OptionController {
	private ViewModel vm = ViewModel.getInstance();
	private OptionView optionView;

	public void startOption() {
		optionView = new OptionView(this);
		optionView.loadOptionView();
	}

	public void backToLobby() {
		vm.getPanel(vm.getOptionName()).setVisible(false);
		vm.getPanel(vm.getLobbyName()).setVisible(true);
	}
}
