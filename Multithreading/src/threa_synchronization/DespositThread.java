package threa_synchronization;

public class DespositThread extends Thread {
	private Account account;
	private double despoitmoney;

	public DespositThread(String name, Account account, double despoitmoney) {

		super(name);
		this.account = account;
		this.despoitmoney = despoitmoney;

	}

	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			account.despoit(despoitmoney);
		}
	}
}
