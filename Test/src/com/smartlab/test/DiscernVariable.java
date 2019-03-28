package com.smartlab.test;

public class DiscernVariable {
	
	private String prop = "外部类属性 ";
	private class InClass
	{
		private String prop = "内部类属性";
		public void info()
		{
			String prop = "局部变量";
			System.out.println("外部类的属性值：" + DiscernVariable.this.prop);
			System.out.println("内部类的属性值：" + this.prop);
			System.out.println("局部变量的属性值：" + prop);
		}
	}
	public void test()
	{
		new InClass().info();
	}
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}

}
