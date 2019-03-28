package enumclass;

public enum InterfaceGender implements GenderDesc{
	
	MALE("男")
	{
		public void info()
		{
			System.out.println("这个枚举值代表男性！");
		}
	},FEMALE("女")
	{
		public void info()
		{
			System.out.println("这个枚举值代表女性！");
		}
	};
	private final String name;
	private InterfaceGender(String name)
	{
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

}
