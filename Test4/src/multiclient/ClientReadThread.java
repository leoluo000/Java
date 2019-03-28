package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReadThread extends Thread {

	ClientClass cc = null;
	Socket s = null;
	BufferedReader br = null;

	public ClientReadThread(Socket s, ClientClass cc) {
		this.cc = cc;
		this.s = s;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		String content = null;
		try {
			while ((content = br.readLine()) != null) {
				System.out.println(content);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
