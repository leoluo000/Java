package the_chat_room;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class MyTest {

	public static void main(String[] args) throws Exception {

		URL url = new URL("http://www.baidu.com");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "GBK");
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
		isr.close();
		is.close();

	}

}
