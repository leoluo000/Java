package threadpool;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

@SuppressWarnings("serial")
public class CalTask extends RecursiveTask<Integer> {

	private static final int NUM = 20;
	private int start;
	private int end;
	private int[] arr;

	public CalTask(int[] arr, int start, int end) {
		this.arr = arr;
		this.end = end;
		this.start = start;
	}

	@Override
	protected Integer compute() {
		int sum = 0;
		if (end - start <= NUM) {
			for (int i = start; i < end; i++) {
				sum += arr[i];
			}
			return sum;
		} else {
			int middle = (start + end) / 2;
			CalTask left = new CalTask(arr, start, middle);
			CalTask right = new CalTask(arr, middle, end);
			left.fork();
			right.fork();
			return left.join() + right.join();
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[100];
		Random r = new Random();
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = r.nextInt(20);
			total += (arr[i] = temp);
		}
		System.out.println(total);
		ForkJoinPool pool = ForkJoinPool.commonPool();
		Future<Integer> future = pool.submit(new CalTask(arr, 0, arr.length));
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pool.shutdown();

	}

}
