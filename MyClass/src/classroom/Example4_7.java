package classroom;

import java.util.Arrays;

public class Example4_7 {

	public static void main(String[] args) {

		char a[] = { 'a', 'b', 'c', 'd' };
		for (int n = 0; n < a.length; n++) {
			System.out.println(a[n] + " ");
		}
		System.out.println();
		for (char ch : a) {
			System.out.println(ch + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

	}

}
