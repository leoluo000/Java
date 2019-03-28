package map_gather;

import java.util.TreeMap;

class Y implements Comparable<Object> {
	int count;

	public Y(int count) {
		this.count = count;
	}

	public String toString() {
		return "Y[count:" + count + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Y.class) {
			Y y = (Y) obj;
			this.count = y.count;
		}
		return false;
	}

	public int compareTo(Object obj) {
		Y y = (Y) obj;
		return count > y.count ? 1 : count < y.count ? -1 : 0;
	}
}

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Object, Object> tm = new TreeMap<>();
		tm.put(new Y(3), "轻量级JavaEE企业应用实战");
		tm.put(new Y(-5), "疯狂Java讲义");
		tm.put(new Y(9), "疯狂Android讲义");
		System.out.println(tm);
		System.out.println(tm.firstEntry());
		System.out.println(tm.lastKey());
		System.out.println(tm.higherKey(new Y(2)));
		System.out.println(tm.lowerEntry(new Y(2)));
		System.out.println(tm.subMap(new Y(-1), new Y(4)));

	}

}
