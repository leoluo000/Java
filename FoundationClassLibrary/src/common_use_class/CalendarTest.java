package common_use_class;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalendarTest {


	private static int YEAR;
	private static int MONTH;
	private static int DATE;

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(YEAR));
		System.out.println(c.get(MONTH));
		System.out.println(c.get(DATE));
		c.set(2003, 10, 23, 12, 32, 23);
		System.out.println(c.getTime());
		c.add(YEAR, -2);
		System.out.println(c.getTime());
		c.roll(MONTH, -8);
		System.out.println(c.getTime());
		
		
	}

}
