package common_use_class;

import java.util.Calendar;

public class LenientTest {

	public static void main(String[] args) throws Exception{

		Calendar cal1 = Calendar.getInstance();
		cal1.set(2003, 7, 31);
		cal1.set(Calendar.MONTH, 8);
		cal1.set(Calendar.DATE, 5);
		System.out.println(cal1.getTime());
		
	}

}
