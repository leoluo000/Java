package threa_synchronization;

public class DrawThread extends Thread {

	private Account account;
	private double drawmoney;

	public DrawThread(String name, Account account, double drawmoney) {

		super(name);
		this.account = account;
		this.drawmoney = drawmoney;

	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.draw(drawmoney);
		}
	}
}
