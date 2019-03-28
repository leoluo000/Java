package map_gather;

import java.util.IdentityHashMap;

public class IdentityHashMapTest {

	public static void main(String[] args) {

		IdentityHashMap<Object, Object> im = new IdentityHashMap<>();
		im.put(new String("语文"), 89);
		im.put(new String("数学"), 90);
		im.put("java", 97);
		im.put("java", 78);
		System.out.println(im);

	}

}
