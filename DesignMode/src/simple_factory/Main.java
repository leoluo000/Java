package simple_factory;

public class Main {

	public static void main(String[] args) {

		HumanGardener human = new HumanGardener();
		try {
			human.factory("张三");
		} catch (WrongHumanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
