public class PolyTest
{
	public static void main(String[] args)
	{
		Parent parent = new Parent();
		parent.sing();

		Parent child =  new Child();
		child.sing();
	}
}

class Parent
{
	/*
	public void sing()
	{
		System.out.println("parent is singing");
	}
	*/
}

class Child extends Parent
{
	public void sing()
	{
		System.out.println("child is singing");
	}
}
