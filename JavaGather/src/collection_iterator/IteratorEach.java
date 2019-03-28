package collection_iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach {

	public static void main(String[] args) {

		Collection<String> books = new HashSet<String>();
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		books.add("老人与海");
		Iterator<String> it = books.iterator();
		it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
		
	}

}
