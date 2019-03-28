package collection_iterator;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest {

	public static void main(String[] args) {

		Collection<String> books = new HashSet<String>();
		books.add(new String("轻量级JavaEE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂iOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		books.removeIf(obj ->((String)obj).length() < 10);
		System.out.println(books);
		
	}

}
