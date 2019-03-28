package com.smartlab.test;

interface Product1
{
	public double getPrice();
	public String getName();
}

public class TestAnonymous {
	
	public void test(Product1 p)
	{
		System.out.println("购买一个" + p.getName() + "花掉了" + p.getPrice() + "元");
	}
	public static void main(String[] args)
	{
		TestAnonymous ta = new TestAnonymous();
		ta.test(new Product1()
		{
			public double getPrice()
			{
				return 567.8;
			}
			public String getName()
			{
				return "AGP显卡";
			}
		});
		TestAnonymous ta2 = new TestAnonymous();
		ta2.test(new Product1() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 888;
			}
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "伊凡";
			}
		});
	}

}
