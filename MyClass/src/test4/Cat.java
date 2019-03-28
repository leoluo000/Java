package test4;

public class Cat {

	private String name;
	private String color;
	private int age;

	public Cat(String name, String color, int age) {
		this.age = age;
		this.color = color;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getAge() {
		return age;
	}

	public void yell() {
		System.out.println("喵喵喵！");
	}

}
