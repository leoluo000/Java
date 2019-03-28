package com.smartlab.pillar;

import com.smartlab.geometry.Geometry;

public class Pillar {
	
	private double height;
	
	Geometry geometry;
	
	public Pillar(double height,Geometry geometry)
	{
		this.height = height;
		this.geometry = geometry;
	}
	
	public double getVolume()
	{
		return geometry.getArea()*height;
	}

}
