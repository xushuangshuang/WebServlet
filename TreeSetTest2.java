import java.util.Comparator;
import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetTest2
{
	public static void main(String[] args)
	{
		TreeSet tree = new TreeSet(new MyComparator());
		People p1 = new People(11);
		People p2 = new People(22);
		People p3 = new People(32);

		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		for(Iterator ite = tree.iterator(); ite.hasNext();)
		{
			People p = (People)ite.next();
			System.out.println(p.age);
		}

	}
}

class People
{
	int age;
	public People(int age)
	{
		this.age = age;
	}
	public String toString()
	{
		return String.valueOf(this.age);
	}
}

class MyComparator implements Comparator
{
	public int Comperator(Object obj1, Object obj2)
	{
		People peo1 = (People) obj1;
		People peo2 = (People) obj2;
		return peo1.age - peo2.age;
	}
}


