package lambda;

import javax.swing.JFrame;

interface Eatable
{
	void taste();
}
interface Flyable
{
	void fly(String weather);
}
interface Addable
{
	int add(int a , int b);
}
interface FkTest
{
	void run();
}
@FunctionalInterface
interface Converter
{
	Integer convert(String from);
}
@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}

public class LambdaQs {

	public void eat(Eatable e)
	{
	  System.out.println("");
	  e.taste();
	}
	public void drive(Flyable f)
	{
		System.out.println("");
		f.fly("碧空如洗的晴日");
	}
	public void test(Addable add)
	{
		System.out.println("5与3的和为：" + add.add(5, 3));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaQs lq = new LambdaQs();
		lq.eat(() -> {
			System.out.println("苹果的味道还不错！");
		});
		lq.drive(weather -> {
			System.out.println("今天的天气是：" + weather);
			System.out.println("直升机飞行平稳！");
		});
		lq.test((a , b) -> (a * b));
		Runnable r = () -> {
			for(int i = 0 ; i < 100 ; i++)
			{
				System.out.println("hello world");
			}
		};
		Object obj = (FkTest)() -> {
			for(int i = 0 ; i < 100 ; i ++)
			{
				System.out.println("你好");
			}
		};
	    Converter converter1 = from -> Integer.valueOf(from);
        Integer val = converter1.convert("99");
        System.out.println(val);
        Converter converter2 = "fkit.org"::indexOf;
        YourTest yt = JFrame::new;
        System.out.println(yt.win("我的窗口"));
	}

}
