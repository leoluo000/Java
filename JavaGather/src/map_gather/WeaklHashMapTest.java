package map_gather;

import java.util.WeakHashMap;

public class WeaklHashMapTest {

	public static void main(String[] args) {

		WeakHashMap<Object, Object> wm = new WeakHashMap<>();
		wm.put(new String("语文"), new String("良好"));
		wm.put(new String("数学"), new String("合格"));
		wm.put(new String("英语"), new String("优秀"));
		wm.put("java", "中等");
		System.out.println(wm);
		System.gc();
		System.runFinalization();
		System.out.println(wm);

	}

}
