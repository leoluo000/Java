package restaurant2;

/**
 * 外卖小哥
 */
public class Laddies extends Thread {

	private String laddiesName;
	private Restaurant2 restaurant;

	public Laddies(String laddiesName, Restaurant2 restaurant) {
		this.laddiesName = laddiesName;
		this.restaurant = restaurant;
	}

	public String getLaddiesName() {
		return laddiesName;
	}

	@Override
	public void run() {

		while (true) {
			TakeoutOrders takeoutOrder = restaurant.getLounge().laddieGetTakeoutOrders(this);
			if (takeoutOrder == null) {
				continue;
			} else {
				try {
					System.out.println(getLaddiesName() + "外卖小哥开始送外卖！");
					this.sleep(10000);
					System.out.println(getLaddiesName() + "外卖小哥送外卖完成！");
				} catch (InterruptedException e) {
					System.out.println(getLaddiesName() + "外卖小哥送外卖被打断！");
					e.printStackTrace();
				}
			}
		}

	}

}
