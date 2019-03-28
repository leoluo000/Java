package ip_Tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {

		Socket s = new Socket("192.168.1.107", 40000);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line = br.readLine();
		System.out.println("来自服务端的数据：" + line);
		br.close();
		s.close();

	}

}
