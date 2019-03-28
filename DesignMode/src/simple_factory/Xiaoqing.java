package simple_factory;

public class Xiaoqing implements NvWa {

	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void eat() {
		System.out.println("小青的吃饭方法！");

	}

	@Override
	public void sleep() {
		System.out.println("小青的睡觉方法！");

	}

	@Override
	public void speak() {
		System.out.println("小青的说话方法！");

	}

}
