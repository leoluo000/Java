package restaurant2;

import java.util.Date;
import java.util.Random;

/**
 * 堂食订单
 */
public class InnerOrders {

	private long id;
	private String content;
	private Date date;
	Random random = new Random();

	public InnerOrders(String content) {
		this.id = random.nextLong();
		this.content = content;
		this.date = new Date();
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

	@Override
	public String toString() {

		return "InnerOrder{" + "id:" + this.id + ";" + "content:" + this.content + ";" + "date:" + this.date + "}";

	}

}
