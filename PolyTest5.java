public class PolyTest5
{
	public void run (Car car)
	{
		car.run();
	}
	public static void main(String[] args)
	{
		PolyTest5 bb = new PolyTest5();
		Car a = new BMW();
		bb.run(a);
	}
}

class Car
{
	public void run()
	{
		System.out.println("Car is runing");
	}
}

class BMW extends Car
{
	public void run()
	{
		System.out.println("BMW is runing");
	}
}

class QQ extends Car
{
	public void run()
	{
		System.out.println("QQ is runing");
	}
}
