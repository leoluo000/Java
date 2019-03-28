package multiclient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerClass {

	public static ArrayList<ServerThread> threads = new ArrayList<>();

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(8889);
			while (true) {
				System.out.println("【服务端】准备连接中....");
				Socket s = ss.accept();
				System.out.println("【服务端】一个客户端连入....");

				ServerThread st = new ServerThread(s);
				st.start();

				System.out.println("加入一个客户端！");
				threads.add(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
