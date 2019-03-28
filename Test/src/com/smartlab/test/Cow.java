package com.smartlab.test;

public class Cow {
	
	private double weight;
	public Cow() {}
	public Cow(double weight)
	{
		this.weight = weight;
	}
	private class cowLeg
	{
		private String color;
		private double length;
		public cowLeg() {}
		public cowLeg(double length , String color)
		{
			this.color = color;
			this.length = length;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		public void info()
		{
			System.out.println("当前牛腿的颜色为：" + color + "， 高：" + length);
			System.out.println("当前牛腿所在奶牛重：" + weight);
		}
	}
	public void test()
	{
		cowLeg c1 = new cowLeg(1.12, "黑白相间");
		c1.info();
	}
	public static void main(String[] args)
	{
		Cow cow = new Cow(378.9);
		cow.test();
	}

}
