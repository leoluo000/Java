package com.restaurant;

public class Laddie extends Thread {
	public final int NUM = 200;
	Restaurant rest;
	private String ID;

	public Laddie(Restaurant rest, String ID) {
		this.rest = rest;
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public int PKLaddies() {
		int i = NUM % rest.restLaddies.size();
		int number = (int)(Math.random()*i);
		return number;

	}

	@Override
	public void run() {
		while (true) {
			if (rest.cookedorders.size() > 0) {
				takeOut();
			} else {
				rest.restWait();
			}
		}
	}

	public void takeOut() {
		Order order = rest.cookedorders.remove(0);
		int n = PKLaddies();
		Laddie la = rest.restLaddies.remove(n);
		System.out.println(la.getID() + "正在送外卖，订单号为：" + order.getId());
//		rest.takeLaddies.add(la);
		rest.restNotifiAll();
		try {
			this.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(la.getID() + "送外卖完成，订单号为：" + order.getId());
//		boolean li = rest.takeLaddies.remove(la);
		rest.restLaddies.add(la);
	}

}
