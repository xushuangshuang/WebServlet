public class StaticTest5
{
	public static void main(String[] args)
	{
		Singleton singleton = Singleton.getInstence();
	}
}

class Singleton
{
	private static Singleton singleton = new Singleton();
	private singleton
	{
	
	}
	public static Singleton getInstance()
	{
		return singleton;
	}
}
