package com.smartlab.test;

public class TestStaticInnerClass {
	
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass
	{
		private int age;
		public void accessOuterProp()
		{
			System.out.println(prop2);
		}
	}
	public static void main(String[] args)
	{
		new StaticInnerClass().accessOuterProp();
	}

}
