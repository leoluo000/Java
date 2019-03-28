package com.smartlab.app;

import java.util.Scanner;

public class People {
	
	public int play()
	{
		System.out.println("请输入数字： （提示： 0-石头，1-剪刀，2-布，其他-石头）");
		Scanner scan = new Scanner(System.in);
		int res = 0;
		if(scan.hasNextInt())
		{
			res = scan.nextInt();
		}
		if(res < 0 || res > 2)
		{
			res = 0;
		}
		System.out.println(scan.hasNextInt());
		return res;
	}

}
