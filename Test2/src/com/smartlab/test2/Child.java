package com.smartlab.test2;

public class Child extends Parent{
    public int age;
    //重写
	public Child(String name,int age) {
		super();
		this.age = age;
	}
	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
	    money += 200;
	}	
	
	public void earnMoney2() {
	    money += 400;
	}	
    
}
