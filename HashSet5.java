import java.util.HashSet;
import java.util.Iterator;

public class HashSet5
{
	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(2);
		hashSet.add(2);
		hashSet.add(3);

		System.out.println(hashSet);

		System.out.println("------------");

		HashSet hashSet2 = new HashSet();
		Student b1 = new Student(22);
		Student b2 = new Student(33);
		Student b3 = new Student(44);
		Student b4 = new Student(55);

		hashSet2.add(b1);
		hashSet2.add(b2);
		hashSet2.add(b3);
		//hashSet2.clear();
	
		System.out.println(hashSet2.add(b4));
		System.out.println(hashSet2);
		System.out.println(hashSet2.size());
		
		for(Iterator ite = hashSet2.iterator(); ite.hasNext();)
		{
			Student p = (Student)ite.next();
			System.out.println(p.age);	
		}
		
	}

}

class Student
{
	int age;
	public Student(int age)
	{
		this.age = age;
	}
	
	public String toString()
	{
		return String.valueOf(this.age);
	}
	
}






















