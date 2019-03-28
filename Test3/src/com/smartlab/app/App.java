package com.smartlab.app;

import com.smartlab.geometry.Geometry;
import com.smartlab.pillar.Pillar;
import com.smartlab.rectangle.Rectangle;

public class App {
	
	public static void main(String[] args)
	{
		Geometry geometry;
		Geometry geometry1;
		Pillar pillar;
		Pillar pillar1;
		geometry = new Rectangle(1, 1);
		geometry1 = new Rectangle(2, 2);
		pillar = new Pillar(1, geometry);
		pillar1 = new Pillar(1, geometry1);
		System.out.println(pillar.getVolume());
		System.out.println(pillar1.getVolume());
	}

}
