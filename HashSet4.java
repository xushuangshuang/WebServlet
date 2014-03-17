import java.util.HashSet;

public class HashSet4
{
	public static void main(String[] args)
	{
		HashSet hashSet = new HashSet();
		
		Student b1 = new Student("zhangsan");
		Student b2 = new Student("lisi");
		Student b4 = new Student("wangmazi");
		Student b3 = new Student("lisi");
		hashSet.add(b1);
		hashSet.add(b2);
		hashSet.add(b4);
		hashSet.add(b3);

		System.out.println(hashSet.add(b1));
		System.out.println(hashSet);
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
			Student ss = (Student)obj;
			if(name.equals(ss.name))
			{
				return true;
			}
		}
		return false;
	}

}




















