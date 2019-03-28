package threa_synchronization;

public class Account {

	private String accountNo;
	private double balance;
	private boolean flag = false;

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public int hashCode() {
		return accountNo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Account.class) {
			Account a = (Account) obj;
			return a.getAccountNo().equals(accountNo);
		}
		return false;

	}

	public synchronized void draw(double drawAmount) {
		try {
			if (!flag) {
				wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "取钱:" + drawAmount);
				balance -= drawAmount;
				System.out.println("取钱成功，余额为：" + balance);
				flag = false;
				notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void despoit(double despoitAmount) {
		try {
			if (flag) {
				wait();
			} else {
				System.out.println(Thread.currentThread().getName() + "存钱：" + despoitAmount);
				balance += despoitAmount;
				System.out.println("存钱成功，余额为：" + balance);
				flag = true;
				notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
