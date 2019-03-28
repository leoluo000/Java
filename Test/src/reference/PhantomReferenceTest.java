package reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {

	public static void main(String[] args) {
		
		String str = new String("Java疯狂讲义");
		ReferenceQueue rq = new ReferenceQueue();
		PhantomReference pr = new PhantomReference(str , rq);
		str = null;
		System.out.println(pr.get());
		System.gc();
		System.runFinalization();
		System.out.println(rq.poll() == pr);

	}

}
