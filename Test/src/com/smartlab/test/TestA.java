package com.smartlab.test;

interface A
{
	void test();
}

public class TestA {
	
	public static void main(String[] args)
	{
		final int age = 0;
		A a = new A() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				System.out.println(age);
			}
		};
		a.test();
	}

}
