package com.smartlab.thread;

public class MainClass {

	public static void main(String[] args) {

		new Thread(new MyThread("good!")).start();
		new Thread(new MyThread("nice!")).start();


	}

}
