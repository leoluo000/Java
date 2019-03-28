package restaurant2;

/**
 * 堂食厨师
 */
public class InnerCooker extends Thread {

	private String innerCookerName;
	private Restaurant2 restaurant;

	public InnerCooker(String innerCookerName, Restaurant2 restaurant) {
		this.innerCookerName = innerCookerName;
		this.restaurant = restaurant;
	}

	public String getInnerCookerName() {
		return innerCookerName;
	}

	@Override
	public void run() {

		while (true) {
			if (restaurant.getInnerOrders().size() == 0) {
				TakeoutOrders takeoutOrder = restaurant.innerCookerGetTakeoutOrder(this);
				if (takeoutOrder == null) {
					continue;
				} else {
					try {
						System.out.println(getInnerCookerName() + "厨师开始做菜：" + takeoutOrder.getContent());
						this.sleep(10000);
						System.out.println(getInnerCookerName() + "厨师做菜完成：" + takeoutOrder.getContent());
					} catch (InterruptedException e) {
						System.out.println(getInnerCookerName() + "厨师做" + takeoutOrder.getContent() + "时被打断！");
						e.printStackTrace();
					}
					restaurant.getLounge().innerCookerPutFnishedTakeoutOders(takeoutOrder, this);
				}
			} else {
				InnerOrders innerOrder = restaurant.cookerGetInnerOrder(this);
				if (innerOrder == null) {
					continue;
				} else {
					try {
						System.out.println(getInnerCookerName() + "厨师开始做菜：" + innerOrder.getContent());
						this.sleep(10000);
						System.out.println(getInnerCookerName() + "厨师做菜完成：" + innerOrder.getContent());
					} catch (InterruptedException e) {
						System.out.println(getInnerCookerName() + "厨师做" + innerOrder.getContent() + "时被打断！");
						e.printStackTrace();
					}
					restaurant.getWaiterLounge().innerCookerPutFinishedInnerOrders(innerOrder, this);
				}
			}
		}

	}

}
