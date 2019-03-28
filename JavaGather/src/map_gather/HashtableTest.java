package map_gather;

import java.util.Hashtable;

class B {
	int count;

	public B(int count) {
		this.count = count;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj != null && obj.getClass() == B.class) {
			B b = (B) obj;
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

class C {
	public boolean equals(Object obj) {
		return true;
	}
}

public class HashtableTest {

	public static void main(String[] args) {

		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put(new B(60000), "疯狂Java讲义");
		ht.put(new B(87563), "轻量级JavaEE企业应用实战");
		ht.put(new B(1232), new C());
		System.out.println(ht);
		System.out.println(ht.contains("测试"));
		System.out.println(ht.contains(new B(87563)));
		ht.remove(new B(1232));
		System.out.println(ht);

	}

}
