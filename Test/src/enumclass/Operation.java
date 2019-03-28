package enumclass;

public enum Operation {

	PLUS
	{
		public double eval(double a , double b)
		{
			return a+b;
		}
	},
	MINUS
	{
		public double eval(double a , double b)
		{
			return a-b;
		}
	},
	TIMES
	{
		public double eval(double a , double b)
		{
			return a*b;
		}
	},
	DIVIDE
	{
		public double eval(double a , double b)
		{
			return a/b;
		}
	};
	public abstract double eval(double a , double b);
	public static void main(String[] args)
	{
		System.out.println(Operation.PLUS.eval(3, 5));
		System.out.println(Operation.MINUS.eval(3, 5));
		System.out.println(Operation.TIMES.eval(3, 5));
		System.out.println(Operation.DIVIDE.eval(3, 5));
	}

}
