package collection_iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		
		Collection<String> books = new HashSet<String>();
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		books.add("老人与海");
		Iterator<String> it = books.iterator();
		while(it.hasNext())
		{
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("疯狂Java讲义"))
			{
				it.remove();
			}
			book = "测试字符串";
		}
		System.out.println(books);
		
	}

}
