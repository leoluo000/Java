package com.restaurant;

public class MainClass {

	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		Cook cook = new Cook(rest);
		Laddie la1 = new Laddie(rest, "一号小哥");
		Laddie la2 = new Laddie(rest, "二号小哥");
		Laddie la3 = new Laddie(rest, "三号小哥");
		Laddie la4 = new Laddie(rest, "四号小哥");
		Laddie la5 = new Laddie(rest, "五号小哥");
		rest.restLaddies.add(la1);
		rest.restLaddies.add(la2);
		rest.restLaddies.add(la3);
		rest.restLaddies.add(la4);
		rest.restLaddies.add(la5);
		cook.start();
		la1.start();
		la2.start();
		la3.start();
		la4.start();
		la5.start();
		System.out.println("程序启动！");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0;; i++) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Order order = new Order();
			order.setId(i + 1);
			order.setName("宫保鸡丁");
			order.setAddress("10号楼301");
			rest.orders.add(order);
			System.out.println("来单了,订单号为" + order.getId());
			rest.restNotifiAll();
		}
	}

}
