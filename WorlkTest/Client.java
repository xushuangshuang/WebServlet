package com.bodejidi;

import java.util.ArrayList;

public class Client
{
	public static void main(String[] args)
	{
		People people = new People();

		people.setId(123);
		people.setName("benben");
		people.setAge(78);

		ArrayList arrayList = new ArrayList();

		arrayList.add(people);

		SortId sort2 = new SortId();

		SortInterface sortInterface = new SortInterface(sort2);
		
		sort2ºññ.sort(arrayList);

		System.out.println(sortInterface.getId());


	}
}
