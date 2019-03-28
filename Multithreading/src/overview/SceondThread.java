package overview;

public class SceondThread implements Runnable {

	private int i;

	@Override
	public void run() {

		for (; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

	}

	public static void main(String[] args) {

		for (int i = 0; i < 10000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 20) {
				SceondThread st = new SceondThread();
				new Thread(st, "新线程1").start();
				
				new Thread(st, "新线程2").start();
			}
		}

	}

}
