package com.smartlab.test;

public class TestCommand {

	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {3 , -4 , 6 , 4};
		pa.process(target, new PrintCommand());
		System.out.println("-----------------");
		pa.process(target, new AddCommand());

	}

}
