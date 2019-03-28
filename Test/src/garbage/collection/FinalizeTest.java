package garbage.collection;

public class FinalizeTest {

	private static FinalizeTest ft = null;
	
	public void info()
	{
		System.out.println("测试资源清理的finalize方法");
	}
	
	public static void main(String[] args) throws Exception{
		
		new FinalizeTest();
		System.gc();
//		Runtime.getRuntime().runFinalization();  //可恢复对象的finalize()方法
		System.runFinalization();
		ft.info();
		
	}
	public void finalize()
	{
		ft = this;
	}

}
