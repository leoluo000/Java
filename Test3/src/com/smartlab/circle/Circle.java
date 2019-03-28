package com.smartlab.circle;

import com.smartlab.geometry.Geometry;

public class Circle extends Geometry{
	
	private double r;
	public Circle(double r)
	{
		this.r = r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	

}
