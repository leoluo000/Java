package set_gather;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class EnumSetTest2 {

	public static void main(String[] args) {

		Collection<Season> c = new HashSet<Season>();
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		c.add(Season.FALL);
		System.out.println(c);
		EnumSet<Season> es = EnumSet.copyOf(c);
		System.out.println(es);

	}

}
