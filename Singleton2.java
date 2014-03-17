public class Singleton2
{
	public static void main(String[] args)
	{
		Singleton sing = Singleton.single();
		Singleton song = Singleton.single();

		System.out.println(sing == song);
			
	}
	
}

class Singleton
{
	private static class classLoader
	{
		private static final Singleton singleton = new Singleton();
	}

	private Singleton()
	{
	
	}

	public static final Singleton single()
	{
		return classLoader.singleton;
	}
}
