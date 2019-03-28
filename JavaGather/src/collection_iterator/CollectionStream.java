package collection_iterator;

import java.util.Collection;
import java.util.HashSet;

public class CollectionStream {

	public static void main(String[] args) {
		
		Collection<String> books = new HashSet<String>();
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		books.add("傲慢与偏见");
		books.add("老人与海");
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("疯狂"))
				.count());
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).contains("Java"))
				.count());
		System.out.println(books.stream()
				.filter(ele -> ((String)ele).length() > 10)
				.count());
		books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);
		
	}

}
