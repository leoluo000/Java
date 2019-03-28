package internationalization_formatting;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class NewFormatterTest {

	public static void main(String[] args) throws DateTimeException{
		
		DateTimeFormatter[] formatters = new DateTimeFormatter[] {
				
				DateTimeFormatter.ISO_LOCAL_DATE,
				DateTimeFormatter.ISO_LOCAL_TIME,
				DateTimeFormatter.ISO_LOCAL_DATE_TIME,
//				DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL , FormatStyle.MEDIUM),
//				DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG),
				DateTimeFormatter.ofPattern("Gyyyy%%MMM%%dd HH:mm:ss")
						
		};
		LocalDateTime date = LocalDateTime.now();
		for(int i = 0 ; i < formatters.length ; i++)
		{
			System.out.println(date.format(formatters[i]));
			System.out.println(formatters[i].format(date));
		}
		
	}

}
