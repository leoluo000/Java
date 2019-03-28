package com.restaurant;

public class Cook extends Thread {

	Restaurant rest;

	public Cook(Restaurant rest) {
		this.rest = rest;
	}

	@Override
	public void run() {
		while (true) {
			if (rest.orders.size() > 0) {
				cooking();
				rest.restNotifiAll();
			} else {
				System.out.println("厨师休息中！");
				rest.restWait();
			}
		}
	}

	public void cooking() {
		Order order = rest.orders.remove(0);
		try {
			System.out.println("厨师正在做菜，订单号为：" + order.getId());
			this.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rest.cookedorders.add(order);
		System.out.println("厨师做菜完成，订单号为：" + order.getId());
	}

}
