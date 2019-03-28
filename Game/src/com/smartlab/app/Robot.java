package com.smartlab.app;

import java.util.Random;

public class Robot {
	
	private String name;
	private FingerGuess guess;
	public Robot(String name)
	{
		this.name  = name;
	}
	public FingerGuess getGuess()
	{
		return guess;
	}
	public void doGuess()
	{
		Random random = new Random();
		int number = random.nextInt(3);
		guess = FingerGuess.values()[number];
	}

}
