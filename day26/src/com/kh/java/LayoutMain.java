package com.kh.java;

import javax.swing.SwingUtilities;

public class LayoutMain {
	public static void main(String[] args) {
		//new CardLayoutTest1().setVisible(true);;
		//new EventTest();
		// new ButtonAction();
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new KeyEventTest();
            }
        });
	
	}
}
