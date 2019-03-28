package list_gather;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {

		String[] books = { "疯狂Java讲义", "疯狂iOS讲义", "轻量级Java EE企业应用实战" };
		List<Object> books1 = new ArrayList<Object>();
		for (int i = 0; i < books.length; i++) {
			books1.add(books[i]);
		}
		ListIterator<Object> lit = books1.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("------分隔符------");
		}
		System.out.println("======下面开始反向迭代======");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}
