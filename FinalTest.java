public class FinalTest
{
	public static void main(String[] args)
	{
		M m = new N();
		m.output();
	}
}

class M
{
	public final void output()
	{
		System.out.println("M");		
	}
}

class N extends M
{
	public void output()
	{
		System.out.println("N");
	}
}
