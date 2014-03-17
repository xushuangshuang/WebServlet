public class EqualsTest
{
	public static void main(String[] args)
	{
		Student tre = new Student("zhangsan");
		Student tre2 = new Student("wangwu");
		System.out.println(tre.equals(tre2));
	}
}

class Student
{
	public boolean equals(Object object)
	{
		if (this == object)
			return true;
		if(object instanceof Student)
		{
			
		}
		return false;
	}
}
