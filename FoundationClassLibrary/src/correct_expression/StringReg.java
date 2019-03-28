package correct_expression;

import java.util.Arrays;

public class StringReg {

	public static void main(String[] args) {
		
		String[] msgs = 
			{
					"java has regular expressions in 1.4",
					"regular expressions now expressing in java",
					"java represses oracular expressions"
			};
		for(String msg : msgs)
		{
			System.out.println(msg.replaceFirst("re\\w*", "哈哈"));
			System.out.println(Arrays.toString(msg.split(" ")));
		}
		
	}

}
