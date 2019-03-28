package practice;

public class PracticeTest {
	
	public PracticeTest() {}
	
	public PracticeTest(String msg)
	{
		System.out.println(msg);
	}
	
	public void run()
	{
		System.out.println("hello,world!");
	}
	
	@FunctionalInterface
    interface Converter
    {
		Integer convert(String from);
    }

	public static void main(String[] args) {
		
		

	}

}
