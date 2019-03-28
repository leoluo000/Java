package com.smartlab.test;

public class OutputFactory {

	public Output getOutput()
	{
		return new BetterPrinter();
	}
	public static void main(String[] args)
	{
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("疯狂Java讲义");
		c.keyIn("Structs2权威指南");
		c.print();
	}
	
}
