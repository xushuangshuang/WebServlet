package com.shengsiyuan2;

import java.util.HashSet;

public class Lisi
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();

		Student s1 = new Student("zhangsan");
		Student s2 = new Student("zhangsan");

		set.add(s1);
		set.add(s2);

		System.out.println(set);

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

