import java.util.TreeSet;

public class TreeSetTest
{
	public static void main(String[] args)
	{
		TreeSet tree = new TreeSet();
		tree.add("A");
		tree.add("D");
		tree.add("H");
		tree.add("B");
		tree.add("C");
		System.out.println(tree);

		System.out.println("------------------");

		TreeSet set = new TreeSet();

		set.add(12);
		set.add(11);
		set.add(20);

		System.out.println(set);
	}
}

class people
{
	int name;
}
