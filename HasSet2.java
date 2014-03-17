
import java.util.HashSet;

public class HasSet2
{
	public static void main(String[] args)
	{
		HashSet hashset = new HashSet();
		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");
		hashset.add(s1);
		hashset.add(s2);

		System.out.println(hashset);
		
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
			Student s = (Student)obj;
			if(name.equals(s.name))
			{
				return true;
			}
		}
		return false;
	}


}



