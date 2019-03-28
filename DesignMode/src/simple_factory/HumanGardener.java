package simple_factory;

public class HumanGardener {

	public static NvWa factory(String which) throws WrongHumanException {

		if (which.equalsIgnoreCase("张三")) {
			return new Zhangsan();
		} else if (which.equalsIgnoreCase("李四")) {
			return new Lisi();
		} else if (which.equalsIgnoreCase("小红")) {
			return new Xiaohong();
		} else if (which.equalsIgnoreCase("小青")) {
			return new Xiaoqing();
		} else if (which.equalsIgnoreCase("老赵")) {
			return new Laozhao();
		} else {
			throw new WrongHumanException("查无此人！");
		}
	}

}
