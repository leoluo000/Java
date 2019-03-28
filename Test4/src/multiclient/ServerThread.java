package multiclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThread extends Thread {

	Socket s = null;
	OutputStream out = null;
	BufferedReader br = null;

	public ServerThread(Socket s) {
		this.s = s;
		try {
			out = s.getOutputStream();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {

		String head = s.getRemoteSocketAddress().toString();
		String content = null;
		try {
			while ((content = br.readLine()) != null) {
				System.out.println(head + ":" + content);
				byte[] sendEcho = ("echo:" + content + "\n").getBytes("utf-8");
				write(sendEcho);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("移除一个客户端！");
			ServerClass.threads.remove(this);
			try {
				s.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}

	public void write(byte[] sendEcho) {
		try {
			out.write(sendEcho);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
