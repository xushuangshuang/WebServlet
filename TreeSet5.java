import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;


public class TreeSet5
{
	public static void main(String[] args)
	{
		/*
		TreeSet treeSet = new TreeSet();

		treeSet.add(12);
		treeSet.add(23);
		treeSet.add(33);

		System.out.println(treeSet);
		*/	
		TreeSet treeSet2 = new TreeSet(new MyComparator());
		Student b1 = new Student("zhangsan");
		Student b2 = new Student("lisi");
		Student b3 = new Student("wangmazi");

		treeSet2.add(b1);
		treeSet2.add(b2);
		treeSet2.add(b3);
		for(Iterator ite = treeSet2.iterator(); ite.hasNext();)
		{
			Student value = (Student)ite.next();
			System.out.println(value);
		}
	}
}

class Student 
{
	String name;
	public Student(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return this.name;
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj, Object obj2)
	{
		Student a1 = (Student)obj;
		Student a2 = (Student)obj2;

		return a1.name.compareTo(a2.name);
	}
}



























