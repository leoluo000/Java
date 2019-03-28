package com.smartlab.test;

public class Outer {
	
	private int outProp = 9;
	private class Inner
	{
		{
			System.out.println("内部类的初始化块");
		}
		private int inProp = 5;
		public void acessOuterprop()
		{
			System.out.println("外部类outprop属性值：" + outProp);
		}
		
	}
	public void accessInnerProp()
	{
		System.out.println("内部类inprop属性值：" + new Inner().inProp);
	}
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.accessInnerProp();
	}

}
