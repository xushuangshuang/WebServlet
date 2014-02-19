public class InteritenceTest2
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.run();
	}	
}

class Animal
{
	public void run()
	{
		System.out.println("animal ia runing");
	}
}

class Dog extends Animal
{

}
