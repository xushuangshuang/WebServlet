package com.bodejidi;

public class Envirments
{
	private SortInterface sortInterface
		
	public void setSortInterface(SortInterface sortInterface)
	{
		this.sortInterface = sortInterface;
	}	

	public int getSortInterface()
	{
		return sortInterface;
	}

	public void setSortInterface(SortInterface sortInterface)
	{
		this sortInterface = sortInterface;
	}

	public void sort(List <people> list)
	{
		this  sortInterface.sort(list);
	}
}
