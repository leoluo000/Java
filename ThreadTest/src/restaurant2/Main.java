package restaurant2;

/**
 * 主函数
 */
public class Main {

	public static void main(String[] args) {

		Restaurant2 restaurant = new Restaurant2();
		Cooker cooker = new Cooker("外卖", restaurant);
		InnerCooker cooker1 = new InnerCooker("堂食", restaurant);
		cooker.start();
		cooker1.start();
		Laddies l1 = new Laddies("张三", restaurant);
		Laddies l2 = new Laddies("李四", restaurant);
		Laddies l3 = new Laddies("王五", restaurant);
		Waiter w1 = new Waiter("小张", restaurant);
		Waiter w2 = new Waiter("小李", restaurant);
		Waiter w3 = new Waiter("小王", restaurant);

		l1.start();
		l2.start();
		l3.start();
		w1.start();
		w2.start();
		w3.start();

		for (int i = 0; i <= 10; i++) {
			TakeoutOrders takeoutOrder = new TakeoutOrders("青椒肉丝", "隆1-001");
			restaurant.receivedTakeoutOrders(takeoutOrder);
		}
		for (int i = 0; i <= 10; i++) {
			InnerOrders innerOrder = new InnerOrders("红烧排骨");
			restaurant.receivedInnerOrders(innerOrder);
		}

	}

}
