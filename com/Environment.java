package com.bodejidi;

public class Environment
{
	private Strategy strategy;

	public Environment(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public Strategy setStrategy(Strategy strategy)
	{
		return this.strategy = strategy;
	}

	public Strategy getStrategy()
	{
		return strategy;
	}

	public int book(int g, int h)
	{
		return strategy.book(g, h);
	}
}
