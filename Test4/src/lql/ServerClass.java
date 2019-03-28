package lql;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(8888);
			Socket s = ss.accept();

			OutputStream output = s.getOutputStream();

			String reply_str = "i am luoqilin";
			byte[] send_data = reply_str.getBytes("GBK");
			output.write(send_data);
			output.flush();

			output.close();

			s.close();
			ss.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
