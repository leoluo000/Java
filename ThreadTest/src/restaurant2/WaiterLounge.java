package restaurant2;

import java.util.ArrayList;

/**
 * 服务生休息室
 */
public class WaiterLounge {

	private ArrayList<InnerOrders> finishedInnerOrders = new ArrayList<>();

	public synchronized void innerCookerPutFinishedInnerOrders(InnerOrders innerOrder, InnerCooker cooker) {
		System.out.println(cooker.getInnerCookerName() + "厨师已完成堂食订单：" + innerOrder.toString() + "请服务生尽快送菜！");
		finishedInnerOrders.add(innerOrder);
		this.notifyAll();
	}

	public synchronized void CookerPutFinishedInnerOrders(InnerOrders innerOrder, Cooker cooker) {
		System.out.println(cooker.getCookerName() + "厨师已完成堂食订单：" + innerOrder.toString() + "请服务生尽快送菜！");
		finishedInnerOrders.add(innerOrder);
		this.notifyAll();
	}

	public synchronized InnerOrders waiterGetInnerOrders(Waiter waiter) {
		if (finishedInnerOrders.size() == 0) {
			try {
				System.out.println("堂食完成订单队列为空，服务生休息中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("服务生休息被打断！");
				e.printStackTrace();
			}
			return null;
		}
		InnerOrders innerOrder = finishedInnerOrders.remove(0);
		System.out.println(waiter.getWaiterName() + "服务生拿到做好的菜:" + innerOrder.getContent() + "准备送菜！");
		return innerOrder;
	}

}
