package reference;

import java.lang.ref.WeakReference;

public class ReferenceTest {

	public static void main(String[] args) throws Exception{
		
// 		String str = new String("疯狂Java讲义");
// 		WeakReference wr = new WeakReference(str);
		str = null;
// 		System.out.println(wr.get());
		System.gc();
		System.runFinalization();
		System.out.println(wr.get());
		Object obj = wr.get();
		if(obj == null)
		{
			wr = new WeakReference(obj);
			obj = wr.get();
		}
		obj = null;
		// ttttt
	}

}
