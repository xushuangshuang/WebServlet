public class InteritenceTest3
{
	public static void main(String[] args)
	{
		Grandpa son = new Father();
	}
}

class Grandpa
{
	public Grandpa()
	{
		System.out.println("grandpa");
	}
}

class Father extends Grandpa
{
	public Father()
	{
		System.out.println("Father");
	}
}

class Son extends Father
{
	public Son()
	{
		System.out.println("Son");
	}
}
