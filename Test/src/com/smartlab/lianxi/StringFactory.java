package com.smartlab.lianxi;

public class StringFactory {
	private String str;
	public StringFactory(String str)
	{
		this.str = str;
		info();
	}
	public String getStr() {
		return str;
	}
	public void info()
	{
		int i = 0;
		int j = 0;
		char[] ch = this.str.toCharArray();
		for(char c:ch)
		{
			if(c == 'n')
			{
				i++;
			}
			if(c == 'o')
			{
				j++;
			}
		}
		System.out.println("n出现的次数为：" + i);
		System.out.println("o出现的次数为：" + j);
	}

}
