package com.bodejidi;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class SortId implements SortInterface
{
	public void sort(List <people> list)
	{
		Collections.sort(list, new MyComparator());
	}

	public class MyComparator implements Comparator
	{
		public int comparator(List b1, List b2)
		{
			return b1.id - b2.id;
		}	
	}
}
