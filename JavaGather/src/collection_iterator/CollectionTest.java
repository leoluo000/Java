package collection_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {

		Collection<Comparable> c = new ArrayList<Comparable>();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合元素个数为：" + c.size());
		c.remove(6);
		System.out.println("c集合元素个数为：" + c.size());
		System.out.println("c集合是否包含\"孙悟空\"字符串：" + c.contains("孙悟空"));
		c.add("轻量级JavaEE企业应用实战");
		System.out.println("c集合的元素：" + c);
		Collection<String> books = new HashSet<String>();
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Java讲义");
		System.out.println("c集合是否完全包含books集合？" + c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合的元素：" + c);
		c.clear();
		System.out.println("c集合的元素" + c);
		books.retainAll(c);
		System.out.println("books集合的元素：" + books);
		
	}

}
