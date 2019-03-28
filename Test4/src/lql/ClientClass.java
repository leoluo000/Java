package lql;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientClass {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("192.168.1.110", 8888);

			InputStream input = s.getInputStream();

			InputStreamReader input_str = new InputStreamReader(input, "utf-8");

			BufferedReader br = new BufferedReader(input_str);

			StringBuffer data = new StringBuffer();
			String once_read = "";
			while (once_read != null) {
				once_read = br.readLine();
				if (once_read != null) {
					data.append(once_read + "\n");
				}
			}
			System.out.println("客户端收到的utf-8编码的字符串：\n" + data.toString());

			br.close();
			input_str.close();
			input.close();

			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
