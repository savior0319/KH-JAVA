package kh.gbc.controller;

import kh.gbc.model.vo.ViewModel;
import kh.gbc.view.LobbyView;
import kh.gbc.view.ShopView;

public class ShopController {
	private ViewModel vm = ViewModel.getInstance();
	private ShopView sV;
	private LobbyView lv;

	public void startShop() {
		sV = new ShopView(this);
		vm.getPanel(vm.getLobbyName()).setVisible(false);
		sV.loadShopView();
	}

	public void backToLobby() {
		vm.getPanel(vm.getShopName()).setVisible(false);
		vm.getPanel(vm.getLobbyName()).setVisible(true);
	}

	public void gotoShop() {
		lv.setLobbyPanelVisible(false);
		sV.loadShopView();
	}
}
