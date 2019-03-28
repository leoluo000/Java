package map_gather;

import java.util.HashMap;
import java.util.Iterator;

class B1 {
	int count;

	public B1(int count) {
		this.count = count;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == B1.class) {
			B1 b = (B1) obj;
			return this.count == b.count;
		}
		return false;
	}

	public int HashCode() {
		return this.count;
	}

	public String toString() {
		return "key:" + count;
	}
}

public class HashMapErrorTest {

	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<>();
		hm.put(new B1(60000), "疯狂Java讲义");
		hm.put(new B1(87563), "轻量级JavaEE企业应用实战");
		Iterator<Object> it = hm.keySet().iterator();
		B1 first = (B1) it.next();
		first.count = 87563;
		System.out.println(hm);
		hm.remove(new B1(87563));
		System.out.println(hm);
		System.out.println(hm.get(new B1(87563)));
		System.out.println(hm.get(new B1(60000)));

	}

}
