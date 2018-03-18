package kh.gbc.controller;

import java.util.ArrayList;

import javax.swing.JLabel;

import kh.gbc.model.feed.Feed;

public class FeedController extends Thread {
	private Feed[] feeds = new Feed[4];
	private static ArrayList<Feed> feedList = new ArrayList<Feed>();// ���� ������ ���� Ǯ.
	private int currentFeedCount = 0;
	private int feedOrder = 0;
	private int totalFeedCount = 8;
	private JLabel feedParent;
	public FeedController() {}
	public FeedController(JLabel feedParent)
	{
		this.feedParent = feedParent;
		for(int i = 0; i<totalFeedCount;i++)
		{
			Feed feed = new Feed(feedParent, this);
			feedList.add(feed);
			if( totalFeedCount > i ) 
			{
				Thread feedTh = new Thread( feedList.get(i) );
				feedTh.start();
			}
		}
		this.start();
	}
	
	public void nextFeed()
	{
		if(feedOrder>19) feedOrder = 0;
//		System.out.println(feedOrder + "��° ����� ���� " + feedList.size());
		Feed feed = new Feed(feedParent, this);
		feedList.add(feed);
		Thread feedTh = new Thread(feed);
		feedTh.start();
	}
	
	public void removeFeed(Feed feed)
	{
		feedList.remove(feed);
//		System.out.println("���� ����Ʈ ����" + feedList.size());
//		System.out.println("���� �����");
	}
	
	@Override
	public void run()
	{	
		while(true)
		{
			if( feedList.size() < totalFeedCount )
			{
				nextFeed();
				currentFeedCount +=1;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
