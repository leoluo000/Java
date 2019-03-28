package threadGroup;

class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}

	public MyThread(ThreadGroup group, String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			System.out.println(this.getName() + "线程的i变量：" + i);
		}

	}

}

public class ThreadGroupTest {

	public static void main(String[] args) {

		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		System.out.println("主线程组名：" + mainGroup.getName());
		System.out.println("主线程组是否是后台线程：" + mainGroup.isDaemon());
		new MyThread("主线程组的线程").start();
		ThreadGroup tg = new ThreadGroup("新线程组");
		tg.setDaemon(true);
		System.out.println("新线程组是否是后台线程：" + tg.isDaemon());
		new MyThread(tg, "新线程组的线程甲").start();
		new MyThread(tg, "新线程组的线程乙").start();

	}

}
