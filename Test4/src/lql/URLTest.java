package lql;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://www.baidu.com");
		InputStream is = url.openStream();
		InputStreamReader isr = new InputStreamReader(is, "GBK");
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();
		while (data != null) {
			System.out.println(data + "\n");
			data = br.readLine();
		}

		br.close();
		isr.close();
		is.close();

	}

}
