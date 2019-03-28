package restaurant2;

import java.util.ArrayList;

/**
 * 外卖小哥休息室
 */
public class Lounge {

	private ArrayList<TakeoutOrders> finishedTakeoutOrders = new ArrayList<>();

	public synchronized void cookerPutFnishedTakeoutOders(TakeoutOrders takeoutOrder, Cooker cooker) {
		System.out.println(cooker.getCookerName() + "厨师已经完成外卖订单:" + takeoutOrder.toString() + "请外卖小哥尽快领单！");
		finishedTakeoutOrders.add(takeoutOrder);
		this.notifyAll();
	}

	public synchronized void innerCookerPutFnishedTakeoutOders(TakeoutOrders takeoutOrder, InnerCooker cooker) {
		System.out.println(cooker.getInnerCookerName() + "厨师已经完成外卖订单:" + takeoutOrder.toString() + "请外卖小哥尽快领单！");
		finishedTakeoutOrders.add(takeoutOrder);
		this.notifyAll();
	}

	public synchronized TakeoutOrders laddieGetTakeoutOrders(Laddies laddie) {
		if (finishedTakeoutOrders.size() == 0) {
			try {
				System.out.println("完成外卖订单队列为空外卖小哥休息中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("外卖小哥休息被打断！");
				e.printStackTrace();
			}
			return null;
		}
		TakeoutOrders takeoutOrder = finishedTakeoutOrders.remove(0);
		System.out.println(laddie.getLaddiesName() + "外卖小哥获得订单:" + takeoutOrder.toString() + "准备送餐！");
		return takeoutOrder;
	}

}
