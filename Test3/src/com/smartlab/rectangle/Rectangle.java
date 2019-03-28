package com.smartlab.rectangle;

import com.smartlab.geometry.Geometry;

public class Rectangle extends Geometry{

	private double a,b;
	
	public Rectangle(double a , double b)
	{
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	

}
