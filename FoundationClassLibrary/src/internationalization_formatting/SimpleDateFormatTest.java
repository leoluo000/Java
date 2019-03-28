package internationalization_formatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException{

		Date d = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("Gyyyy年中的第D天");
		String dateStr = sdf1.format(d);
		System.out.println(dateStr);
		String str = "14-12-21";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy-MM-dd");
		System.out.println(sdf2.parse(str));
		
	}

}
