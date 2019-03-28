package user_interaction;

import java.util.Scanner;

public class ScannerLongTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{
			System.out.println("键盘输入的内容是：" + sc.nextLong());
		}

	}

}
