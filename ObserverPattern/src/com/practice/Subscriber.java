package com.practice;

public class Subscriber {
	
	private String name;
	private Channel channel;
	
	public Subscriber(String string) {
		name = string;
	}

	public void update()
	{
		System.out.println("hye! "+name+" Video Uploaded");
	}
	
	public void subscribeChannel(Channel channel)
	{
		this.channel = channel;
	}

}
