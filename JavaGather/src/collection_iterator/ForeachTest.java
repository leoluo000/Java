package collection_iterator;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {

	public static void main(String[] args) {

		Collection<String> c = new ArrayList<String>();
		c.add("疯狂Java讲义");
		c.add("疯狂Android讲义");
		c.add("老人与海");
		for(Object obj : c)
		{
			String book = (String)obj;
			System.out.println(book);
//			if(book.equals("老人与海"))
//			{
//				c.remove(book);
//			}
		}
		System.out.println(c);
		
	}

}
