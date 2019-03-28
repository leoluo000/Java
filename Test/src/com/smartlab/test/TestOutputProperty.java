package com.smartlab.test;

public class TestOutputProperty {

	interface interfaceA
	{
		int PROP_A = 5;
		void testA();
	}
	interface interfaceB
	{
		int PROP_B = 6;
		void testB();
	}
	interface interfaceC extends interfaceA , interfaceB
	{
		int PORP_C = 7;
		void testC();
	}
	
	public static void main(String[] args)
	{
		System.out.println(Output.MAX_CACHE_LINE);
		System.out.println(interfaceC.PROP_A);
		System.out.println(interfaceC.PROP_B);
		System.out.println(interfaceC.PORP_C);
	}
}
