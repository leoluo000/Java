package aio;

import java.io.IOException;
import java.net.InetAddress;

public class GetIPAddress {

	public static void main(String[] args) throws IOException {

		InetAddress ia = InetAddress.getLocalHost();
		System.out.println(ia.getHostAddress());

	}

}
