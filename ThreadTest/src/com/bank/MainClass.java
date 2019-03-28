package com.bank;

public class MainClass {

	public static BankAccount bank;
	
	public static void main(String[] args) {
		
		bank = new BankAccount("yi", 0);
		for(int i = 0 ; i < 10000 ; i++)
		{
			new Thread(new MyThread()).start();
		}
		System.out.println(bank.getMoney());
		
	}

}
