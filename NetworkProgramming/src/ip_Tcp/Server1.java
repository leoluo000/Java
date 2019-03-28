package ip_Tcp;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket(40060);
		Socket s = ss.accept();
		PrintStream ps = new PrintStream(s.getOutputStream());
		ps.println("服务器的第一条数据！");
		ps.println("服务器的第二条数据！");
		s.shutdownOutput();
		System.out.println(s.isClosed());
		Scanner scan = new Scanner(s.getInputStream());
		while (scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
		s.close();
		ss.close();

	}

}
