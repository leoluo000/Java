package test3;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("请输入您本月的用电量：（度）");
		double use = reader.nextDouble();
		if (use <= 90) {
			System.out.println("您本月的电费为：" + use * 0.6 + "元");
		} else if (use <= 150) {
			System.out.println("您本月的电费为：" + ((use - 90) * 1.1 + 54) + "元");
		} else {
			System.out.println("您本月的电费为：" + ((use - 150) * 1.7 + 120) + "元");
		}

	}

}
