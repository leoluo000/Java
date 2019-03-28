package com.smartlab.lianxi;

public class Person {
	private String name;
	private String address;
	private char sex;
	private int age;
	public Person() {}
	public Person(String name , String address , char sex , int age)
	{
		this.address = address;
		this.age = age;
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public char getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	public void output()
	{
		System.out.println("姓名：" + this.getName() + "\n" +
				           "年龄：" + this.getAge() + "\n" +
				           "性别：" + this.getSex() + "\n" +
				           "地址：" + this.getAddress());
	}

}
