package restaurant2;

/*
 * 外卖厨师
 */
public class Cooker extends Thread {

	private String cookerName;
	private Restaurant2 restaurant;

	public Cooker(String cookerName, Restaurant2 restaurant) {
		this.cookerName = cookerName;
		this.restaurant = restaurant;
	}

	public String getCookerName() {
		return cookerName;
	}

	@Override
	public void run() {

		while (true) {
			if (restaurant.getTakeoutOrders().size() == 0) {
				InnerOrders innerOrder = restaurant.takeoutCookerGetInnerOrder(this);
				if (innerOrder == null) {
					continue;
				} else {
					try {
						System.out.println(getCookerName() + "厨师开始做菜:" + innerOrder.getContent());
						this.sleep(10000);
						System.out.println(getCookerName() + "厨师做菜完成:" + innerOrder.getContent());
					} catch (InterruptedException e) {
						System.out.println(getCookerName() + "厨师做" + innerOrder.getContent() + "时被打断！");
						e.printStackTrace();
					}
					restaurant.getWaiterLounge().CookerPutFinishedInnerOrders(innerOrder, this);
				}
			} else {
				TakeoutOrders takeoutOrder = restaurant.cookerGetTakeoutOrders(this);
				if (takeoutOrder == null) {
					continue;
				} else {
					try {
						System.out.println(getCookerName() + "厨师开始做菜:" + takeoutOrder.getContent());
						this.sleep(10000);
						System.out.println(getCookerName() + "厨师做菜完成:" + takeoutOrder.getContent());
					} catch (InterruptedException e) {
						System.out.println(getCookerName() + "厨师做" + takeoutOrder.getContent() + "时被打断！");
						e.printStackTrace();
					}
					restaurant.getLounge().cookerPutFnishedTakeoutOders(takeoutOrder, this);
				}
			}
		}

	}

}
