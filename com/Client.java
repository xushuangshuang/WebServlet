package com.bodejidi;

public class Client
{
	public static void main(String[] args)
	{
		LifeStyle life = new LifeStyle();
	       Environment environment = new Environment(life);
       		System.out.println(environment.book(1, 2));	       
	}
}
