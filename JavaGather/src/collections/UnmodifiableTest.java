package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest {

	public static void main(String[] args) {

		List<Object> ul = Collections.emptyList();
		Set<Object> us = Collections.singleton("疯狂Java讲义");
		Map<Object, Object> scores = new HashMap<Object, Object>();
		scores.put("语文", 90);
		scores.put("数学", 80);
		Map<Object, Object> um = Collections.unmodifiableMap(scores);
		ul.add("niaho");

	}

}
