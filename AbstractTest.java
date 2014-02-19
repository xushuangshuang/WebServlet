public class AbstractTest
{
	public static void main(String[] args)
	{
		Sharp tri = new Triangle(3, 2);
		tri.sharpArea();
	}
}

abstract class Sharp
{
	public abstract void sharpArea();
}

class Triangle extends Sharp
{	
	int wide;
	int higth;

	public Triangle(int wide, int higth)
	{
		this.wide = wide;
		this.higth = higth;
	}
	
	public void sharpArea()
	{
		System.out.println(wide * higth / 2);
	}
}
