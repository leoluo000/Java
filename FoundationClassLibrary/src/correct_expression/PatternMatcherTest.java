package correct_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {

	public static void main(String[] args) {

		String str = "hello , java!";
		System.out.println(str.replaceFirst("\\w*", "🀙"));
		System.out.println(str.replaceFirst("\\w*?", "🀙"));
		boolean b = Pattern.matches("a*b", "aaaaaab");
		System.out.println(b);
		
	}

}
