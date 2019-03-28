package test4;

public class MainClass1 {

	public static void main(String[] args) {

		Cat c = new Cat("妮妮", "灰色", 2);
		System.out.println("毛色为：" + c.getColor());
		System.out.println("年龄为：" + c.getAge() + "岁");
		System.out.println("姓名：" + c.getName());
		c.yell();

	}

}
