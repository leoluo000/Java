package restaurant2;

import java.util.ArrayList;

/**
 * 餐馆
 */
public class Restaurant2 {

	Lounge lounge = new Lounge();
	WaiterLounge waiterLounge = new WaiterLounge();

	public Lounge getLounge() {
		return lounge;
	}

	public WaiterLounge getWaiterLounge() {
		return waiterLounge;
	}

	private ArrayList<TakeoutOrders> takeoutOrders = new ArrayList<>();
	private ArrayList<InnerOrders> innerOrders = new ArrayList<>();

	public ArrayList<TakeoutOrders> getTakeoutOrders() {
		return takeoutOrders;
	}

	public ArrayList<InnerOrders> getInnerOrders() {
		return innerOrders;
	}

	public synchronized void receivedTakeoutOrders(TakeoutOrders takeoutOrder) {
		System.out.println("来外卖订单了，单号为：" + takeoutOrder.getId() + "请厨师尽快处理订单！");
		takeoutOrders.add(takeoutOrder);
		this.notifyAll();
	}

	public synchronized void receivedInnerOrders(InnerOrders innerOrder) {
		System.out.println("来堂食订单了，单号为：" + innerOrder.getId() + "请厨师尽快处理订单！");
		innerOrders.add(innerOrder);
		this.notifyAll();
	}

	public synchronized TakeoutOrders cookerGetTakeoutOrders(Cooker cooker) {
		if (takeoutOrders.size() == 0) {
			try {
				System.out.println("外卖订单为空，厨师等待中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("厨师等待被打断！");
				e.printStackTrace();
			}
			return null;
		}
		TakeoutOrders takeoutOrder = takeoutOrders.remove(0);
		System.out.println(cooker.getCookerName() + "厨师得到外卖订单，订单：" + takeoutOrder.toString() + "准备做菜！");
		return takeoutOrder;
	}

	public synchronized InnerOrders takeoutCookerGetInnerOrder(Cooker cooker) {
		if (innerOrders.size() == 0) {
			try {
				System.out.println("堂食订单为空，厨师等待中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("厨师等待被打断！");
				e.printStackTrace();
			}
			return null;
		}
		InnerOrders innerOrder = innerOrders.remove(0);
		System.out.println(cooker.getCookerName() + "厨师得到堂食订单，订单：" + innerOrder.toString() + "准备做菜！");
		return innerOrder;
	}

	public synchronized InnerOrders cookerGetInnerOrder(InnerCooker cooker) {
		if (innerOrders.size() == 0) {
			try {
				System.out.println("堂食订单为空，厨师等待中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("厨师等待被打断！");
				e.printStackTrace();
			}
			return null;
		}
		InnerOrders innerOrder = innerOrders.remove(0);
		System.out.println(cooker.getInnerCookerName() + "厨师得到堂食订单，订单：" + innerOrder.toString() + "准备做菜！");
		return innerOrder;
	}

	public synchronized TakeoutOrders innerCookerGetTakeoutOrder(InnerCooker cooker) {
		if (takeoutOrders.size() == 0) {
			try {
				System.out.println("外卖订单为空，厨师等待中！");
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("厨师等待被打断！");
				e.printStackTrace();
			}
			return null;
		}
		TakeoutOrders takeoutOrder = takeoutOrders.remove(0);
		System.out.println(cooker.getInnerCookerName() + "厨师得到外卖订单，订单：" + takeoutOrder.toString() + "准备做菜！");
		return takeoutOrder;
	}

}
