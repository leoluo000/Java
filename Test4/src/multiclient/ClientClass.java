package multiclient;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {

	Socket s = null;
	OutputStream output = null;

	public void start() {
		try {
			s = new Socket("192.168.43.49", 8889);
			output = s.getOutputStream();
			ClientReadThread crt = new ClientReadThread(s, this);
			crt.start();

			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				String s = sc.nextLine();
				output.write((s + "\n").getBytes("utf-8"));
				output.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ClientClass cc = new ClientClass();
		cc.start();

	}

}
