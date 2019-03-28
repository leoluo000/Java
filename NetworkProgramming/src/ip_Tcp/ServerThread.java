package ip_Tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable {

	Socket s = null;
	BufferedReader br = null;

	public ServerThread(Socket s) throws IOException {
		this.s = s;
		br = new BufferedReader(new InputStreamReader(s.getInputStream()));
	}

	@Override
	public void run() {

		try {
			String content = null;
			while ((content = readFormClient()) != null) {
				for (Socket s : MyServer.socketList) {
					PrintStream ps = new PrintStream(s.getOutputStream());
					ps.println(Thread.currentThread().getName() + content);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String readFormClient() {
		try {
			return br.readLine();
		} catch (Exception e) {
			MyServer.socketList.remove(s);
		}
		return null;
	}

}
