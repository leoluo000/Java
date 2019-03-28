package set_gather;

import java.util.TreeSet;

class M
{
	int age;
	public M(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return "M[age:" + age + "]";
	}
	public int compareTo(Object obj)
	{
		M m1 = (M)obj;
		return m1.age > age ? -1 : m1.age < age ? 1 :0;
		
	}
}

public class TreeSetTest4 {

	public static void main(String[] args) throws Exception{
		
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		System.out.println(ts);
		
	}

}
