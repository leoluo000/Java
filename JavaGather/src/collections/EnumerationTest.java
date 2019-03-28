package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationTest {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<>();
		v.add("疯狂Java讲义");
		v.add("轻量级JavaEE企业应用实战");
		Hashtable<Object, Object> ht = new Hashtable<>();
		ht.put("语文", 90);
		ht.put("数学", 80);
		Enumeration<Object> em = v.elements();
		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		Enumeration<Object> ks = ht.keys();
		while (ks.hasMoreElements()) {

			Object key = ks.nextElement();
			System.out.println(key + "---->" + ht.get(key));

		}

	}

}
