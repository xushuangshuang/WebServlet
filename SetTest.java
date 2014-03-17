import java.util.HashSet;
import java.util.Iterator;

public class SetTest
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();

		Student s1 = new Student("benben");
		Student s2 = new Student("benben");
		set.add(s1);
		set.add(s2);
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			String value = (String)iter.next();
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

	public int hashCode()
	{
		return this.name.hashCode();
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(null != obj && obj instanceof Student)
		{
			Student ss = (Student) obj;
			if(name.equals(ss.name))
			{
				return true;
			}
		}
		return false;
	}
	

}
