package com.bank;

public class MyThread implements Runnable{

	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
		MainClass.bank.deposit(10000);
		MainClass.bank.withdraw(10000);
		
		
		}
		
	}
	
	

}
