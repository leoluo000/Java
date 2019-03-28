package com.bank;

public class BankAccount{
	private String name;
	private int money;
	public BankAccount(String name , int money) {
		this.name = name;
		this.money = money;
	}
	public String getName(){
		return this.name;
	}
	public int getMoney() {
		return money;
	}
	public synchronized void deposit(int deposit_money) {//更加精密的控制阻挡范围
		this.money += deposit_money;
	}
	public synchronized void withdraw(int withdraw_money) {
			this.money -= withdraw_money;
}
	}


