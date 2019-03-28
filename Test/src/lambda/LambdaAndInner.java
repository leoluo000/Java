package lambda;

@FunctionalInterface
interface Displayable
{
	void diaplay();
	default int add(int a , int b)
	{
		return a+b;
	}
}

public class LambdaAndInner {
	
	private int age = 12;
	private static String name = "疯狂软件教育中心";
	public void test()
	{
		String book = "疯狂Java讲义";
		Displayable dis = () -> {
			System.out.println("book局部变量为：" + book);
			System.out.println("外部类的age实例变量为：" + age);
			System.out.println("外部类name类变量为：" + name);
		};
		dis.diaplay();
		System.out.println(dis.add(3, 5));
	}
	public static void main(String[] args)
	{
		LambdaAndInner lambda = new LambdaAndInner();
		lambda.test();
	}

}
