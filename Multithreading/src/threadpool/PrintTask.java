package threadpool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("serial")
public class PrintTask extends RecursiveAction {

	private static final int NUM = 50;
	private int start;
	private int end;

	public PrintTask(int start, int end) {
		this.end = end;
		this.start = start;
	}

	@Override
	protected void compute() {

		if (end - start <= NUM) {
			for (int i = start; i < end; i++) {
				System.out.println(Thread.currentThread().getName() + "线程的i变量:" + i);
			}
		} else {
			int middle = (start + end) / 2;
			PrintTask right = new PrintTask(middle, end);
			PrintTask legt = new PrintTask(start, middle);
			legt.fork();
			right.fork();
		}

	}

	public static void main(String[] args) throws Exception {

		ForkJoinPool pool = new ForkJoinPool();
		pool.submit(new PrintTask(0, 300));
		pool.awaitTermination(2, TimeUnit.SECONDS);
		pool.shutdown();

	}

}
