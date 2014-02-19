public class Polytest3
{
	public static void main(String[] args)
	{
		Fruit f = new Pear();
		f.run();
		Pear d = (Pear)f;
		d.grow();
	}

}

class Fruit
{
	public void run()
	{
		System.out.println("fruit is running");
	}
}

class Pear extends Fruit
{
	public void run()
	{
		System.out.println("pear is running");
	}
	public void grow()
	{
		System.out.println("pear is growing");
	}
}
