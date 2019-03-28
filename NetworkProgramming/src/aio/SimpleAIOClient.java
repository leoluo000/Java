package aio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.Charset;

public class SimpleAIOClient {

	public static final int PORT = 31000;

	public static void main(String[] args) throws Exception {

		ByteBuffer buff = ByteBuffer.allocate(1024);
		Charset utf = Charset.forName("utf-8");
		try (AsynchronousSocketChannel clientChannel = AsynchronousSocketChannel.open()) {
			clientChannel.connect(new InetSocketAddress("192.168.1.114", PORT)).get();
			buff.clear();
			clientChannel.read(buff).get();
			buff.flip();
			String content = utf.decode(buff).toString();
			System.out.println("服务器信息：" + content);

		}

	}

}
