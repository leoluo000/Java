package javanet;

public class MultiThreadDown {

	public static void main(String[] args) throws Exception {

		final DownUtil downUtil = new DownUtil(
				"http://www.crazyit.org" + "attachments/month_1403/1403202355ff6cc9a4fbf6f14a.png", "ios.png", 4);
		downUtil.dowmload();
		new Thread(() -> {
			while (downUtil.getCompleteRate() < 1) {
				System.out.println("已完成：" + downUtil.getCompleteRate());
				try {
					Thread.sleep(100);
				} catch (Exception ex) {

				}
			}
		}).start();

	}

}
