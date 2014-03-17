public  class ArrayTest
{
	public static void main(String[] args)
	{
		int[] a = new int[100];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = i + 1;
		}
		for(int b = 0; b < a.length; b++)
		{
			System.out.println(a[b]);
		}

		Person[] p = new Person[3];

		System.out.println(p[1]);

		Student[] s = new Student[100];
		for(i = 0; i < s.length; i++)
		{
			s[i] = new Student();
			if(i % 2 == 0)
			{
				a[i].name = "zhangsan";
			}
			else
			{
				a[i].neme = "lisi";
			}
		}
			
		int[][] a = new int[2][3];

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 3;j++)
			{
				a[i][j] = a[][]
			}
		
		}

	}	
}

class Person
{
	int age;

	public Person(int age)
	{
		this.age = age;
	}
}

class student
{
	String name;
}
