package kh.gbc.run;

import kh.gbc.controller.GBCController;
import kh.gbc.controller.StartController;
import kh.gbc.controller.UtilClass;

public class GBCRun {

	public static void main(String[] args) {
		new StartController().start();
		// new RunningThread().running();
		// new UtilClass().moveMouse();
	}
}