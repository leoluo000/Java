package aio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

public class SimpleAIOServer {

	public static final int PORT = 31000;

	public static void main(String[] args) throws Exception {

		try (AsynchronousServerSocketChannel serverChannel = AsynchronousServerSocketChannel.open()) {
			serverChannel.bind(new InetSocketAddress(PORT));
			while (true) {
				Future<AsynchronousSocketChannel> future = serverChannel.accept();
				AsynchronousSocketChannel socketChannel = future.get();
				socketChannel.write(ByteBuffer.wrap("欢迎来到AIO的世界！".getBytes("utf-8"))).get();
			}
		}
	}

}
