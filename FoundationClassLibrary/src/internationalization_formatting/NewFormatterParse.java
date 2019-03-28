package internationalization_formatting;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NewFormatterParse {

	public static void main(String[] args) throws ParseException{
		
		String str1 = "2014==04==12 01时06分09秒";
		DateTimeFormatter fomatter1 = DateTimeFormatter.ofPattern("yyyy==MM==dd HH时mm分ss秒");
		LocalDateTime dt = LocalDateTime.parse(str1 , fomatter1);
		System.out.println(dt);
		String str2 = "2014$$$04$$$13 20小时";
		DateTimeFormatter fomatter2 = DateTimeFormatter.ofPattern("yyyy$$$MM$$$dd HH小时");
		LocalDateTime dt1 = LocalDateTime.parse(str2, fomatter2);
		System.out.println(dt1);
		
	}

}
