package practice;

public class Something {
	
	public Something() {}
	
	public Something(String something)
	{
		System.out.println(something);
	}
	
	static String startsWith(String s)
	{
		return String.valueOf(s.charAt(0));
	}
	
	static String endWith(String s)
	{
		return String.valueOf(s.charAt(s.length()-1));
	}
	
	void endWith()
	{
		
	}
	
	@FunctionalInterface
	interface IConvert<F,T>
	{
		T convert(F form);
	}

	public static void main(String[] args) {
		
		IConvert<String, String> convert = Something::startsWith;
		String converted = convert.convert("1234");
		Something something = new Something();
		IConvert<String, String> converter = Something::endWith;
		String converted1 = converter.convert("java");
		IConvert<String, Something> convert1 = Something::new;
		Something something1 = convert1.convert("你好");
		System.out.println(converted);
		System.out.println(converted1);
		System.out.println(something);
		System.out.println(something1);

	}

}
