public class FinalTest4
{
	public static void main(String[] args)
	{
		People finalTest4 = new People();
		finalTest4.people.name = "hehe";
	}
}

class People
{
	final Son people = new Son();	

}

class Son
{
	String name = "benben";

}
