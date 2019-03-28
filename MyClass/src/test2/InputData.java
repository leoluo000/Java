package test2;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int amout = 0;
		float price = 0, sum = 0;
		System.out.println("输出产品数量（回车确认）：");
		amout = reader.nextInt();
		System.out.println("输出产品单价（回车确认）：");
		price = reader.nextFloat();
		sum = price * amout;
		System.out.printf("数量：%d,单价：%5.2f，总价值：%5.2f", amout, price, sum);

	}

}
