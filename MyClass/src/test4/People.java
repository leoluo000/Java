package test4;

import java.util.Scanner;

public class People {

	private String name;
	private int age;
	private String sex;
	private double height;

	public People(String name, int age, String sex, double height) {
		this.age = age;
		this.height = height;
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void speak() {
		System.out.println("你好!");
	}

	public void count() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入需要相加的第一个数：（按enter键继续）");
		int a = scan.nextInt();
		System.out.println("请输入需要相加的第二个数：（按enter键继续）");
		int b = scan.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
	}

}
