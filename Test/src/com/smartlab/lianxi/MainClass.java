package com.smartlab.lianxi;

public class MainClass {

	public static void main(String[] args) {
		Dog1 d = new Dog1("小黄", "黑色", 5);
		System.out.println("名字：" + d.getName() + "\n" + 
		                   "颜色：" + d.getColor() + "\n" + 
				           "年龄：" + d.getAge());
		new StringFactory("want you to know one thing");
	    Student s = new Student("伊凡", "隆鑫三栋", 'M', 19, 100, 100);
	    s.output();
	    
	    
	    
	    
	}

}
