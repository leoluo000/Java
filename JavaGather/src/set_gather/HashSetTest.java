package set_gather;

import java.util.HashSet;

class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
class B
{
	public int hashCode()
	{
		return 1;
	}
}
class C
{
	public int hashCode()
	{
		return 2;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<Object> books = new HashSet<Object>();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.println(books);
	}

}
