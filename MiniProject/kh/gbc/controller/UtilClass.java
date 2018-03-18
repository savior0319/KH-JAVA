package kh.gbc.controller;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import kh.gbc.view.LobbyView;

public class UtilClass  extends MouseAdapter {
	private Point mousePoint = new Point();
	
	public void moveAnim(JLabel jp,Point arrP )
	{
		while(true) 
		{
			int xPos = jp.getX();
			int yPos = jp.getY();
			Point p = new Point((jp.getX()-arrP.x)/30, (jp.getY()-arrP.y)/30);
			
			for(int i = 0; i<10;i++)
			{
				try {
					
					jp.setLocation(xPos +p.x , yPos + p.y);
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}		
		}
	}
	
	public Point getPoint() {return this.mousePoint;}
	String message = "";
	int i = 0;
	public void message(JLabel label,String msg)
	{
		for(i=0;i<msg.length();i++)
		{
//			System.out.print(msg.charAt(i));
			Timer timer = new Timer(1000, new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("메세지 " + i);
//						if( !(msg.charAt(i)=='<')&&!(msg.charAt(i)=='>')&&!(msg.charAt(i)=='/')
//								&&!('a'<=msg.charAt(i)&&msg.charAt(i)<='z'))
//						{
//							message +=msg.charAt(i);
//						}
//						if(msg.charAt(i)=='　')
//						{
//							message += "<br>";
//						}
//						label.setText(message);
					}
			}); 
			timer.start();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	public void moveMouse()
	{
		while(true) 
		{
			PointerInfo a = MouseInfo.getPointerInfo();
			mousePoint = a.getLocation();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	    int x=e.getX();
	    int y=e.getY();
	    this.mousePoint = new Point(x,y);
	    System.out.println("마우스 위치 " + x+","+y);//these co-ords are relative to the component
	}	
}