package IFace;

public class Singleton {
	
	private static Singleton singleton = null;
	public static Singleton getSingleton()
	{
		if(singleton == null)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
	private Singleton()
	{
		
	}

}
