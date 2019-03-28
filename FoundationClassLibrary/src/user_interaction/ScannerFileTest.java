package user_interaction;

import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(new File("ScannerFileTest1.java"));
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
