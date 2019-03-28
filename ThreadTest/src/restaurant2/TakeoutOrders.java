package restaurant2;

import java.util.Date;
import java.util.Random;

/**
 * 外卖订单
 */
public class TakeoutOrders {

	private long id;
	private String content;
	private Date date;
	private String address;
	Random random = new Random();

	public TakeoutOrders(String content, String address) {
		this.id = random.nextLong();
		this.content = content;
		this.date = new Date();
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public Date getDate() {
		return date;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {

		return "TakeoutOrder{" + "id:" + this.id + ";" + "content:" + this.content + ";" + "date:" + this.date + ";"
				+ "address:" + this.address + "}";

	}

}
