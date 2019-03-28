package com.smartlab.test2;

import java.util.ArrayList;

public class AnimalAction {
	
	public ArrayList<Animal> Animals = new ArrayList<>();
	//接口的回调
	public void makeAnimalSpark() {
		for(Animal a:Animals) {
			a.spark();
		}
	}

}
