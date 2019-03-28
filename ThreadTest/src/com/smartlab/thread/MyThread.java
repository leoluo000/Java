package com.smartlab.thread;

public class MyThread implements Runnable {
	private String message;
	public MyThread(String message) {
		this.message = message;
	}
	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(message);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
