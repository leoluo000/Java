package restaurant2;

/**
 * 餐馆服务生
 */
public class Waiter extends Thread {

	private String waiterName;
	private Restaurant2 restaurant;

	public Waiter(String waiterName, Restaurant2 restaurant) {
		this.waiterName = waiterName;
		this.restaurant = restaurant;
	}

	public String getWaiterName() {
		return waiterName;
	}

	@Override
	public void run() {
		while (true) {
			InnerOrders innerOrder = restaurant.getWaiterLounge().waiterGetInnerOrders(this);
			if (innerOrder == null) {
				continue;
			} else {
				try {
					System.out.println(getWaiterName() + "服务生正在送菜！");
					this.sleep(5000);
					System.out.println(getWaiterName() + "服务生送菜完成！");
				} catch (InterruptedException e) {
					System.out.println(getWaiterName() + "服务生送菜被打断！");
					e.printStackTrace();
				}
			}
		}
	}

}
