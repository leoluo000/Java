package collection_iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {

		Collection<String> books = new HashSet<String>();
		books.add(new String("轻量级JavaEE企业应用实战"));
		books.add(new String("疯狂Java讲义"));
		books.add(new String("疯狂iOS讲义"));
		books.add(new String("疯狂Ajax讲义"));
		books.add(new String("疯狂Android讲义"));
		System.out.println(calAll(books , ele -> ((String)ele).contains("疯狂")));
		System.out.println(calAll(books , ele -> ((String)ele).contains("Java")));
		System.out.println(calAll(books , ele -> ((String)ele).length() > 10));
		
		
	}
	public static int calAll(Collection<String> books , Predicate<Object> p)
	{
		int total = 0;
		for(Object obj : books)
		{
			if(p.test(obj))
			{
				total ++;
			}
		}
		return total;
	}

}
