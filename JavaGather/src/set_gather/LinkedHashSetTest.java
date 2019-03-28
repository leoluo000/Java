package set_gather;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> books = new LinkedHashSet<Object>();
		books.add("疯狂Java讲义");
		books.add("轻量级JavaEE企业应用实战");
		System.out.println(books);
		books.remove("疯狂Java讲义");
		books.add("疯狂Java讲义");
		System.out.println(books);
		
	}

}
