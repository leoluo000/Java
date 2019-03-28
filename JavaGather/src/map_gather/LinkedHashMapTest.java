package map_gather;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {

		LinkedHashMap<Object, Object> sorces = new LinkedHashMap<>();
		sorces.put("语文", 90);
		sorces.put("数学", 80);
		sorces.put("英语", 79);
		sorces.forEach((key, value) -> System.out.println(key + "-->" + value));

	}

}
