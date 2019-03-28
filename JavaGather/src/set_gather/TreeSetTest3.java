package set_gather;

import java.util.TreeSet;

class R1 implements Comparable<Object>
{
	int count;
	public R1(int count)
	{
		this.count = count;
	}
	public String toString()
	{
		return "R[count:" + count + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj != null && obj.getClass() == R1.class)
		{
			R1 r = (R1)obj;
			return r.count == this.count;
		}
		return false;
	}
	public int compareTo(Object obj)
	{
		R1 r = (R1)obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;
	}
}

public class TreeSetTest3 {

	public static void main(String[] args) {
		
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add(new R1(5));
		ts.add(new R1(-3));
		ts.add(new R1(9));
		ts.add(new R1(-2));
		System.out.println(ts);
		R1 first = (R1)ts.first();
		first.count = 20;
		R1 last = (R1)ts.last();
		last.count = -2;
		System.out.println(ts);
		System.out.println(ts.remove(new R1(-2)));
		System.out.println(ts);
		System.out.println(ts.remove(new R1(5)));
		System.out.println(ts);
		
	}

}
