package threa_synchronization;

public class DrawTest {

	public static void main(String[] args) {

		Account a = new Account("123", 0);
		new DrawThread("取钱甲", a, 200).start();
		new DespositThread("存钱甲", a, 800).start();
	}

}
