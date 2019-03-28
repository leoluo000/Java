package threa_synchronization;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class producer extends Thread {
	BlockingQueue<String> bq;

	public producer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {

		String[] str = new String[] { "java", "androied", "ios" };
		for (int i = 0; i < 99999999; i++) {
			System.out.println(this.getName() + "生产者开始生产集合：");
			try {
				Thread.sleep(200);
				bq.put(str[i % 3]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("生产者生产集合完成！" + bq);
		}

	}

}

class customer extends Thread {
	BlockingQueue<String> bq;

	public customer(BlockingQueue<String> bq) {
		this.bq = bq;
	}

	@Override
	public void run() {

		System.out.println(this.getName() + "消费者开始消费集合！");
		while (true) {
			try {
				Thread.sleep(200);
				bq.take();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("消费者消费集合完成！" + bq);
		}

	}

}

public class BlockingQueueTest2 {

	public static void main(String[] args) {

		BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		new producer(bq).start();
		new producer(bq).start();
		new customer(bq).start();

	}

}
