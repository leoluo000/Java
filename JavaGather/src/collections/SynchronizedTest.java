package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SynchronizedTest {

	public static void main(String[] args) {
		
		Collection<Object> c = Collections.synchronizedCollection(new ArrayList());
		List<Object> list = Collections.synchronizedList(new ArrayList());
		Set<Object> s = Collections.synchronizedSet(new HashSet());
		Map<Object , Object> m = Collections.synchronizedMap(new HashMap());
		
	}

}
