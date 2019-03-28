package com.smartlab.test2;

public class People {
	private String name;
	private People friend;
	private int grade;
	//构造函数
	public People(String name) {
		this.name = name;
	}
    public People() {
    	
    }
	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setGrade(String grade) {
		this.grade = Integer.parseInt(grade);
	}

	public People getFriend() {
		return friend;
	}

	public void setFriend(People friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", friend=" + friend.name + ", grade=" + grade +"]";
	}
    
}
