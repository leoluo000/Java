package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(6);
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + "线程的i变量为：" + i);
			}
		};
		pool.submit(r);
		pool.submit(r);
		pool.shutdown();

	}

}
