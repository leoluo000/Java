package set_gather;

import java.util.TreeSet;

class Z implements Comparable<Object>
{
	int age;
	public Z(int age)
	{
		this.age = age;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
	public int compareTo(Object obj)
	{
		return 1;
	}
}

public class TreeSetTest2 {

	public static void main(String[] args) {
		
		TreeSet<Object> set = new TreeSet<Object>();
		Z z1 = new Z(6);
		set.add(z1);
		System.out.println(set.add(z1));
		System.out.println(set);
		((Z)(set.first())).age = 9;
		System.out.println(((Z)(set.last())).age);
		
	}

}
