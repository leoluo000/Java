package com.smartlab.lianxi;

public class Student extends Person{
	private double math;
	private double english;
	public Student() {}
	public Student(double math , double english)
	{
		this.english = english;
		this.math = math;
	}
	public Student(String name , String address , char sex , int age , double math , double english)
	{
		super(name, address, sex, age);
		this.english = english;
		this.math = math;
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}
	@Override
	public char getSex() {
		// TODO Auto-generated method stub
		return super.getSex();
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public void output() {
		System.out.println("姓名：" + this.getName() + "\n" +
		                   "年龄：" + this.getAge() + "\n" +
		                   "性别：" + this.getSex() + "\n" +
		                   "地址：" + this.getAddress() + "\n" +
				           "数学成绩：" + this.getMath() + "\n" +
		                   "英语成绩：" + this.getEnglish());
	}
	public void output2()
	{
		System.out.println("数学成绩：" + this.getMath() + "\n" +
		                   "英语成绩：" + this.getEnglish());
	}
	public double getMath() {
		return math;
	}
	public double getEnglish() {
		return english;
	}
	

}
