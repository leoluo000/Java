package com.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

	public List<Order> orders = new ArrayList<>();
	public List<Order> cookedorders = new ArrayList<>();
	public List<Laddie> restLaddies = new ArrayList<>();
	public List<Laddie> takeLaddies = new ArrayList<>();

	public synchronized void restWait() {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void restNotifiAll() {
		this.notifyAll();
	}

}
