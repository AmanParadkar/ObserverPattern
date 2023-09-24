package com.practice;

public class Youtube {

	public static void main(String[] args) {
		
		Channel gfg = new Channel();
		
		Subscriber sc = new Subscriber("Aman");
		Subscriber sc1 = new Subscriber("om");
		Subscriber sc2 = new Subscriber("Amay");
		Subscriber sc3 = new Subscriber("john");
		Subscriber sc4 = new Subscriber("jay");
		
		gfg.subscribe(sc);
		gfg.subscribe(sc1);
		gfg.subscribe(sc2);
		gfg.subscribe(sc3);
		gfg.subscribe(sc4);
		
		sc.subscribeChannel(gfg);
		sc1.subscribeChannel(gfg);
		sc2.subscribeChannel(gfg);
		sc3.subscribeChannel(gfg);
		sc4.subscribeChannel(gfg);
		
		gfg.upload("DSA a to z");

	}

}
