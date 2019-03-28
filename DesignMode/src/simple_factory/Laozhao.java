package simple_factory;

public class Laozhao implements NvWa {

	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void eat() {
		System.out.println("老赵的吃饭方法！");

	}

	@Override
	public void sleep() {
		System.out.println("老赵的睡觉方法！");

	}

	@Override
	public void speak() {
		System.out.println("老赵的说话方法！");

	}

}
